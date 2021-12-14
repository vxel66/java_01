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

	<form action="boardwritecontroller.jsp" method="post">
		제목<input type="text" name="title" ><br>
		내용<input type="text" name="contents"><br>
		<input type="submit" value="글작성">
	</form>
	

</body>
</html>