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

/**
 * Servlet implementation class Board
 */
@WebServlet("/chapter14/board")
public class Board extends HttpServlet {
	
	protected void doPost(
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup(
					"java:/comp/env/jdbc/book");
			Connection con = ds.getConnection();
			
			String name = request.getParameter("name");
			String body = request.getParameter("body");
			
			PreparedStatement st = con.prepareStatement(
					"insert into posts(name, body) values(?, ?)"
					);
			
			st.setString(1, name);
			st.setString(2, body);
			st.executeUpdate();
			
			st = con.prepareStatement(
					"select * from posts order by id desc"
					);
			ResultSet rs = st.executeQuery();
			
			out.println("<h1>掲示板</h1>");
			
			while (rs.next()) {
				out.println("<hr>");
				out.println(rs.getString("name"));
				out.println("<br>");
				out.println(rs.getString("body"));
				out.println("<br>");
				
				out.println("<div class='post'>");
			    out.println("<div class='name'>" + name + "</div>");
			    out.println("<div>" + body + "</div>");
			    out.println("</div>");
			}
			
			rs.close();
			st.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace(out);
		}
		
	}

}
