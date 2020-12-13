<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<c:set var="path" value="${pageContext.request.contextPath}" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Atualizar filme</title>
<link rel="stylesheet" href="${path}/css/global.css" />
<link rel="stylesheet" href="${path}/css/login.css" />
</head>
<body>
	<c:set var="path" value="${pageContext.request.contextPath}" />	
	<div class="container">
	<h1>Você está editando o filme: ${movie.title}</h1>
		<form action="${path}/movies/update" method="post">
			<input type="hidden" name="movie.id" value="${movie.id}" /> <input
				type="text" name="movie.title" placeholder="Titulo"
				value="${movie.title}" /> <input type="number" name="movie.price"
				placeholder="Preço" value="${movie.price}" />
			<button class="btn success" type="submit">Atualizar</button>
		</form>
	</div>
</body>
</html>
