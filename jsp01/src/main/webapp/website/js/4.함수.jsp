
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<script type="text/javascript" src="text.js"></script>

	<button onclick="start3()">추가</button>
	
	<ul id ="list"></ul>
	
	<h3>인수 넘기기</h3>
	13 x 46 = <span id="result"></span>
	<button onclick="start4(13 , 46)"> 결과</button>
	
	<br> <input type="text" id="name">
	결과 <span id="re"> </span>
	<button onclick="start5()"> 입력</button>
</body>
</html>