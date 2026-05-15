package chapter4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/chapter4/practice02")
public class Practice02 extends HttpServlet {

	public void doGet(
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
		response.setContentType("text/plain; charset = UTF-8");
		PrintWriter out = response.getWriter();
		
		String lang = request.getHeader("Accept-Language");
		if (lang != null && lang.startsWith("ja")) {
			out.println("こんにちは！");
		} else {
			out.println("Hello!");
		}
	}

}