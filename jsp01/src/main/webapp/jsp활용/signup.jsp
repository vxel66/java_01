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
	<h3>회원가입 페이지</h3>
	<!-- 회원가입 -->
	<form action="signupcontroller.jsp" method="post"> <!-- action="이동페에이지경로"  method="정송방식:get,post"-->
		<input type="text" name="id" placeholder="Enter ID"><br>
		<input type="password" name="password" placeholder="Enter password"> <br>
		<input type="text" name="name" placeholder="Enter Name"><br>
		<input type="submit" value="회원가입"> <!-- submit 클랙힜을떄 form전송(action) -->
	</form> 


</body>
</html>