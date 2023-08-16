<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar Aluno</title>
</head>
<body>
	<h1>Cadastro de Aluno</h1>
    <form action="ConfirmarCadastroServlet" method="post">
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
        
        <input type="submit" value="Confirmar Cadastro">
        <a href="VoltarListarAlunosServlet">Voltar</a>
    </form>






</body>
</html>