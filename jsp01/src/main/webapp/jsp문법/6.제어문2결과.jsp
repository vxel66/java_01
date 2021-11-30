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
		String 문자열 = request.getParameter("string");
		int 횟수 = Integer.parseInt(request.getParameter("count"));
		
		for(int i =0; i<횟수; i++){
			out.print(i+"번째:"+문자열+"<br>");
		}
		
	
	%>



</body>
</html>