<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Empresa</title>
	</head>
	<body>
	
	    <form action="${ linkEntradaServlet }" method="POST">
	    	<input type="hidden" name="id" value="${ empresa.id }">
	    	Nome: 
	    	<input type="text" name="nome" value="${ empresa.nome }">  
	    	Data abertura: 
	    	<input type="text" name="dataAbertura" value="<fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyy" />">
	    	<input type="hidden" name="acao" value="AlteraEmpresa"/>
	    	<input type="submit">
		</form>
		
	</body>
</html>