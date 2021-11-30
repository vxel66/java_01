<%@page import="java.io.FileOutputStream"%>
<%@page import="test.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%@include file="header.jsp"%>
	<%	
		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		
		Board board = new Board(title,contents,loginid);
		
		FileOutputStream fileOutputStream = new FileOutputStream("D:/00lmw_enter/jsp01/src/main/java/test/boardlist.txt" ,true);
		
		String outstring = board.getTitle()+","+board.getContents()+","+board.getWriter()+"\n";
	
		fileOutputStream.write(outstring.getBytes());
		
		response.sendRedirect("board.jsp");
	%> 

</body>
</html>