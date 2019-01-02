//Load express
const express = require("express");
const app = express();

//Load bodyParser
const bodyParser = require ("body-parser");

app.use(bodyParser.json());

//Load Mongoose
const mongoose = require("mongoose");

require("./book")
const book = mongoose.model("book");

//Connect Mongoose
mongoose.connect(
"mongodb://vaibhu6:database@123@ds135956.mlab.com:35956/booksservice",() =>{
  console.log("The database is connected");
})


app.get('/',(req,res) => {
  res.send("This is our main endpoint!");
})

//Create func
app.post('/book',(req,res) => {
  var newBook ={
      title : req.body.title,
      author : req.body.author,
      numberPages :req.body.numberPages,
      publisher : req.body.publisher
  }
    //create a new book
var book1 = new book(newBook)
   book1.save().then(() =>{
     console.log("New book created!")
   }).catch((err) => {
     if(err){
       throw err;
     }
   })
   res.send("New book created");
} )

// var MongoClient = require('mongodb').MongoClient;
// //Create a database named "mydb":
// var url = "mongodb://localhost:27017/mydb";
//
// MongoClient.connect(url, function(err, db) {
//   if (err) throw err;
//   console.log("Database created!");
//   db.close();
// });


app.listen(3000 ,() => {
  console.log("Up and running! --This is our books service");
});
