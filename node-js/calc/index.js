const express = require('express');
const app = express();

app.get('/', (req, res) => {
  res.status(200).send(
    [
      {
        "name": "A",
        "age": 20
      },
      {
        "name": "B",
        "age": 30
      },
      {
        "name": "C",
        "age": 40
      },
      {
        "name": "D",
        "age": 50
      },
    ]
    
  );
});

app.listen('3000');

