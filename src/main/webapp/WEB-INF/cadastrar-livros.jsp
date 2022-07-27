<%--
  Created by IntelliJ IDEA.
  User: andressaraffler
  Date: 26/07/22
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Livraria</title>
</head>
<body>
<h1>Cadastro de Cliente</h1>
<fieldset>
    <form action = "/LivrariaWeb" method="post">
        <div>
            <label for="idNome">Nome:</label>
            <input type="text" id="idNome" name="nome">
        </div>

        <div>
            <label for="idAutor">Autor:</label>
            <input type="text" id="idAutor" name="autor">
        </div>
        <input type="submit" value="Enviar"><br/>
    </form>
</fieldset>
</body>
</html>
