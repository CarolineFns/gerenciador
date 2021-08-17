<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
	
	    <form action="${ linkEntradaServlet }" method="POST">
	    	Login: 
	    	<input type="text" name="login">  
	    	Senha:
	    	<input type="text" name="senha">
	    	<input type="hidden" name="acao" value="Login">
	    	<input type="submit">
		</form>
		
	</body>
</html>