const express = require('express')
const bodyParser = require('body-parser')
const app = express()
const port = 3000
const db = require('./queries')

app.use(bodyParser.json())
app.use(
    bodyParser.urlencoded({
        extended: true,
    })
)



app.get('/',(req, res) => {
    res.json({
        Server:"Node JS",
        Database:"PostgreSQL",
        Host:"Endeavour OS"
    })
})

app.listen(port, "0.0.0.0", () => {
    console.log(`App running on ${port}`)
})

// app.listen(3000,'192.168.1.17' || 'localhost',function() {
//     console.log('Application worker ' + process.pid + ' started...');
// });

app.get('/users', db.getUsers)
app.post('/user', db.getUserById)
app.post('/newUser',db.createUser)
app.post('/deleteUser',db.deleteUser)
