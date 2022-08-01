<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html>
<head>
<title>Edit page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container">
<h1 style="color:red;">${msg}</h1>
<img src="images/registration.jpg" alt="Login Image" width="400" height="200">
  <h2>Edit form</h2><hr>
  <form action="EditServlet" method="post">

  <div class="form-group">
      <label for="name">Name:</label>
      <input type="text" class="form-control"  name="name" value="${ud.name}">
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="hidden" class="form-control"  name="email" value="${ud.email }">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="text" class="form-control"  name="password" value="${ ud.password}">
    </div>

    <button type="submit" class="btn btn-danger">Submit</button>
    </form>
</div>

</body>
</html>