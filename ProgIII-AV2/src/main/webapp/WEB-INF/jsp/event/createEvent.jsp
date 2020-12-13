<%-- 
    Document   : createEvent
    Created on : 27 de nov. de 2020, 23:38:06
    Author     : Lucas
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>Cadastro Evento</title>
    </head>
    <body>
        <c:set var="path" value="${pageContext.request.contextPath}"/>

        <div class="container">
            <form class="mt-4" action="${path}/events/save" method="POST">
                <%@include file="../templates/formFieldsEvent.jsp" %>
                <button type="submit" class="btn btn-primary">Cadastrar Evento</button>
            </form>
            <br>
            <h4 class="text-danger">${errorMessage}</h4>
        </div>

    </body>

</html>

