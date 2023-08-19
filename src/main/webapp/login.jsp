<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<h2> Informe seu usuário e senha: </h2>
<form action="LoginServlet" method="get">
	<!-- operador ternário -->
	<%= request.getAttribute("mensagem") == null ? "" : request.getAttribute("mensagem")%> 
	<br>

	Login: <input type="text" name="nome">
	<br><br>
	
	
	Senha: <input type="password" name="senha">
	<br><br>
	
	<input type="submit" value="Efetuar Login">	
	<br><br>

</form>

	
</body>
</html>