<%-- 
    Document   : update
    Created on : Nov 10, 2020, 7:03:00 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atualização - Cliente</title>
    </head>
    <body>
        <form action="customers" method="post">
            <label>Nome</label>
            <input type="text" name="name" placeholder="Nome" 
                   value="${customerToUpdate.name}"/>
            <label>CPF</label>
            <input type="text" name="cpf" placeholder="CPF" 
                   value="${customerToUpdate.cpf}"/>
            
            <button type="submit">Atualizar</button>
        </form>
    </body>

</html>
