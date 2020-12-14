<%-- 
    Document   : formEvent
    Created on : 30 de nov. de 2020, 04:44:34
    Author     : Fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="form-group">
    <label for="data">Data</label>
    <input type="text" class="form-control" id="data" 
           placeholder="Data" name="event.date" value="${event.date}">
</div>
<div class="form-group">
    <label for="titulo">Nome</label>
    <input type="text" class="form-control" id="titulo" 
           placeholder="Titulo do evento" name="event.title" value="${event.title}">
</div>