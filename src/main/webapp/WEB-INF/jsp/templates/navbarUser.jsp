<%-- 
    Document   : navbarUser
    Created on : 10 de dez. de 2020, 02:48:42
    Author     : Fernando
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <p class="navbar-brand">Agenda App</p>
    <div class="collapse navbar-collapse mt-2" id="navbarTogglerDemo02">
        <ul class="navbar-nav mr-auto mt-lg-0">
            <li class="nav-item active">
                <a class="nav-link" href="${path}/user">Home</a>
            </li>
            <li class="nav-item">
                <p class="nav-link">${authSession.user.name}</p>
            </li>

            <li class="nav-item">
                <div class="dropdown">
                    <a class="btn btn-secondary dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <span><img src="${path}/images/settings.png" /></span>
                    </a>

                    <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                        <a class="dropdown-item" href="${path}/user/update/${authSession.user.cpf}">Editar Usuário</a>
                        <a class="dropdown-item" href="${path}/user/remove/${authSession.user.cpf}">Excluir Conta</a>
                        <a class="dropdown-item" href="${path}/logout">LogOut</a>
                    </div>
                </div>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0" action="${path}/events/bydate${date}" method="GET">
            <input class="form-control mr-sm-2" type="search"
                   placeholder="Data..." name="date">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
        </form>
    </div>
</nav>
