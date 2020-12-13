<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<c:set var="path" value="${pageContext.request.contextPath}" />
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="${path}/css/global.css" />
<link rel="stylesheet" href="${path}/css/login.css" />
</head>
<body>
	<form action="${path}/movies/save" method="post">
		<input type="text" placeholder="Titulo" name="movie.title" />
		<input
			type="number" placeholder="Preço" name="movie.price" />
		<button type="submit">Cadastrar</button>
	</form>
</body>
</html>