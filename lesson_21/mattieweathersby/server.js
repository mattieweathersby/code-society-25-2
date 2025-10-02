//import the http module to create a server
const http = require('http');

//import the express module to handle routing
const express = require('express');
const app = express();

//create a server that listens on port 3000 and responds with a message
const server = http.createServer((req, res) => {
    const PORT = 3000;
    res.writeHead(200, { 'Content-Type': 'text/plain' });
    res.end(`Server is running on port ${3000}\n`);
});

//tell express to serve files from the 'public' directory
app.use(express.static('public'));



app.listen(3000, () => {
    console.log('Express server is running on port 3000');
});