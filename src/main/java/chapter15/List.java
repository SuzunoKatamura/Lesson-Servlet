package chapter15;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import beans.Employee;
import dao.EmployeeDAO;

/**
 * Servlet implementation class List
 */
@WebServlet("/chapter15/list")
public class List extends HttpServlet {
	
	protected void doGet(
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
		try {
            EmployeeDAO dao = new EmployeeDAO();

            List<Employee> list = dao.findAll();

            request.setAttribute("list", list);

            request.getRequestDispatcher("/employee/list.jsp")
                   .forward(request, response);

        } catch (Exception e) {
            throw new ServletException(e);
        }
		
	}
}
