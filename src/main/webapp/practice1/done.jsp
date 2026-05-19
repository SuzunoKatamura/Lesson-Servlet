<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@include file = "../header.html" %>
    
    <p>こんにちは、<%= request.getAttribute("name") %>さん</p>
    
    <%@include file = "../footer.html" %>