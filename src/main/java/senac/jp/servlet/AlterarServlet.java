package senac.jp.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/AlterarServlet")
public class AlterarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("------------- Passei no servlet de alterar ------------");
		
		// Encaminhar a requisição para o JSP
		RequestDispatcher dispatcher = request.getRequestDispatcher("alterarAluno.jsp");
		dispatcher.forward(request, response);
		
		
	}

	

}
