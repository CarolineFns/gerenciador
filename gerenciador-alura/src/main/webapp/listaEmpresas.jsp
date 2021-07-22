<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Empresas</title>
	</head>
	<body>
		<c:if test="${ not empty empresa }">
			Empresa ${ empresa } cadastrada com sucesso!
			<br />
			<br />
		</c:if>
		<br />
		Lista de Empresas:
		<ul>
			<c:forEach items="${ empresas }" var="empresa">			
				<li>
					${ empresa.nome } - 
					<fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyy"/>
				</li>
			</c:forEach>
		</ul>	
	</body>
</html>