<%@page import="dao.BoardDao"%>
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
	
	int r_no = Integer.parseInt(request.getParameter("r_no"));
	int b_num = Integer.parseInt(request.getParameter("b_num"));
	boolean check = BoardDao.getboBoardDao().replydelete(r_no);
	if(check){
		out.print("<script>alert('삭제되었습니다');</script>");
		out.println("<script>location.href='../view/board/boardview.jsp?b_num="+b_num+"';</script>");
	}else{
		out.print("<script>alert('환영합니다');</script>");
		out.println("<script>location.href='../view/main.jsp';</script>");
	}
	
	
	%>

</body>
</html>