var express = require('Express');
var app = express();

var things = require('./rout.js');

//both index.js and things.js should be in same directory
app.use('/things', things);

app.listen(3000);
