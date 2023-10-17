var http = require('http')
var datemodule = require('./firstmodule');
http.createServer(function (req, res) 
{
    res.write("welcome to the day now the time is:" + datemodule.currentDateTime());
    res.end();
    }).listen(8082);