var express= require('express')();

express.get('/home',function(req,res)
{
  res.send("Hello World!");
});
var san=+process.argv[2];
 express.listen(san);
