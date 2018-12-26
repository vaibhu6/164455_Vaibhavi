var add = require('./add');
var subs = require('./sub');
var mult = require('./mul');
var div = require('./div');


var firstOperand = +process.argv[2]
var secondOperand = +process.argv[3]

add (firstOperand,secondOperand);
mult (firstOperand,secondOperand);
div (firstOperand,secondOperand);
subs (firstOperand,secondOperand);