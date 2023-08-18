<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="senac.jp.dominio.Aluno" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2> Alterar Aluno:</h2>


<%  Aluno aluno = (Aluno) request.getAttribute("aluno"); %>

<form action="ConfirmarAlteracaoServlet" method="get">

		Nome: 
		<input type="text"  name="nome"  value="<%= aluno.getNome()%>" >
		<br><br>
		
		Idade:
		<input type="number" name="idade">
		<br><br>
		
		Semestre:		
        <select name="semestre">
            <option value="Primeiro">Primeiro</option>
            <option value="Segundo">Segundo</option>          
        </select>
        <br><br>
		
		Gênero:
		<input type="radio" name="genero" value="Masculino"> Masculino
		<input type="radio" name="genero" value="Feminino"> Feminino
		<br><br>
				
		<input type="submit" value="Confirmar Alteração">
        <a href="listarAlunos.jsp">Voltar</a>


</form> 
</body>
</html>