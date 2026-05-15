package chapter5;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;


@WebServlet("/chapter5/practice03")
public class Practice03 extends HttpServlet {

	public void doPost(
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String ageString = request.getParameter("age");
		
		Page.header(out);
		
		try {
			int age = Integer.parseInt(ageString);
			if (age < 18) {
				out.println("こんにちは、" +name+ "さん。未成年ですね。");
			} else {
				out.println("こんにちは、" +name+ "さん。大人ですね。");
			}
		} catch (NumberFormatException e) {
			out.println("年齢は数値で入力してください。");
		}
		
		Page.footer(out);
		
	}}
		

		
		
		
		
		
		
		
		
		
		
//		//null check
//		if (ageString == null || ageString.isEmpty()) {
//			out.println("年齢は数値で入力してください。");
//			return;
//		}
//		
//		int age;
//		
//		try {
//			age = Integer.parseInt(ageString);
//		} catch (NumberFormatException e){
//			out.println("年齢は数値で入力してください。");
//			return;
//		}
//		
//		
//		if (age < 18){
//			out.println("こんにちは、" +name+ "さん。未成年ですね。");
//		} else {
//			out.println("こんにちは、" +name+ "さん。大人ですね。");
//		}
//	}


