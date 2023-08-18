package senac.jp.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import senac.jp.dominio.Aluno;

public class ConfirmarCadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("------------- Passei no servlet de confirmar cadastro ------------");
		
		// Recuperando a sessao
		HttpSession session =  request.getSession();
		
		// Recuperando a lista da seção, caso não exista, cria
		List<Aluno> listaAlunos =  (List<Aluno>) session.getAttribute("listaAlunos"); 
			if (listaAlunos == null) {
					listaAlunos = new ArrayList<>(); // Criando a lista
			}
		
		// Recuperar os valores informados		
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		String genero = request.getParameter("genero");		
		String semestre = request.getParameter("semestre");
		
		// Guardar no objeto aluno
		Aluno aluno = new Aluno(listaAlunos.size()+1,nome,idade,genero,semestre);
		// O id é o tamanho da lista -1 e vai seguir
		// Não é a melhor solução!
		
			
		
		
		
		// Adicionando um aluno na lista
		listaAlunos.add(aluno);		
		session.setAttribute("listaAlunos", listaAlunos);
		request.setAttribute("aluno", aluno);
		
		
		
		
		// Encaminhar a requisição para o JSP
		RequestDispatcher dispatcher = request.getRequestDispatcher("detalharAluno.jsp");
		dispatcher.forward(request, response);
		
		
	}

	

}
