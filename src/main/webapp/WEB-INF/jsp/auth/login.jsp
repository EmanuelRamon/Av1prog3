<%-- 
    Document   : login
    Created on : 30 de nov. de 2020, 18:17:10
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

        <title>Login</title>
    </head>
    <body>
        <div class="container">
            <form class="mt-4" action="auth" method="POST">
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="email" class="form-control" id="email"  
                           placeholder="Email..." name="user.email" 
                           value="${user.email}"
                           required>
                </div>
                <div class="form-group">
                    <label for="password">Senha:</label>
                    <input type="password" class="form-control" id="password" 
                           placeholder="Senha..." name="user.password"
                           required>
                </div>
                <button type="submit" class="btn btn-primary">Login</button>
            </form>
            <br>
            <c:choose >
                <c:when test="${user!=null}">
                    <h4 class="text-danger">${errorMessage} ${alertIcon} </h4> 
                </c:when>
                <c:when test="${user==null}">
                    <h4 class="text-danger">${errorMessage}  ${alertIcon}</h4>

                    <h5><a href="${link}">${linkMessage}</a></h5>
                    </c:when>
                </c:choose>

        </div>
    </body>
</html>

