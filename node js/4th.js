var fs = require('fs');

fs.appendFile('mynewfile1.txt', 'hey ho! lets go', function (err) {
  if (err) throw err;
  console.log('hey ho! lets go');
  console.log('The file was saved!');
});