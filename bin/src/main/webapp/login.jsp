<%-- 
    Document   : login.jsp
    Created on : Sep 22, 2020, 9:27:46 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página inicial</title>
    </head>
    <body>
        <form action="auth" method="POST">
            <input type="text" placeholder="Usuário" name="username"/>
            <input type="password" placeholder="Senha" name="password"/>
            <button type="submit">Entrar</button>
        </form>
    </body>
</html>
