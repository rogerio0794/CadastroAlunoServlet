<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2> Alterar Aluno:</h2>

<form action="ConfirmarAlteracaoServlet" method="get">

 		<label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" required><br><br>
        
        <label for="idade">Idade:</label>
        <input type="number" id="idade" name="idade" required><br><br>

 		<label for="semestre">Semestre:</label>
        <select id="semestre" name="semestre">
            <option value="primeiro">Primeiro</option>
            <option value="segundo">Segundo</option>          
        </select><br><br>
        
         <label>Gênero:</label>
        <input type="radio" id="generoM" name="genero" value="masculino">
        <label for="generoM">Masculino</label>
        <input type="radio" id="generoF" name="genero" value="feminino">
        <label for="generoF">Feminino</label><br><br>
        
		<input type="submit" value="Confirmar Alteração">
        <input type="button" onclick="javascript:history.back()" value="Voltar">
		<br><br>
</form> 
</body>
</html>