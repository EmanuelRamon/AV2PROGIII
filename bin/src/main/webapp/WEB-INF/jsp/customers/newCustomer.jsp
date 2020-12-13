<%-- 
    Document   : novo-cliente
    Created on : Sep 28, 2020, 7:32:04 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo cliente</title>
    </head>
    <body>
        <h1>Novo cliente</h1>
        <form action="/sales-app/customers/save" method="post">
            <input type="text" name="customer.name" placeholder="Nome"/>
            <input type="text" name="customer.cpf" placeholder="CPF"/>
            <button type="submit">Cadastrar</button>
        </form>
    </body>
</html>
