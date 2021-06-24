<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Page</title>
</head>
<body>

<%
Date date= new Date();

String test=request.getParameter("name");


%>	

	<div>
	Today is <%=date %>
	</div>
	</br>

	<p><font color="red">${errorMessage}</font></p>
	<form action="/myservlet3" method="post">
	Enter your name <input type="text" name="name"/></br>
	Enter password <input type="password" name="password"/></br>
	<input type="submit" value="Login"/> 
	</form>
	
	
	

</body>
</html>