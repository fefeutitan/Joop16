<%@ include file="includes.jsp"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <link rel="stylesheet" type="text/css" href="css/style.css">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:import url="cabecalho.jsp"/>
<title>Lista de Caloteiros</title>
</head>
<body>
<table border="1">
<th colspan="4">
Lista de Caloteiros:
</th>
<c:forEach var="caloteiro" items="${lista}" varStatus="id">
<tr>
	<td>
	<c:choose>
		<c:when test="${not empty caloteiro.nome }">
			${caloteiro.nome}
		</c:when>
		<c:otherwise>
			Nome não preenchido
		</c:otherwise>
	</c:choose>
	</td>
	<td>
	<c:choose>
		<c:when test="${not empty caloteiro.email }">
			<a href="mailto:${caloteiro.email }">${caloteiro.email}</a>
		</c:when>
		<c:otherwise>
			Email não preenchido
		</c:otherwise>
	</c:choose>
	</td>
	<td>
	<c:choose>
		<c:when test="${not empty caloteiro.devendo }">
			${caloteiro.devendo}
		</c:when>
		<c:otherwise>
			Devendo não preenchida
		</c:otherwise>
	</c:choose>
	</td>	
	<td>
	<c:choose>
		<c:when test="${not empty caloteiro.dataDivida }">
			<fmt:formatDate value="${caloteiro.dataDivida.time }" pattern="dd/MM/yyyy hh:mm"/>
		</c:when>
		<c:otherwise>
			Data não preenchida
		</c:otherwise>
	</c:choose>
	</td>
</c:forEach>
</table>
<c:import url="rodape.jsp"/>
</body>
</html>