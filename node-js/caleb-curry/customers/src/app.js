const express = require('express');
const app = express();
const mongoose = require('mongoose');
const Customer = require('./models/customers');

require('dotenv').config();;
mongoose.set('strictQuery', false);
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

const PORT = process.env.PORT || 3000;
const CONNECTION = process.env.CONNECTION;

const customer = new Customer({
  name: "Caleb V2",
  industry: "marketing"
});

app.get('/', (req, res) => {
  res.send(customer);
  res.send("Added")
});

app.post('/', (req, res) => {
  res.send(req.body  + req.body);
});

app.get('/api/customers', async(req, res) => {
  const result = await Customer.find();
  res.send({"customers": result});
});

app.post('/api/customers', async(req, res) => {
  const customer = new Customer({
    name: req.body.name,
    industry: req.body.industry
  });
  customer.save();
  res.status(201).json({customer});

});

app.get('/api/customers/:id/:name', async(req,res) => {
  res.json({
    requestParams: req.params,
    requestQuery: req.query
  })
});

const start = async() => {
  try {
    await mongoose.connect(CONNECTION);

    app.listen(PORT, () => {
      console.log("App listeining on " + process.env.PORT);
    });
  } catch(e) {
    console.log(e.message);
  }
  
}

start();
