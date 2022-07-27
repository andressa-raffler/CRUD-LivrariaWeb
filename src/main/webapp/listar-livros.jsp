<%--
  Created by IntelliJ IDEA.
  User: andressaraffler
  Date: 26/07/22
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista de Livros</title>
</head>
<body>

<h1>Lista de Livros cadastrados</h1>
<h3>Livro ${nome} , cadastrado com sucesso!</h3>

<table border="solid">
    <tr>
        <th>Nome</th>
        <th>Autor</th>
    </tr>
    <c:forEach var="livro" items="${livros}" varStatus="id">
        <tr>
            <td>${livro.nome}</td>
            <td>${livro.autor}</td>
<%--            <td>--%>
<%--                <c:choose>--%>
<%--                    <c:when test = "${cliente.idade > 65}">--%>
<%--                        Melhor idade--%>
<%--                    </c:when>--%>
<%--                    <c:when test = "${cliente.idade >= 18}">--%>
<%--                        Sim--%>
<%--                    </c:when>--%>
<%--                    <c:when test = "${cliente.idade < 18}">--%>
<%--                        Não--%>
<%--                    </c:when>--%>
<%--                    <c:otherwise>--%>
<%--                        Não foi registrado no cartorio--%>
<%--                    </c:otherwise>--%>
<%--                </c:choose>--%>

<%--            </td>--%>
        </tr>
    </c:forEach>
</table>
<a href="cadastrar-livros.jsp">Cadastre um novo Livro</a>

</body>
</html>
