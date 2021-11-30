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
	
	<form action="lotto_result.jsp">
		<input type="text" name="1" placeholder="1번째">
		<input type="text" name="2" placeholder="2번째">
		<input type="text" name="3" placeholder="3번째">
		<input type="text" name="4" placeholder="4번째">
		<input type="text" name="5" placeholder="5번째">
		<input type="text" name="6" placeholder="6번째">
		<input type="submit" value="등록">
	</form>
	
	<%
	if(request.getParameter("check")!=null&&request.getParameter("check").equals("false")){
		out.print(" 0 ~ 45 사이만 입력 가능 합니다");
		}%>
	<%
	if(request.getParameter("check2")!=null&&request.getParameter("check2").equals("false")){
		out.print(" 중복 불가입니다 ");
		}%>

</body>
</html>

















