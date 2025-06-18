const mongoose = require('mongoose');
mongoose.set('strictQuery', false);

const express = require('express');
const app = express();

const PORT = process.env.PORT || 3000;

const start = async() => {
  try {
    await mongoose.connect('mongodb://127.0.0.1:27017/local');

    app.listen(PORT, () => {
      console.log("App listeining on " + PORT);
    });
  } 
  catch(e) {
    console.log(e.message);
  }
}

app.get('/', async (req, res) => {
  const arr = await mongoose.connection.db.listCollections().toArray();
  res.status(200).send({arr});
});

start();



