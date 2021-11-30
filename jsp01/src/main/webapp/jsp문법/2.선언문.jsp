<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3> 선언문 </h3>
	<%
		String 스크립트 ="jsp 프로그래밍";
		int 변수1=0; //스크릡트문에서 병수선언시 초기값 선언 필수
	%>
	
	<%!
		String 선언문 ="jsp 프로그래밍2";
		int 변수2;	//맴버변수 : 초기값 없을경우 null , 0 자동 
	%>
	
	<br> 출력결과 : <%= 스크립트 %>
	<br> 출력결과 : <%= 선언문 %>
	<br> 출력결과 : <%= 변수1 %>
	<br> 출력결과 : <%= 변수2 %>
	
	<%! //jsp 선언문 구역
		int one ; int two = 2;
		public int plus(){
			return one+two;
		}
		String msg;
		int three;
		
	%>
	
	<!-- 표현식 -->
 	one 과 two 합은? : <%=plus() %> <!-- 메소드결과 -->
	<br> msg 값은 ? : <%=msg %>	<!-- 문자열 초기값이 없을경우 null -->
	<br> three 값은 ? : <%=three %> <!-- 정수열 초기값이 없을경우 0 -->
	
	
	
	
</body>
</html>


















