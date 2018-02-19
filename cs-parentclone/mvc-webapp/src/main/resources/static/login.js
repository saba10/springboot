function validate(){
		var username = document.getElementById("username").value;
		var password = document.getElementById("password").value;
		if ( userid == "dilip" && pswd == "mehta"){
		alert ("Login successfully");
		window.location = "AdminHome.html";
		return false;
			
		}
		else{
			alert("Wrong Username and Password");
			return false;
		}
} 