<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1> 설문지  </h1>
	<form action="10.요청객체결과.jsp" method="post">
	
		설명:<input type="text" name="name">
		학번:<input type="text" name="stnum">
		성별: 남자<input type="radio" name="gender" value="man" checked="checked">
			여자<input type="radio" name="gender" value="woman" checked="checked">
		성별: <select name="major">
			<option value="국문학과">국문학과</option>
			<option value="수학학과">수학과</option>
			<option value="체육학과">체육과</option>
		</select><br>
			<input type="submit" value="보내기">
		
	</form>




</body>
</html>