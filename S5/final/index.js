const express = require('express');
const app = express();
const path = require('path');
const port = 3000;

const mysql = require('mysql');

const db = mysql.createConnection({
    host: 'localhost',
    user: 'odc',
    password: 'odc123',
    database: 'odc'
});

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
    const {nom, telephone} = request.body;
    db.query(
        'insert into person (nom, telephone) values(?, ?)',
        [nom, telephone],
        (er, result) => {
        if (er){
            console.log("Impossible d'enregistrer les donnees", er);
        }

        console.log('Donnee enregistree avec succes: ', result);
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


app.listen(port, () => {
    console.log(`server set up and running at localhost:${port}`);
})
