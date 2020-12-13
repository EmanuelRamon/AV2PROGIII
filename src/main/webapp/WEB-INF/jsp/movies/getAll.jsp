<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<c:set var="path" value="${pageContext.request.contextPath}" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Filmes</title>
<link rel="stylesheet" href="${path}/css/global.css" />
<link rel="stylesheet" href="${path}/css/table.css" />
</head>
<body>
	<div class="container">
		<header>
			<h1>Filmes cadastrados</h1>
			<a class="btn success" href="${path}/movies/new">Cadastre um novo
				filme</a>
		</header>

		<div>
			<table>
				<thead>
					<tr>
						<th>Titulo</th>
						<th>Preço</th>
						<th>Ações</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="movie" items="${movieList}">
						<tr>
							<td>${movie.title}</td>
							<td>${movie.price}</td>
							<td class="actions"><a href="${path}/movies/id/${movie.id}"
								class="btn warning">Editar</a>
								<form action="${path}/movies/delete" method="post">
									<input type="hidden" name="movie.id" value="${movie.id}" />
									<button class="btn error">Excluir</button>
								</form></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>
