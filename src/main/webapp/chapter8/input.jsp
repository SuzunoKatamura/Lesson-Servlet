<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@include file = "../header.html" %>
	    <form action = "output.jsp" method = "post">
	    ユーザー名
	    <input type = "text" name = "username">
	    年齢
	    <input type = "text" name = "age">
	    <input type = "submit" value = "確定">
    </form>
    
    <%@include file = "../footer.html" %>