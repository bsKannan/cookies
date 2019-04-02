var express = require('express');
var app = express();
app.get('/api',(req,res)=>{
    // res.send('<p>Username:'+req.query['first_name']+'</p><p>Lastname:'+req.query['last_name']+'</p>')

    res.send('<p>Firstname:'+req.query['firstname']+'</p><p>Lastname:'+req.query['lastname']+'</p><p>Password:'+req.query['password']+'</p><p>AboutYou:'+req.query['aboutyou']+'</p>')
})
  

app.listen(8000,()=>{
    console.log("connected");
    
})