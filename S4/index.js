const express = require('express');
const path = require('path');

const odc = express();

odc.use(express.json())
odc.use(express.urlencoded({extended: true}))

odc.use(express.static(path.join(__dirname, 'public')));


odc.use('/bootstrap', express.static(path.join(__dirname, 'node_modules/bootstrap/dist')))

odc.get("/", (request, response) => {
    response.sendFile(path.join(__dirname, 'index.html'))
})

odc.get('/home', (req, res) => {
    res.sendFile(path.join(__dirname, 'public', 'home.html'))
})

odc.get('/error', (req, res) => {
    res.sendFile(path.join(__dirname, 'public', 'error.html'));
})

odc.post('/login', (request, response) => {
    const {username} = request.body;


    if(String(username).toLowerCase() === 'odc'){
        response.redirect('/home');
    }else{
        response.redirect('/error');
    }

})

odc.listen(3000, () => {
    console.log("ODC server started and running")
})

