<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adicionar Disciplina</title>
</head>
<body>
	<c:url value="/disciplina/salvar" var="uriSalvar" />
	<form action="${uriSalvar}" method="POST">
		<label for="id">Id:</label>
		<input type="text" name="disciplina.id" value="${disciplina.id}">
		
		<label for="id">Nome:</label>
		<input type="text" name="disciplina.nome" value="${disciplina.nome}">
		
		<input type="submit" value="Salvar">
	</form>
</body>
</html>