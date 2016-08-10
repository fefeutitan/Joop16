package br.triadworks.javaweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/OlaMundo")
public class MinhaPrimeiraServlet extends HttpServlet{
	
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException{
		PrintWriter sysout = response.getWriter();

		sysout.println("<html>");
		sysout.println("<body>");
		sysout.println("Eba meu primeiro Servlet :D");
		sysout.println("</body>");
		sysout.println("</html>");
	}

}
