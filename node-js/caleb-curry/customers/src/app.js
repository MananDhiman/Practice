const express = require('express');
const app = express();
const PORT = 3000;

app.get('/', (req, res) => {
  res.send('Express Working with npm start');
});

app.listen(PORT, () => {
  console.log("App listeining on " + PORT);
});