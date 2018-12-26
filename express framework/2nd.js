var express= require('express')();

express.get('/:year/:id',function(req,res)
{
  var birthyear=req.params.year-req.params.id;
  res.send("The year you were born is " + birthyear);
});
express.listen(3000);
