<%@page import="dao.MemberDao"%>
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
	
	boolean login =	MemberDao.getmMemberDao().memberlogin(request.getParameter("id"),request.getParameter("password"));
		if(login){
			
			session.setAttribute("loginid", request.getParameter("id"));
			session.setMaxInactiveInterval(60*30); // 60초 [기본값 : 30분]
			
			out.print("<script>alert('환영합니다');</script>");
			out.println("<script>location.href='../view/main.jsp';</script>");
		}else{
			
			out.print("<script>alert('아이디 또는 비밀번호가 다릅니다');</script>");
			out.println("<script>location.href='../view/member/login.jsp';</script>");
		}
		
	
	%>
	


</body>
</html>