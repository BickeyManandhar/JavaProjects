<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Congratulation</title>
</head>
<body>
<h3 style="color:black;"><center>Congratulation you have successfully signed up.</center> <hr width="700px;" color="black" align="center"  ></h3> <br>
${msg}<br>
<div class="container">
  <div class="table-responsive">
    <table class="table table-bordered">
      <thead>
        <tr>
          <th>Name</th>
          <th>Email Address</th>
          <th>Password</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>${usrdto.name}</td>
          <td>${usrdto.email}</td>
          <td>${usrdto.password}</td>
        </tr>
      </tbody>
    </table>
    <a href="getrecords">Click here to display all the records.</a>
  </div>
</div>
</body>
</html>