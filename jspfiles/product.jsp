<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
<h1>Product Information</h1>
<form action="ProductController" method="post">
PID:<input type="text" name="pid"><br>
Name:<input type="text" name="pname"><br>
Price:<input type="text" name="price"><br>
<input type="submit" value="ADDProduct">
</form>
</body>
</html>
