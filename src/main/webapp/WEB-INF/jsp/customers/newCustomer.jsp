<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<c:set var="path" value="${pageContext.request.contextPath}" />
<head>
<link rel="stylesheet" href="${path}/css/style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Novo cliente</title>
<link rel="stylesheet" href="${path}/css/global.css" />
<link rel="stylesheet" href="${path}/css/login.css" />
</head>
<body>
	<%@include file="../templates/nav.jsp"%>
	${error}
	<main>
	<h1>Novo cliente</h1>
	<div class="container">
		<form action="${path}/customers/save" method="post">
			<input type="text" name="customer.name" placeholder="Nome"
				value="${customer.name}" /> <input type="text" name="customer.cpf"
				placeholder="Cpf" value="${customer.cpf}" /> <input type="text"
				name="customer.birth" placeholder="Data de Nascimeto"
				value="${customer.birth}" /> <input type="password"
				name="customer.password" placeholder="Senha"
				value="${customer.password}" />
			<button type="submit">Cadastrar</button>
		</form>
	</div>
	</main>
	<%@include file="../templates/footer.jsp"%>
</body>
<script src="${path}/js/js.js"></script>
</html>
