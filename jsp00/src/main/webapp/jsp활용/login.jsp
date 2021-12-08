<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% String result= request.getParameter("result"); %>
	<%@include file="header.jsp" %>
	
	
	<form action="logincotroller.jsp" >
		아이디 : <input type="text" name="id" placeholder="Enter Id">
		비밀번호 : <input type="password" name="password" placeholder="Enter password">
		<input type="submit" value="로그인">
	</form>

	<%
		if(result!=null&&request.getParameter("result").equals("fail")){%>
			<h4>로그인 실패</h4>
	<%		
	};
	%>

</body>
</html>