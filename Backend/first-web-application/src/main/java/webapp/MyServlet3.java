package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/myservlet3")
public class MyServlet3 extends HttpServlet {
	
	private UserValidationService service=new UserValidationService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("name", request.getParameter("name"));
		request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		boolean validUser=service.isUserValid(name, password);
		
		if(validUser) {
			request.setAttribute("name",name);
			request.setAttribute("password",password);
			request.getRequestDispatcher("/WEB-INF/views/Welcome.jsp").forward(request, response);
		}
		else {
			request.setAttribute("errorMessage", "Invalid User\nTry Again");
			request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
		}
			
		
	}
}
