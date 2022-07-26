<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
</head>
<body>

Sample Application

<h1>Add record<h1>
<form action="add" method="get">
 
  <input type="number" id="lname" name="age"><br><br>
<input type="text" id="lname" name="name"><br><br>
  <input type="submit" value="Submit">
</form>


<h1>Show record<h1>
<form action="showrecord" method="get">
  <input type="submit" value="Submit">
</form>


<h1>getrecordbyid<h1>
<form action="getrecordbyid" method="get">
 
  <input type="number" id="lname" name="age"><br><br>

  <input type="submit" value="Submit">
</form>



<h1>Delete recordbyid<h1>
<form action="getrecordbyid" method="get">
 
  <input type="number" id="lname" name="age"><br><br>

  <input type="submit" value="Submit">
</form>





</body>
</html>