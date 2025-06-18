const mysql = require('mysql');
const http = require('http');
const express = require('express');

const app = express();
const PORT = 3000;

var con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "",
  database: "test_database"
});

con.connect(function(err) {
  if(err) throw err.message; 
});

let sqlResult = null;
con.query("SELECT * FROM test_table", function(err, result, fields) {
  if(err) throw err;

  sqlResult = result;
  console.log(sqlResult);
});

app.get('/', (req, res) => {
  res.send('WORKING SERVER');
})

app.get('/all', (req, res) => {
  console.log('api hit');
  
  console.log(sqlResult);
  res.send(sqlResult);
})

app.listen(PORT, ()=>{
  console.log("SERVER RUNNING ON "+PORT);
});