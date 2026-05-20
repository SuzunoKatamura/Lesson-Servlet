package ServletTest;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/ServletTest/contact")
public class Contact extends HttpServlet {

	protected void doPost(
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
		
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String company = request.getParameter("company");
		String mail = request.getParameter("mail");
		String text = request.getParameter("text");
		
		
		Page.header(out);
		
		//trycatch
		if (name == null) {
			out.println("氏名を入力してください");
		}
		
		if (mail == null) {
			out.println("メールアドレスを入力してください");
		}
		
		if (text == null) {
			out.println("お問い合わせ内容を入力してください");
		}
		
		Page.header(out);
	

	}

}
