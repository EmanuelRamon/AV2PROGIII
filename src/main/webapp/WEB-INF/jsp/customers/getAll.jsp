<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<c:set var="path" value="${pageContext.request.contextPath}" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Clientes</title>
<link rel="stylesheet" href="${path}/css/global.css" />
<link rel="stylesheet" href="${path}/css/table.css" />
</head>
<body>
	<div class="container">
      <header>
        <h1>Clientes cadastrados</h1>
        <a href="${path}/customers/new" class="btn success">Inserir um novo cliente</a>
      </header>
      <table>
        <thead>
          <tr>
            <th>Nome</th>
            <th>CPF</th>
            <th>Data</th>
            <th>Ações</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="customer" items="${customersList}">
            <tr>
              <td>${customer.name}</td>
              <td>${customer.cpf}</td>
              <td>${customer.birth}</td>
              <td class="actions"><a
                href="${path}/customers/id/${customer.id}" class="btn warning">Editar</a>
                <form action="${path}/customers/delete" method="post">
                  <input type="hidden" name="customer.id" value="${customer.id}" />
                  <button class="btn error">Excluir</button>
                </form></td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
</body>
</html>
