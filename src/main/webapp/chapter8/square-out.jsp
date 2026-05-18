<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@include file = "../header.html" %>
    
    <%@page errorPage = "square-error.jsp" %>
    
    <%
    	request.setCharacterEncoding("UTF-8");
    	int num = Integer.parseInt(request.getParameter("number"));
    	int result = num * num;
    %>
    <p>入力した数値:<%= num %></p>
    <p>結果:<%= result %></p>
    
    <%@include file = "../footer.html" %>