<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

		<%			  // request : 요청객체 [전페이지로 부터] : 요청타입 아스키코드
						//	.getParameter("변수명");
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name1");
		//페이지로부터 변수를 요청
		//request : jsp 내장객체
			//.getParameter("변수명"); : 해당 변수명 요청
		String color = request.getParameter("color1");
			
	%>
	
</head>
<body bgcolor = <%=color %> >
	
	
	이름 : <%=name %>
	색상 : <%=color %>
	
	
	
</body>
</html>