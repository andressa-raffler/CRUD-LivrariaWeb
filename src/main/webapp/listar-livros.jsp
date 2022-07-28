<%--
  Created by IntelliJ IDEA.
  User: andressaraffler
  Date: 26/07/22
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista de livros</title>
</head>
<body>
<form action="livro-servlet/editar-livro" method="get">
<h1>Livros cadastrados</h1>

<table border="solid">
    <tr>
        <th>ID</th>
        <th>Nome</th>
        <th>Autor</th>
    </tr>
    <c:forEach var="livro" items="${livros}" varStatus="id">
        <tr>
            <td>${livro.id}</td>
            <td>${livro.nome}</td>
            <td>${livro.autor}</td>
        </tr>
    </c:forEach>
</table>
<a href="index.jsp">Voltar ao menu iniciar</a>
</form>
</body>
</html>
