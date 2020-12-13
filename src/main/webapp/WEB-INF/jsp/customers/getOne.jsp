<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<c:set var="path" value="${pageContext.request.contextPath}" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edição do cliente</title>
<link rel="stylesheet" href="${path}/css/global.css" />
<link rel="stylesheet" href="${path}/css/login.css" />
</head>
<body>
	<div class="container">
	<h1>Você está editando o cliente: ${customer.name}</h1>
		<form action="${path}/customers/update" method="post">
			<input type="hidden" name="customer.id" value="${customer.id}" /> <input
				type="text" name="customer.name" placeholder="Nome"
				value="${customer.name}" /> <input type="text" name="customer.cpf"
				placeholder="CPF" value="${customer.cpf}" /> <input type="text"
				name="customer.birth" placeholder="Data Nascimento"
				value="${customer.birth}" /> <input type="hidden"
				name="customer.password" placeholder="CPF"
				value="${customer.password}" />
			<button type="submit">Atualizar</button>
		</form>
	</div>
</body>
</html>
