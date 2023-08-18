 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="senac.jp.dominio.Aluno" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Aluno Cadastrado</h2>
	
	
  <%  Aluno aluno = (Aluno) request.getAttribute("aluno"); %>
	
	
	Nome: <%= aluno.getNome() %>
	<br><br>
	
	Idade: <%= aluno.getIdade() %>
	<br><br>
	
	Genero: <%= aluno.getGenero() %>
	<br><br>
	
	
	Semestre: <%= aluno.getSemestre() %>
	<br><br>
	
	
	<!--  a href="listarAlunos.jsp">Voltar</a>	-->	
	<input type="button"  onclick="javascript:location.href='listarAlunos.jsp'"  value="Voltar">
	<a href="AlterarServlet?nome=<%=aluno.getNome()%>">Alterar</a>
	
	
	
	
	
	
	<br><br>
	
	
</body>
</html>