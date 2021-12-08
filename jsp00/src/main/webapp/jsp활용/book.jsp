<%@page import="org.apache.el.parser.BooleanNode"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="header.jsp" %>
	<%
	String[] 도서목록 = {	
			"된다! 네이버 블로그&포스트",
			"스프링 부트 실전 활용 마스터",
			"Tucker의 Go 언어 프로그래밍",
			"혼자 공부하는 C 언어"
	};
	%>
	<form action="book.jsp?ok=true">
		<input type="text" name="name" placeholder="책이름">
		<input type="submit" value="검색">
	</form>
		<% String name =request.getParameter("name");  %>
		<% 
		for(int i=0; i<도서목록.length ; i++){ %>
			<%if(name!=null && 도서목록[i].contains(name)&&!name.equals("")){ %>
		제목	<%=도서목록[i] %><br>
		<%}
			} %>

</body>
</html>