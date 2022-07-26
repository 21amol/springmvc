<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Services Page</title>
</head>
<body>

	<h1>This is Services Page</h1>
	<h1>This page is called by home controller/services</h1>

	<%
	String service = (String) request.getAttribute("service");
	Integer date = (Integer) request.getAttribute("date"); // date here used as string is your key given in home controller addAttribute method.
	%>

	<h1>
		Are you interested in
		<!-- service here used is your variable name. DataType used is string in line 15 -->
		<%=service%>
		?
	</h1>

	<h2>
		If yes, then join our batch. Batches are on
		<%=date%>
		of every month.
	</h2>

</body>
</html>