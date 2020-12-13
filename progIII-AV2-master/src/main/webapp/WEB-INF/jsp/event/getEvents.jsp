<%-- 
    Document   : getEvents
    Created on : 28 de nov. de 2020, 01:33:27
    Author     : Lucas
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"> 

        <title>Todos os eventos</title>
    </head>
    <body>
        <c:set var="path" value="${pageContext.request.contextPath}"/>
        <div class="container">
            <br>
            <h3>Esses são os eventos cadastrados:</h3>
            <table class="table">
                <thead class="thead-light">
                    <tr>
                        <th scope="col">Data</th>
                        <th scope="col">Titulo</th>
                        <th scope="col">Local</th>
                        <th scope="col">Organizador</th>
                        <th scope="col">Editar</th>
                        <th scope="col">Excluir</th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="event" items="${eventsList}">
                        <tr>
                            <th scope="row">${event.date}</th>
                            <td>${event.title}</td>
                            <td>${event.place}</td>
                            <td>${event.owner}</td>
                            <td>
                                <a href="${path}/events/update/id/${event.uuid}">Editar</a>
                            </td>
                            <td>
                                <a href="${path}/events/delete/id/${event.uuid}">Excluir</a>
                            </td>


                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

    </body>
</html>
