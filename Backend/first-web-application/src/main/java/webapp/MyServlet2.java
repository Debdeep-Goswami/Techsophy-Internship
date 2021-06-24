package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/myservlet2")
public class MyServlet2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Get the parameter from the page
		String myString =request.getParameter("name");
		System.out.println(myString);
		
		request.setAttribute("name", myString);
		
		request.setAttribute("custom", "This is Custom Attribute");
		
		request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
		
		
	}
}
