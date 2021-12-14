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
		int b_no = Integer.parseInt(request.getParameter("b_no"));
		boolean result = BoardDao.getboBoardDao().delete(b_no);
		
		if(result){
			out.print("<script>alert('게시물이 삭제되었습니다');</script>");
			
			out.println("<script>location.href='../view/board/boardlist.jsp';</script>");
		}else{
			response.sendRedirect("../view/board/boardview.jsp?b_num="+b_no);
		}
	
	
	
	%>
	

</body>
</html>