var fs = require("fs");
fs.readFile('text.text',function(err,data){
    if(err){
        return console.error(err);
    }
    console.log("Asynchronous read:" + data.toString());
});