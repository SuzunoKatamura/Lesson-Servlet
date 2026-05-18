<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@include file = "../header.html" %>
    
    <% request.setCharacterEncoding("UTF-8"); %>
    <p>こんにちは、<%=request.getParameter("user") %>さん！ </p>
    
    <%@include file = "../footer.html" %>
    
<!--<!DOCTYPE html>-->
<!--<html>-->
<!--<head>-->
<!--<meta charset="UTF-8">-->
<!--<title>Insert title here</title>-->
<!--</head>-->
<!--<body>-->

<!--</body>-->
<!--</html>-->