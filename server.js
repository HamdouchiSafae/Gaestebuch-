// server.js

const express = require('express');
const cors = require('cors');
const app = express();
const port = 8080;

// CORS aktivieren
app.use(cors());

// Deine Routen und Middleware hier...

app.get('/api/data', (req, res) => {
    res.json({message: 'Daten vom Backend'});
});

// Server starten
app.listen(port, () => {
    console.log(`Der Server läuft auf http://localhost:8080`);
});
