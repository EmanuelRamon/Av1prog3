<%-- 
    Document   : index
    Created on : 30 de nov. de 2020, 17:39:44
    Author     : Emanuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt">
    <c:set var="path" value="${pageContext.request.contextPath}"/>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

        <style>
            .centro{
                display: flex;
                align-items: center;
                justify-content: space-between;
            }
        </style>
        <title>Agenda</title>
    </head>
    <body>
        <div class="container">
            <div class="centro">
                <div>
                    <img src="./images/logo.jpeg" alt="Logo"> 
                </div>

                <div class="card-body">
                    <h5 class="card-title">AV1 de Prog III</h5>
                    <h6 class="card-subtitle mb-2 text-muted">Agenda</h6>
                    <p class="card-text">HttpServlet e requisições Http, HttpSession,JSTL e EL(Expression Language)</p>
                </div>
            </div>     

            <button type="button" class="btn btn-primary btn-lg btn-block">
                <a href="${path}/user/new" class="text-white">Cadastre-se</a>
            </button>
            <button type="button" class="btn btn-secondary btn-lg btn-block">
                <a href="${path}/login" class="text-white">Entrar</a>
            </button>
        </div>
    </body>
</html>

