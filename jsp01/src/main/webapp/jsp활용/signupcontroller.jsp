<%@page import="java.io.FileOutputStream"%>
<%@page import="test.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 사용자 뷰x : java 로직만 -->
	<%@include file="header.jsp" %>
	<%  //스크립트문
	
		 request.setCharacterEncoding("UTF-8");//변수를 한글로 요청하기
		 String id = request.getParameter("id");
		 String password = request.getParameter("password");
		 String name = request.getParameter("name");
		
		//객체화
		Member member = new Member(id,password,name);
		//DB 처리 //파일처리 [예외처리 x : 서블릿에 예외처리 되어있음]
		//파일출력 스트림		
		FileOutputStream fileOutputStream = new FileOutputStream("D:/00lmw_enter/jsp01/src/main/java/test/memberlist.txt" ,true);	
		//출력한 문자열 합치기
		String outstring = member.getId()+","+member.getPassword()+","+member.getName()+"\n";
		//문자열 출력
		fileOutputStream.write(outstring.getBytes());
		
		//페이지 이동 [repone.sendRedirect("이동할 경로명");]
		response.sendRedirect("main.jsp");		
		
	%>
	
	
	

</body>
</html>