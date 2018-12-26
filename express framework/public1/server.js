// server.js

const hbs = require('express-hbs');
const path = require('path');

app.use(express.static('public'));

app.engine('hbs', hbs.express4({
   partialsDir: __dirname + '/views/partials'
 }));
app.set('view engine', 'hbs');
app.set('views', __dirname + '/views');
