<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@include file = "../header.html" %>
    
    <h1>購入入力画面</h1>
    
    <p>
    	商品:
    	<%= request.getAttribute("name") %>
    </p>
    
    <form action = "comfirm.jsp" method = "post">
    	名前：<input type = "text" name = "name">
    	住所：<input type = "text" name = "adress">
    	<input type = "submit" value = "確認">
    </form>
    
    <%@include file = "../footer.html" %>