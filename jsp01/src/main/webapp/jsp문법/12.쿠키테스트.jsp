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

	<%
		//1. 모든 쿠키 가져오기
		Cookie[] cookies = request.getCookies();
						//Arrays 배열내 값 확인
		System.out.println(Arrays.toString(cookies));
		if(cookies != null){
			for(int i = 0; i<cookies.length;i++){
				System.out.print(cookies[i].getName());
				if(cookies[i].getName().equals("mycookie")){
					%>
						내 쿠키이름 : <%=cookies[i].getName() %>
						내 쿠키값 :	<%=cookies[i].getValue() %>
					<%
				}
			}
		}
	
	%>


</body>
</html>