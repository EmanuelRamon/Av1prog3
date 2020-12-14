<%-- 
    Document   : getUserToRemove
    Created on : 2 de dez. de 2020, 03:11:13
    Author     : Emnauel
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <c:set var="path" value="${pageContext.request.contextPath}"/>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

        <title>Cadastro de usuário</title>
    </head>
    <body>
        <div id="navbar">
            <%@include file="../templates/navbarUser.jsp" %>
            <div class="container">
                <form class="mt-4" action="${path}/user/remove" method="POST">
                    <div class="form-group">
                        <label for="name">Nome:</label>
                        <input type="text" class="form-control" id="name" 
                               placeholder="Digite seu nome" name="user.name" 
                               value="${user.name}" readonly="">
                    </div>
                    <div class="form-group">
                        <label for="cpf">CPF:</label>
                        <input type="text" class="form-control" id="cpf" 
                               placeholder="CPF" name="user.cpf" 
                               value="${user.cpf}" readonly="">
                    </div>
                    <div class="form-group">
                        <label for="email">Email:</label>
                        <input type="email" class="form-control" id="email"  
                               placeholder="Email..." name="user.email" 
                               value="${user.email}" readonly="">
                    </div>
                    <div class="form-group">
                        <label for="password">Senha:</label>
                        <input type="password" class="form-control" id="password" 
                               placeholder="Senha..." name="user.password" required >                               
                    </div>
                    <button type="submit" class="btn btn-danger">Excluir Conta</button>
                </form>
                <br>
                <p class="text-danger">${errorMessage} ${alertIcon}</p>
                
            </div>
    </body>
</html>
