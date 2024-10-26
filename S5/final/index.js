const express = require('express');
const app = express();
const path = require('path');
const port = 3000;

const mysql = require('mysql');

const config = {
    host: 'localhost',
    user: 'odc',
    password: 'odc123',
    database: 'odc'
}

const db = mysql.createConnection(config);

db.connect((err) => {
    if (err){
        console.log('impossible de se connecter a la base de donnee');
        return;
    }

    console.log('Connexion a ODC effectuée');
})

app.use(express.json());
app.use(express.urlencoded({extended: true}))

app.use('/bootstrap', express.static(path.join(__dirname, 'node_modules/bootstrap/dist')))

app.get("/", (request, response) => {
    response.sendFile(path.join(__dirname, 'index.html'));
})

app.post('/save', (request, response) => {
    const {id, nom, telephone} = request.body;

    if (!nom || nom === '' || !telephone || telephone === ''){
        response.json({message: "Vous devez des donnee des valeurs pour chaque champs"});
        return;
    }

    if (id){
        db.query('update person set nom = ?, telephone = ? where id = ?',[nom, telephone, id], (err, result) => {
            if (err){
                console.log("Impossible de modifier l'enregistrement: " + id);
                console.log(err);
                return;
            }

            response.json({data: result});
        })

        return;
    }

    db.query(
        `insert into person (nom, telephone) values(?, ?)`,
        [nom, telephone],
        (er, result) => {
        if (er){
            console.log("Impossible d'enregistrer les donnees", er);
            return;
        }

        console.log('Donnee enregistree avec succes: ', result);

        response.json(result);
    })

})

app.get('/list', async (request, response) => {
    db.query('select * from person', (err, results) => {
        if (err){
            console.log("Impossible de recuperer les donees ", err);
            return;
        }

        response.json({data: results});
    })
})

app.delete('/delete/:id', (req, res) => {
    const param = req.params.id;
    db.query('delete from person where id = ?', [param], (err, result) => {
        if (err){
            console.log("Impossible d'effectuer la suppresion");
            return;
        }

        res.json("Suppression effectuée avec succes");
        console.log('Suppresion de la personne avec id: ' + param + ' effectuée')
    });
})

app.get(`/person/:id`, (req, res) => {
    const param = req.params.id;

    db.query('select * from person where id = ?', [param], (err, result) => {
        if (err){
            console.log('impossible de trouver la personne avec id ', param);
            return;
        }

        res.json({data: result});
    })
})


app.listen(port, () => {
    console.log(`server set up and running at localhost:${port}`);
})
