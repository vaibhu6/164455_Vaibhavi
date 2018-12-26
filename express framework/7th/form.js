var express=require('express')();
var bodyParser = require('body-parser');

express.get('/form',function(req,res){
  res.send('You sent the name "' + req.body.name + '".');
});

express.listen(1337);
