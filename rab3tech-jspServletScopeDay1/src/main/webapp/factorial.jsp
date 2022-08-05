<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Factorial Calculator</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container">
<img src="images/factorial.jpg" alt="factorial img">
User: ${email}
  <h2>Find Factorial</h2>
  <form action="Factorial" method="post">
    <div class="form-group">
      <label for="num">Enter a number to find its factorial: </label>
      <input type="text" class="form-control" placeholder="Enter a number" name="num">
    </div>
    <button type="submit" class="btn btn-danger">Click here to find factorial.</button>
  </form><br> <br>
   <label for="num"> Output: </label>
  <input type="text" class="form-control" value="The factorial of ${num} is ${num1}" disabled>
</div>
</body><br>
<!-- using session scope we can get our data in another page too until the session is not expired-->
<h5><a href="result1.jsp">Click here to get your result in another page.</a></h5>
</html>