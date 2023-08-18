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


@WebServlet("/ExcluirServlet")
public class ExcluirServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("------------- Passei no servlet de detalhar ------------");
		
		// Recupera o id do aluno que deve ser excluido
		String id = request.getParameter("id");
		
		// Recupera a lista de alunos da sessão
		HttpSession session =  request.getSession();
		List<Aluno> listaAlunos =  (List<Aluno>) session.getAttribute("listaAlunos"); 
		
		// Recupera o aluno que tem o id informado (e que deve ser excluido)
		Aluno aluno = null;
		for (Aluno a : listaAlunos) {
				if (a.getId().toString().equals(id)) {
					aluno = a;
				}			
		}
		
		// Removendo o aluno da lista
		listaAlunos.remove(aluno);		
		
		// Encaminhar a requisição para o JSP
		RequestDispatcher dispatcher = request.getRequestDispatcher("listarAlunos.jsp");
		dispatcher.forward(request, response);
		
		
	}

	

}
