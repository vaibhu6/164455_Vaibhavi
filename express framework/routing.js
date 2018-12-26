var express=require('express')();

express.get('/hello',function(req,res)
{
    res.send("Hello World!!!");
});
express.post('/hello', function(req, res){
   res.send("You just called the post method at '/hello'!\n");
});

express.listen(1337);
