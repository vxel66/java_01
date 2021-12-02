<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>좋아요</title>
</head>
<body>
	
	<%@include file="header.jsp" %>
	<h3>메인 부분</h3>
	<%@include file="footer.jsp" %>

	<%
		if(request.getParameter("result")!=null&&request.getParameter("result").equals("false")){
			session.removeAttribute("loginid");
		}
	%>
	
	

</body>
</html>




























