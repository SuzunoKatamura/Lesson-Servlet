package EC;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Complete
 */
@WebServlet("/complete")
public class Complete extends HttpServlet {

	public void doGet(
			HttpServletRequest request,
			HttpServletResponse response
			) throws IOException, ServletException {

		String name = request.getParameter("name");

		request.setAttribute("name", name);

		request.getRequestDispatcher("complete.jsp")
			.forward(request, response);
	}
}