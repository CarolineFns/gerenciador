<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String novaEmpresa = (String) request.getAttribute("empresa");
	System.out.println(novaEmpresa);
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Nova Empresa Criada</title>
	</head>
	<body>
			Empresa <%= novaEmpresa %> cadastrada com sucesso!
	</body>
</html>