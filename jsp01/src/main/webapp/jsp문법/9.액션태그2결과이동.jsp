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
		request.setCharacterEncoding("UTF-8");
		out.print(request.getParameter("id")+ "<br>");
		out.print(request.getParameter("pw")+ "<br>");
		out.print(request.getParameter("content"));
	%>

</body>
</html>