var express = require('express');
var CookieParser = require('cookie-parser');
var app = express();
app.use(CookieParser());

//basic route for homepage
app.get('/',(req,res)=>{
    res.status(200).send("Hello world");
})

//JSON object added to cookies

var users ={
    name:"kannan",
    age:"24"
}

//route for adding cookies
app.get('/setuser',(req,res)=>{
    res.cookie('userData',users);
    // res.cookie(cookie_name,'value',{expire:4000 + Date.now()});
    res.status(200).send('user data added to cookies');
})

//Iterate users data fromcookie
app.get('/getuser',(req,res)=>{
    res.status(201).send(req.cookies);//shows all cookies
})

app.get('/logout', (req, res)=>{ 
    //it will clear the userData cookie 
    res.clearCookie('userData'); 
    res.send('user logout successfully'); 
    }); 

app.listen(3000,()=>{
    console.log("Server connected on 3000");;
    
})