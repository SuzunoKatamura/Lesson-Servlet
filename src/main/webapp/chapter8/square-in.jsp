<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@include file = "../header.html" %>
    
    <p>数値を入力してください：
	    <form action = "square-out.jsp" method = "post">
		    <input type = "text" name = "number">
		    <input type = "submit" value = "計算">
	    </form>
	</p>
    
    <%@include file = "../footer.html" %>