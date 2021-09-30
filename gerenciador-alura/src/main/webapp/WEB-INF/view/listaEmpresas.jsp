<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.List,br.com.alura.gerenciador.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Empresas</title>
</head>
<body>
	<c:if test="${ not empty usuarioLogado }">
			<c:import url="logout-parcial.jsp"></c:import>
			
			Usuário Logado: ${ usuarioLogado.login }
			<br />
			<br />
	</c:if>

	<c:if test="${ not empty empresa }">
			Empresa ${ empresa } cadastrada com sucesso!
			<br />
		<br />
	</c:if>
	
	<br /> Lista de Empresas:
	<c:if test="${ not empty empresas }">
		<ul>
			<c:forEach items="${ empresas }" var="empresa">
				<li>
					${ empresa.nome }- <fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyy" /> <a
					href="${ linkEntradaServlet }?acao=RemoveEmpresa&id=${ empresa.id }">Remover</a> <a
					href="${ linkEntradaServlet }?acao=MostraEmpresa&id=${ empresa.id }">Editar</a>
				</li>
			</c:forEach>
		</ul>
	</c:if>
	<c:if test="${ empty empresas }">
		Lista de empresas vazia.
	</c:if>
</body>
</html>