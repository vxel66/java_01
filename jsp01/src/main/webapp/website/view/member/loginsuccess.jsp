<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%@include file="../header.jsp" %>
		
		<h3>로그인 성공</h3>
		<%
			Cookie[] cookies = request.getCookies();
		if(cookies != null){
			for(int i =0; i<cookies.length; i++){
				if(cookies[i].getName().equals("qweqwe")){
					out.print(cookies[i].getValue());
				}
			}
		}
		
		%>
			
</body>
</html>