<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@include file = "../header.html" %>
    
    <h1>商品詳細</h1>
    
    <p>
    	商品名:
    	<%= request.getAttribute("name") %>
    </p>
    
    <form action = "purchase" method = "get">
    	<input type = "submit" value = "購入">
    </form>
    
    <%@include file = "../footer.html" %>