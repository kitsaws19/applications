<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- 
<script src=
"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"
        onload="loaded=true;">
function user() 
{ 
luser=document.getElementByName("name").value; 
var regex=/^[A-Z a-z]+$/; 
if(!regex.test(luser)) 
{ alert("alphabets only"); 
} 
} 
</script> 
-->

<script>
	var loaded = false;
</script>
<script src=
"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"
		onload="loaded=true;">
</script>
<h1 style="color:green;">
	GeeksforGeeks
</h1>
<p id="GFG_UP">
</p>
<button onclick="gfg_Run()">
	Click here
</button>
<p id="GFG_DOWN">
</p>
<script>
	var el_up = document.getElementById("GFG_UP");
	var el_down = document.getElementById("GFG_DOWN");

	el_up.innerHTML = "Click on the button to check "
		+ "whether script is loaded or not.";

	function gfg_Run() {
		if (loaded) {
			el_down.innerHTML = "Loaded Successfully!";
		}
		else {
			el_down.innerHTML = "Not loaded!";
		}
	} 	 
</script>

</head>
<body bgcolor="#00FFFF">
  <form action="MyServlet" method="post">
    <h1 align="center">Add Doctor</h1>
    <h1>
      <a href="index.jsp">List Doctors</a>
    </h1>
    <table border="1" align="center" cellpadding="5"
      style="font-size: 200%; font-family: inherit; font-style: normal; background-color: window;">
      <tr>
        <td>Name</td>
        <td><input type="text" name="name"  onblur="user(this.value)"></td>
      </tr>
      <tr>
        <td>Speciality</td>
        <td><input type="text" name="speciality"></td>
      </tr>
      <tr>
        <td>Email</td>
        <td><input type="text" name="email"></td>
      </tr>
      <tr>
        <td>City</td>
        <td><input type="text" name="city"></td>
      </tr>
      <tr>
        <td>Country</td>
        <td><input type="text" name="country"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" name="Action" value="Add Doctor"></td>
      </tr>
    </table>
  </form>
</body>
</html>