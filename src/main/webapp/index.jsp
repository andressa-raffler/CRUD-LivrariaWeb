<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Página Inicial</title>
</head>
<body>
<h1><%= "Página inicial" %>
</h1>
<br/>
<a href="cadastrar-livros.jsp" target="_blank">C - Cadastrar um novo livro</a><br/>
<a href="${pageContext.request.contextPath}/livro-servlet/listar-livros" target="_blank">R - Listar livros cadastrados</a><br/>
</body>
</html>