<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Nova Empresa</title>
	</head>
	<body>
	
	    <form action="${ linkEntradaServlet }" method="POST">
	    	Nome: 
	    	<input type="text" name="nome">  
	    	Data abertura: 
	    	<input type="text" name="dataAbertura">
	    	<input type="hidden" name="acao" value="NovaEmpresa">
	    	<input type="submit">
		</form>
		
	</body>
</html>