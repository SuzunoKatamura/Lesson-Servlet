<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@include file = "../header.html" %>
    
    <%@page errorPage = "error.jsp" %>
    
    <%
    request.setCharacterEncoding("UTF-8");
    String username = request.getParameter("username");
    if (username == null || username.trim().isEmpty()) {
    	request.getRequestDispatcher("error.jsp").forward(request, response);
    }
    int age = Integer.parseInt(request.getParameter("age"));
    %>
    
    ユーザー名：<%= username %>
    年齢：<%= age %>
    
    <%@include file = "../footer.html" %>