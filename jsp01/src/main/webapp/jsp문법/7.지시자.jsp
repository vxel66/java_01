<%@page import="java.util.Date"%>
	<!-- 페이지 지시자 -->
		<!-- 현재 jsp 페이지네 속성 정의 -->
		<!-- page import="패키지/클래스" -->
		
		
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<!-- jsp 기본 : laguage:사용할엉ㄴ어 contenttype=""  pageEncoding = "인코딩타입" : 문자타입 -->
<%@page info="jsp시작" %>	
<%@page language="java" %>
<%@page contentType="text/html; charset=UTF-8" %> <!-- 페이지 출력할 형식 -->
<%@page import="java.util.ArrayList" %>
<%@page session="true" %>
<%@page buffer="none" %>		<!-- 페이지 출력 크기 [ 기본 " 8kb ] none:버퍼없이 브라우저 바로 전송 -->
<%@page isThreadSafe="true" %>	<!-- jsp 페이지가 동시에 여러 브라우저가 요청[ 기본 : ture ]  -->
<%@page errorPage="7.에러.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% Date date = new Date(); 
		int one=1; int zero=0;
		
	%>
	
	<h3> 지시자 </h3>
	<br> jsp 버전 : <%=this.getServletInfo() %>
	<br> 현재 날짜/시간 : <%= date%>
	
	<br> 예외발생 : <%=one/zero%> 
	
	<%@include file="5.제어문.jsp" %>
	
</body>
</html>













