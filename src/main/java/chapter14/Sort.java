package chapter14;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class Sort
 */
@WebServlet("/chapter14/sort")
public class Sort extends HttpServlet {
	public void doGet (
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup(
					"java:/comp/env/jdbc/book");
			Connection con = ds.getConnection();
			
			String order = request.getParameter("order");
			String sq1 = "select * from product order by price ";
			
			if ("desc".equals(order)) {
				sq1 += "desc";
			} else {
				sq1 += "asc";
			}
			
			PreparedStatement st = con.prepareStatement(sq1);
			
			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				out.println(rs.getString("name"));
				out.println(":");
				out.println(rs.getInt("price"));
				out.println("<br>");
			}
			
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace(out);
		}
		
		Page.footer(out);
		
	}

}
