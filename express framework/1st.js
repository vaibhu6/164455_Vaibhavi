var express=require("express")();

express.get('/',(req,res)=>{res.send("Hello, world!")});

express.listen(3000);
