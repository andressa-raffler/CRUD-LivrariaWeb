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
    <title>Editar Livro</title>
</head>
<body>

<h1>Edição de Livro</h1>
<fieldset>
    <legend>Dados basicos</legend>
    <form action="livro-servlet/editar-livro" method="get">
        <div>
            <input type="hidden" name="id" value="${livro.id}"> <!-- para identificar na alteracao -->
        </div>
        <div>
            <label for="idNome">Nome livro:</label>
            <input type="text" id="idNome" name="nome" value="${livro.nome}">
        </div>
        <div>
            <label for="idCpf">Autor:</label>
            <input type="text" id="idCpf" name="autor" value="${livro.autor}">
        </div>
        <input type="submit" value="Enviar">
    </form>
</fieldset>

</body>
</html>
