<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- If you are using expression (EL)... -->
<%@page isELIgnored="false"%>
<%-- <%@page isValid="true" %> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>This is my first spring MVC project</h1>
	<h1>Welcome to Finastra</h1>
	<h1>This page is called by home controller/home</h1>
	<hr>
	<%-- <%
	/* String name = (String) request.getAttribute("name");  //Type casting is done and is required, as it is object.
	Integer jersey = (Integer) request.getAttribute("jersey");
	List<String> players = (List<String>) request.getAttribute("p"); */
	%> --%>

	<h1>
		Name is
		<%-- <%=name%></h1> --%>

		<!-- Using expression language... -->
		${name }
	</h1>
	<hr>
	<h1>
		Jersey number is
		<%-- <%=jersey%></h1>
 --%>
		${jersey }
	</h1>
	<hr>
	<h1>Players List:</h1>

	<%-- <%
	for (String p : players) {
	%>

	<h1><%=p%></h1>

	<%
	}
	%> --%>

	<c:forEach var="item" items="${p }">
		<h1>${item }</h1>
	</c:forEach>



</body>
</html>