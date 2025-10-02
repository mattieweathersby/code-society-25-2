//import the http module to create a server
const http = require('http');

//import the express module to handle routing
const express = require('express');
const app = express();

const PORT = 3000;

app.get('/', (req, res) => {
    res.status(200).send(`Server is running on port ${PORT}\n`);
});

// Serve static files from the 'public' directory
app.use(express.static('public'));

app.listen(PORT, '0.0.0.0', () => {
    console.log(`Express server is running on port ${PORT}`);
});