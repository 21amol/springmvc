<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
	<h1 class="text-center">${reg }</h1>
	<h2>${desc }</h2>
	<hr>
	<h1>Welcome, ${user.userName }.</h1>
	<hr>
	<h1>Your email address is ${user.email }.</h1>
	<hr>
	<h1>Your password is ${user.password }.</h1>
	<h2>Caution!!!. Don't share your password with anyone.</h2>
</body>
</html>