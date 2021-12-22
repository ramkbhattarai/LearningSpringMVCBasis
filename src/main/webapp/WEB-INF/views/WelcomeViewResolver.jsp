<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
<h1>Welcome</h1>
<hr>
<br>
<h2>${name}</h2>
<form action="order">
<p>Please let us know what you want to have today?
<input name="food" type="text" placeholder="foodItem">
<input name="submit" type="submit">
</p>
</form>
</body>
</html>