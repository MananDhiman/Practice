const http = require('http');

// first param is request, second is response
const server = http.createServer((r2, d2) => {
  d2.statusCode = 200;
  d2.setHeader('Content-Type', 'text/html');
  d2.end('<h1>Hello, Node</h1>')
});

server.listen(3000, () => {
  console.log('Server Running');
});