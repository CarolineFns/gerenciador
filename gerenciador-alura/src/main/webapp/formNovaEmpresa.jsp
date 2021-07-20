<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkNovaEmpresaServlet" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Nova Empresa</title>
	</head>
	<body>
	
	    <form action="${ linkNovaEmpresaServlet }" method="POST">
	    	Nome: 
	    	<input type="text" name="nome">  
	    	Data abertura: 
	    	<input type="text" name="dataAbertura">
	    	<input type="submit">
		</form>
		
	</body>
</html>