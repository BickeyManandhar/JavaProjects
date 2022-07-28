<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<center><img src="images/welcome.jpg" alt="welcome" width="800" height="300"></center>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Congratulation</title><br>
</head>
<body>

<h3 style="color:black;"><center>Congratulation you have successfully logged in.</center> <hr width="700px;" color="black" align="center"  ></h3> <br>


<div class="container">
  <div class="table-responsive">
    <table class="table table-bordered">
      <thead>
        <tr>
          <th>#</th>
          <th>Name</th>
          <th>Email Address</th>
          <th>Password</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>1</td>
          <td>${name}</td>
          <td>${email}</td>
          <td>${password}</td>
        </tr>
      </tbody>
    </table>
    <a href="getrecords">Click here to display all the records.</a>
  </div>
</div>
</body>
</html>