package EC;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Detail
 */
@WebServlet("/EC/Detail")
public class Detail extends HttpServlet {
	public void doGet (
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = "";
		
		if (id.equals("1")) {
			name = "りんご";
		} else if (id.equals("2")) {
			name = "みかん";
		} else if (id.equals("3")) {
			name = "バナナ";
		}
		
		request.setAttribute("name", name);
		
		request.getRequestDispatcher("detail.jsp")
			.forward(request, response);
	}

}
