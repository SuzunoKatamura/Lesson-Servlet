package practice1;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/practice1/index")
public class index extends HttpServlet {

	public void doGet (
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		
		request.setAttribute("name", name);
		
		request.getRequestDispatcher("done.jsp")
			.forward(request, response);
	}
}
