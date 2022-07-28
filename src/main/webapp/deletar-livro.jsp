<%--
  Created by IntelliJ IDEA.
  User: andressaraffler
  Date: 27/07/22
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deletar Livro</title>
</head>
<body>

<h1>Apagar um Livro</h1>
<fieldset>
    <legend>Dados basicos</legend>
    <form action = "livro-servlet/deletar-livro" method="post">
        <div>
            <input type="hidden" name="id" value="${livro.id}"> <!-- para identificar na alteracao -->
        </div>
        <input type="submit" value="Enviar">
    </form>
</fieldset>

</body>
</html>