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
		//session.invalidate();// 모든 세션 초기화
		session.setAttribute("loginid",null); //세션초기화
		response.sendRedirect("main.jsp");
	%>

</body>
</html>