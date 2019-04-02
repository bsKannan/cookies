var express = require('express');
var bodyParser = require('body-parser');
var CookieParser = require('cookie-parser');

var app = express();
app.use(CookieParser());
app.get('/cookieset',(req,res)=>{
    res.cookie('cookie_name','cookie_value');
    res.cookie('company','javatpoint');
    res.cookie('name','anusuya');

    res.status(200).send('Cookie is set');
})

app.get('/cookieget',(req,res)=>{
    res.status(200).send(req.cookies);
})

app.get('/',(req,res)=>{
    res.status(200).send("Welcome to javapoint");
})

app.listen(3000,()=>{console.log("coonectedcooki");
})