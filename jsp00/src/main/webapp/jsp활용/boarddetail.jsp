<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp" %>
	
		<h3>게시물 상세페이지</h3>
	 <%
	    int no = Integer.parseInt(request.getParameter("bnum"));
		for(int i =0; i<boards.size() ; i++) {
			%>
		제목<%=boards.get(no).getTitle() %> <br>
		내용<%=boards.get(no).getContents() %> <br>
		작성자<%=boards.get(no).getWriter() %> <br>
	<%
	}
	%>

</body>
</html>