<%@page import="test.Board"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="test.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String loginid= (String)session.getAttribute("loginid");
	%>

	<% 
		ArrayList<Member> members = new ArrayList<>();
		// 2. 파일입력스트림 선언
		FileInputStream fileInputStream 
		= new FileInputStream( "D:/00lmw_enter/jsp01/src/main/java/test/memberlist.txt");
		byte[] bytes = new byte[1000];	// 3. 읽어올 바이트를 저장할 바이트배열
		fileInputStream.read( bytes );	// 4. 파일 읽기 -> 바이트배열 저장
		String smember = new String(bytes);	// 5. 바이트배열 -> 문자열 변환 
		String[] ssmember = smember.split("\n"); // 6. 문자열 분해 [ \n ] : 회원구분
		for( int i = 0 ; i<ssmember.length-1 ; i++ ){ // 7. 마지막 \n 제외한 반복문
			// 객체화
			Member member = new Member( ssmember[i].split(",")[0] ,
										ssmember[i].split(",")[1] ,
										ssmember[i].split(",")[2] );
			members.add(member); // 리스트에 객체 저장
		}
		//fileInputStream.close();
		
		ArrayList<Board> boards = new ArrayList<>();
		// 2. 파일입력스트림 선언
		FileInputStream fileInputStream2 
		= new FileInputStream( "D:/00lmw_enter/jsp01/src/main/java/test/memberlist.txt");
		byte[] bytes2 = new byte[1000];	// 3. 읽어올 바이트를 저장할 바이트배열
		fileInputStream.read( bytes );	// 4. 파일 읽기 -> 바이트배열 저장
		String smember2 = new String(bytes);	// 5. 바이트배열 -> 문자열 변환 
		String[] ssmember2 = smember.split("\n"); // 6. 문자열 분해 [ \n ] : 회원구분
		for( int i = 0 ; i<ssmember.length-1 ; i++ ){ // 7. 마지막 \n 제외한 반복문
			// 객체화
			Board board = new Board( ssmember[i].split(",")[0] ,
										ssmember[i].split(",")[1] ,
										ssmember[i].split(",")[2] );
			boards.add(board); // 리스트에 객체 저장
		}
		//fileInputStream.close();
		
	%>

	<h3>헤더 페이지 구역</h3>
	<ul>
		<% if(loginid!=null){out.print("<li>"+loginid+"님 안녕하세요</li>");}  %>
		<li><a href="login.jsp">로그인</a> </li>
		<li> <a href="signup.jsp">회원가입</a> </li>
		<li><a href="board.jsp">게시판</a> </li>
		<li><a href="book.jsp">도서검색</a> </li>
		<li><a href="lotto.jsp">로또</a> </li>
		<% if(loginid!=null){ %>	<li><a href="logout.jsp">로그아웃</a> </li>  <%}  %>
	</ul>

</body>
</html>