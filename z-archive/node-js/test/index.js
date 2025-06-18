const express = require('express');
const app = express();
const PORT = 3000;

app.get('/{id}', function(req, res) {
    res.send({
        "message": req,
    });
});

app.listen(PORT, function() {
    console.log("Works");
    console.log("PORT ", PORT);
});
