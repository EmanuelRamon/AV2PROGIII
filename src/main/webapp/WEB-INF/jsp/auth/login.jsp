<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<c:set var="path" value="${pageContext.request.contextPath}" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link rel="stylesheet" href="${path}/css/global.css" />
<link rel="stylesheet" href="${path}/css/login.css" />
</head>
<body>
	<div class="container">
		<h1>Login</h1>
		<form action="auth" method="POST">
			<input type="text" placeholder="Usuário" name="customer.name" />
			<input
				type="password" placeholder="Senha" name="customer.password" />
			<button type="submit">Entrar</button>
		</form>
		<a href="${path}/customers/new">Cadastre-se</a>
	</div>
</body>
</html>
