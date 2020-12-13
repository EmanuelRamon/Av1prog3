<%-- 
    Document   : formFieldsUser
    Created on : 30 de nov. de 2020, 16:43:49
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="form-group">
    <label for="name">Nome:</label>
    <input type="text" class="form-control" id="name" 
           placeholder="Digite seu nome" name="user.name" 
           value="${user.name}" required>
</div>
<div class="form-group">
    <label for="cpf">CPF:</label>
    <input type="text" class="form-control" id="cpf" 
           placeholder="CPF" name="user.cpf" 
           value="${user.cpf}" required>
</div>
<div class="form-group">
    <label for="email">Email:</label>
    <input type="email" class="form-control" id="email"  
           placeholder="Email..." name="user.email" 
           value="${user.email}" required>
</div>
<div class="form-group">
    <label for="password">Senha:</label>
    <input type="password" class="form-control" id="password" 
           placeholder="Senha..." name="user.password" 
           value="${user.password}" required>
</div>
