const express = require('express');

const path = require('path');
const app = express();
const port = 3000;

app.use('/bootstrap', express.static(path.join(__dirname, 'node_modules/bootstrap/dist')))
app.use(express.json());
app.use(express.urlencoded({extended: true}));
app.use(express.static(__dirname));


app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'index.html'));
})

app.post('/submit', (req, res) => {
    const {username, password} = req.body;
    
    console.log('Form data received: ', req.body);

    res.json({message: 'Form data received successfully', data: {username, password}})
})

app.listen(port, () => {
    console.log(`server running at http://localhost:${port}`)
})