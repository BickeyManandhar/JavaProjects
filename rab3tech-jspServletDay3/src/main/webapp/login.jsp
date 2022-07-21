<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<form action="LoginServlet" method="post">
<h2>Login form</h2>
<h1 style="color:red;">${message}</h1><br>
<b><label for ="usrnm"> Username:</label> </b> <br><input type="text" name="uname"><br>
<b><label for ="pswrd">Password:</label> </b> <br><input type="password" name="upassword"><br><br>
<input type="submit" name="Submit"> <br>
<input type="reset" name="Reset">
</form>
</body>
</html>