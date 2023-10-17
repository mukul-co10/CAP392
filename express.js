var express = require('express');
var app = express();
app.get('/',function(reg,res){
    res.send('Hello Express');
});
app.post('/author',function(reg,res){
    res.send('Author name');
});
app.listen(8080);