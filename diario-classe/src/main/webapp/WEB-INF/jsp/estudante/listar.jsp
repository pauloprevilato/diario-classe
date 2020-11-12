<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listagem de Estudantes</title>
</head>
<body>
	${message}<br/>
	<a href="<c:url value='/estudante/adicionar'/>" >adicionar</a>
	<br/>
	<br/>
	<ul>
	<c:forEach items="${estudantes}" var="estudante" >
		<div>
			<div>
				<span>${estudante.id} ${estudante.nome}</span>
				<span>
					<a href="<c:url value='/estudante/editar/${estudante.id}'/>" >editar</a>
				</span>
				<span>
					<a href="<c:url value='/estudante/deletar/${estudante.id}'/>" >deletar</a>
				</span>
			</div>
		</div>
	</c:forEach>
	</ul>
</body>
</html>