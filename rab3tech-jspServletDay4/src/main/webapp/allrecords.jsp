
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html

<html>
<head>
<meta charset="UTF-8">
<center><img src="images/welcome.jpg" alt="welcome" width="800" height="300"></center>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<title>All records</title>
</head>
<body>
${success}
${unsuccess}

<h3 style="color:black;"><center>List of all records.</center> <hr width="700px;" color="black" align="center"  ></h3> <br>
<div class="container">
  <div class="table-responsive">
    <table class="table table-bordered">
      <thead>
        <tr bgcolor="green">
          <th>Name</th>
          <th>Email Address</th>
          <th>Password</th>
          <th colspan=2>Action (edit/delete)</th>
        </tr>
      </thead>
      <tbody>
      <c:forEach items="${userList}" var="usr">
        <tr>
          <td>${usr.name}</td>
          <td>${usr.email}</td>
          <td>${usr.password}</td>
          <td><a href="PreEditServlet?email=${usr.email}"><button type="button" class="btn btn-primary"><img src="images/edit.png" alt="edit" width="20" height="20"></button></a></td>
          <td><a href="DeleteServlet?email=${usr.email}"><button type="button" class="btn btn-danger"><img src="images/delete.png" alt="delete" width="20" height="20"></button></a></td>
        </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</div>
</body>
</html>