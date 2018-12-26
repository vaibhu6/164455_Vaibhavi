var express= require('express')();

express.get('/year/',function(req,res)
{
var age=req.query.age;
var date=new Date();
var currentyear= date.getFullYear();
var birTthyear=currentyear-age;
res.send("The year you were born: " + birthyear);
});
express.listen(3000);
