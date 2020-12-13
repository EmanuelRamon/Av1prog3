<%-- 
    Document   : eventsByDate
    Created on : 2 de dez. de 2020, 04:38:52
    Author     : Lucas
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"> 
        <title>Eventos Filtrados</title>
    </head>
    <body>
        <div id="navbar">
            <%@include file="../templates/navbarUser.jsp" %>
        </div>
        <div class="container">
            <h5 class="mt-4">Esses são os eventos programados para a data que você procurou: ${date}</h5>
             <table class="table mt-4">
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
                    <c:forEach var="event" items="${authSession.eventList}">
                        <tr>
                            <th scope="row">${event.date}</th>
                            <td>${event.title}</td>
                            <td>${event.place}</td>
                            <td>${event.owner}</td>
                            <c:choose>
                                <c:when test="${event.owner.equalsIgnoreCase(authSession.user.name)}">
                                    <td>
                                        <a href="${path}/events/update/id/${event.uuid}">Editar</a>
                                    </td>
                                    <td>
                                        <a href="${path}/events/delete/id/${event.uuid}">Excluir</a>
                                    </td>
                                </c:when> 
                                <c:otherwise>
                                    <td>
                                        <span>-</span>
                                    </td>
                                    <td>
                                        <span>-</span>
                                    </td>
                                </c:otherwise>

                            </c:choose>

                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
