<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h2> Informe seu usu�rio e senha: </h2>
<form action="LoginServlet" method="get">

	<!-- operador tern�rio -->
	<%= request.getAttribute("mensagem") == null ? "" : request.getAttribute("mensagem")%> 
	<br>

	Login: <input type="text" name="nome">
	<br><br>
	
	
	Senha: <input type="password" name="senha">
	<br><br>
	
	<input type="submit" name="Efetuar Login">
	<br><br>

</form>

	
</body>
</html>