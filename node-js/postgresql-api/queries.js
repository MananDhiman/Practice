const Pool = require('pg').Pool
const pool = new Pool({
    user: 'postgres',
    host: 'localhost',
    database: 'test',
    password: '1234',
    port: 5432
})

function getUsers(request, response){
  pool.query('SELECT * FROM students ORDER BY id ASC', (error, results) => {
    if (error) {
      throw error
    }
    response.status(200).json(results.rows)
  })
}

const getUserById = (request, response) => {
  console.log("\n\nPrinting REQUEST:\n\n")
  const id = request.body.id

  pool.query(`SELECT * FROM students WHERE id = ${id}`, (error, results) => {
    if (error) {
      throw error
    }
    response.status(200).json(results.rows)
  })
}

const createUser = (request, response) => {

  const id = request.body.id
  const name = request.body.name

  pool.query(`INSERT INTO students VALUES ('${id}', '${name}')`, (error, results) => {
    if (error) throw error

    response.status(200).json({message: `ADDED`})
  })

}

const deleteUser = (request, response) => {
  const id = request.body.id
  pool.query(`DELETE FROM students WHERE id='${id}'`, (error, results) => {
    if (error) throw error

    response.status(200).json({message: `Student with ID: '${id} DELETED'`})
  })
}

module.exports = {
    getUsers,
    getUserById,
    createUser,
    deleteUser
}
