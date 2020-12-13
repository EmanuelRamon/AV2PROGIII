<%-- 
    Document   : customers
    Created on : Sep 29, 2020, 7:47:36 PM
    Author     : leonardo
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
    </head>
    <body>
        <div>
            <h1>Clientes cadastrados</h1>
            <a href="novo-cliente.jsp">Inserir um novo cliente</a>
        </div>

        <div>
            <table>
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>CPF</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="customer" items="${customersList}">
                        <tr>
                            <td>${customer.name}</td>
                            <td>${customer.cpf}</td>
                            <td>
                                <a href="customers?id=${customer.id}">Editar</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>



    </body>
</html>
