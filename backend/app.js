const express = require('express');
const fetch = require('node-fetch');
const app = express();
const port = 3000;

app.get('/api/usuarios/:codigoUsuario', (req, res) => {
  const codigoUsuario = req.params.codigoUsuario;
  const apiUrl = `https://200.105.154.18:5901/api/Alumnos/${codigoUsuario}`;

  fetch(apiUrl)
    .then(response => response.json())
    .then(data => {
      res.send(data);
    })
    .catch(error => {
      console.log('Error:', error);
      res.status(500).send('Internal Server Error');
    });
});

app.listen(port, () => {
  console.log(`Backend listening at http://localhost:${port}`);
});

