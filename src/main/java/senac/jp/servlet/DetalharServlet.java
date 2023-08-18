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
import java.util.ArrayList;
import java.util.List;


@WebServlet("/DetalharServlet")
public class DetalharServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("------------- Passei no servlet de detalhar ------------");
		
		
		// Recupera o id do aluno que precisa ser detalhado
		String id = request.getParameter("id");
		
		// Adicionar a lista de alunos na sessão
		HttpSession session =  request.getSession();	
				
		// Recuperando a lista da seção
		List<Aluno> listaAlunos =  (List<Aluno>) session.getAttribute("listaAlunos"); 
		
		// Recuperando o aluno da lista com o nome especificado
		Aluno aluno = null;
		for (Aluno a : listaAlunos) {
				if (a.getId().toString().equals(id)) { // convertendo para string o getId
					aluno = a;
				}			
		}
		
		// Guarda o aluno no resquest, para mostrar na pagina de detalhes
		request.setAttribute("aluno", aluno);
		
		// Encaminhar a requisição para a pagina detalhar aluno
		RequestDispatcher dispatcher = request.getRequestDispatcher("detalharAluno.jsp");
		dispatcher.forward(request, response);
		
		
	}

	

}
