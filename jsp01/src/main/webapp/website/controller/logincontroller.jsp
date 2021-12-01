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
			
			session.setAttribute("id", request.getParameter("id"));
			session.setAttribute("password", request.getParameter("password"));
			
			out.print("<script>alert('환영합니다');</script>");
			out.println("<script>location.href='../view/member/loginsuccess.jsp';</script>");
		}else{
			out.print("<script>alert('아이디 또는 비밀번호가 다릅니다');</script>");
			out.println("<script>location.href='../view/member/login.jsp';</script>");
		}
		
	
	%>
	


</body>
</html>