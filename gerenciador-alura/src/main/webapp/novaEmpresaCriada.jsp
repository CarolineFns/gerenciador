<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Nova Empresa Criada</title>
	</head>
	<body>
		<c:if test="${ not empty empresa }">
			Empresa ${ empresa } cadastrada com sucesso!
			<br />
			Data Abertura: <fmt:formatDate value="${ dataAbertura }" pattern="dd/MM/yyy"/>
		</c:if>
		<c:if test="${ empty empresa }">
			Empresa não cadastrada!
		</c:if>
	</body>
</html>