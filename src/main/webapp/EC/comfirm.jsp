<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@include file = "../header.html" %>
    
    <h1>購入確認画面</h1>
    
    <p>名前:<%= request.getAttribute("name") %></p>
    <p>住所:<%= request.getAttribute("name") %></p>
    
    <form action = "complete.jsp" method = "post">
    	<input type = "hidden" name = "name" value = request.getParameter("name")>
    	<input type = "hidden" name = "adress" value = request.getParameter("adress")>
    	<input type = "submit" value = "確定">
    </form>
    
    <%@include file = "../footer.html" %>