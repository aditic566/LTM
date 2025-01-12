function login() {
   
    // You can perform login validation and authentication here
    // For simplicity, let's just display an alert
    var username=document.getElementById('loginUsername').value;
    var password=document.getElementById('loginPassword').value;
    if(username===''){
        alert('Username shouldnot be empty');
        return;
    }
    if(password===''){
        alert('Password shouldnot be empty');
        return;
    }

    console.log('Username:'+username);
    console.log('Password:'+password);
}

function register() {
   

    // Frontend validation for registration form
    

    // Validate email format
    
    // Validate username (no special characters)
    

    // Validate password (at least 8 characters, one capital letter, and one numeric)
    
}
module.exports = { login, register };
