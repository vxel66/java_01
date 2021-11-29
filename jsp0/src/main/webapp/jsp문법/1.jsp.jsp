<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
		
		<p> jsp(java server pases ) : 자바 서버 페이지  </p>
		
		<ul>
			<li> 1. HTML : JAVA 코드를 삽입할수 있는 페이지 </li>
			<li> 2. java -> 웹프로그래밍[서블릿 : java,html 별도] -> jsp [ java + html] </li>
			<li> 3. jsp파일내 java+html+css+js 작성가능</li>
			<li> 4. jsp 실행했을때 -> 서블릿[java] 로 변환!!	</li>
			<li> 5. 사용방법 : java 사용시 태그 안에서 작성 </li>
		</ul>
		
		<h1> 스크립트 예 </h1>	 <!-- html 구역 -->	
		
		
			<!-- jsp 구역 (선언문 태그: 1. 변수선언o[전역변수] 2.메소드선언o 3.출력불x-->
		<%! String 문자열 ="jsp 선언문"; %>
		<%! public String 메소드() { return 문자열 ;} %>
			<!-- jsp 구역 (선언문 태그: 1. 변수선언o[지역변수] 2.메소드선언x 3.출력o -->
		<%
			String 스크립트 = "jsp 스크립트"; 
			String 내용="jsp 입니다.";
			out.print(내용);				// out : 스크립트 태그 나가기
			out.print(메소드()+"메소드");
		%>
		
		<br> <%= 스크립트 %>
		<br> <%= 메소드() %>
		
		
</body>
</html>









