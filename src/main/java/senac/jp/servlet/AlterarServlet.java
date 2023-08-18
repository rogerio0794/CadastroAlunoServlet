package senac.jp.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import senac.jp.dominio.Aluno;

import java.io.IOException;
import java.util.List;


@WebServlet("/AlterarServlet")
public class AlterarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("------------- Passei no servlet de alterar ------------");
		
		String nome = request.getParameter("nome");
		System.out.println(nome);
		
		// Adicionar a lista de alunos na sessão
		HttpSession session =  request.getSession();	
				
		// Recuperando a lista da seção
		List<Aluno> listaAlunos =  (List<Aluno>) session.getAttribute("listaAlunos"); 
		
		// Recuperando o aluno da lista com o nome especificado
		Aluno aluno = null;
		for (Aluno a : listaAlunos) {
				if (a.getNome().equals(nome)) {
					aluno = a;
				}			
		}
		
		// Colocar o aluno no resquest
		request.setAttribute("aluno", aluno);
		
		
		
		// Encaminhar a requisição para o JSP
		RequestDispatcher dispatcher = request.getRequestDispatcher("alterarAluno.jsp");
		dispatcher.forward(request, response);
		
		
	}

	

}
