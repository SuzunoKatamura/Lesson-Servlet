<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@include file = "../header.html" %>
    
    <p>
    	<form action = "done.jsp" method = "post">
    		名前<input type = "text" name = "name">
    		<input type = "submit" value = "送信">
    	</form>
    </p>
    
    <%@include file = "../footer.html" %>