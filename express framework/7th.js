var express=require('express')();

express.get('/',function(req,res){
  res.send("Get Method");
});

express.post('/',function(req,res){
    res.send("Post Method");
});

express.patch('/',function(req,res){
    res.send("Patch Method");
});

express.delete('/',function(req,res){
    res.send("Delete Method");
});

express.listen(3000);
