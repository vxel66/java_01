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
		String name = request.getParameter("name");
		String stunm = request.getParameter("stnum");
		String gender = request.getParameter("gender");
		String major = request.getParameter("major");
		
	%>
	<%
	if(gender.equals("men")){
		gender="남자";
	}else{
		gender="여자";
	}
	%>
	<h1>결과</h1>

	성별 : <%= name %> <br>
	성별 : <%= stunm %><br>
	성별 : <%= gender %><br>
	성별 : <%= major %><br>
	
	<%
		out.print(request.getProtocol()+"<br>");
		out.print(request.getServerName());
		out.print(request.getServerPort() +"<br>");
		out.print(request.getRemoteHost() +"<br>");
		out.print(request.getRemoteAddr() +"<br>");
		out.print(request.getMethod() +"<br>");
		out.print(request.getRequestURI() +"<br>");
		out.print(request.getHeader("User-Agent") +"<br>");

	%>
	

</body>
</html>













