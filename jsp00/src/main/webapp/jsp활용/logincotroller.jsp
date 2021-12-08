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
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	//존재여부 확인
	boolean logincheck=false;
	for(Member member : members){
		if(member.getId().equals(id)&&member.getPassword().equals(password)){
			//login 성공
			logincheck=true;
			//세션선공
			session.setAttribute("loginid",member.getId());
			
			//session.setMaxInactiveInterval(10);	// 시간
			
			response.sendRedirect("main.jsp");
			
		}else{
			if(!logincheck){
				response.sendRedirect("login.jsp?result=fail");
			}
			
		}
		
	}
	
	
	%>


</body>
</html>