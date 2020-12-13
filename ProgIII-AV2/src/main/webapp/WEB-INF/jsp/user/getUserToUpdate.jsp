<%-- 
    Document   : getUserCpf
    Created on : 30 de nov. de 2020, 17:59:11
    Author     : Lucas
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
        </div>
        <div class="container">
            <form class="mt-4" action="${path}/user/update" method="POST">
                <%@include file="../templates/formFieldsUser.jsp" %>
                <button type="submit" class="btn btn-success">Atualizar</button>
            </form>
            <br>
        </div>
    </body>
</html>
