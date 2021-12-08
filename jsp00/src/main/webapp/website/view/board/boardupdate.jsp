<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%@include file="../header.jsp" %>
	<% 
	int b_num = Integer.parseInt(request.getParameter("b_num")) ; 
	Board board = BoardDao.getboBoardDao().getboar(b_num);
	System.out.print(b_num);	
	%>

	<div class="container">
		
			<form action="/jsp01/website/controller/boardwritecontroller.jsp?type=2" method="post" enctype="multipart/form-data">
				<input type="hidden" name="b_no" value=<%=b_num%>>
				<!-- form 전송데이터 기본타입 : text(String) enctype="application/x-www-form-urlencoded" -->
				<!-- form 파일데이터 타입 :  -->
				<div class="row ">
					<div class="m-2">
						제목 : <input type="text"  name="title" style="width: 400px" placeholder=<%=board.getB_title() %>>
					</div>
				</div>
				<div class="row ">
					<div class="m-2">
						내용 : <textarea rows="10" cols="80" name="contents" placeholder=<%=board.getB_contents() %>></textarea> <br>
					</div>
				</div>
				<div class="row ">
					<div class="m-2">
						첨부파일 : <input type="file" name="file">
					</div>
				</div>
				<div class="row ">
					<div class="m-2">
						첨부파일2 : <input type="file" name="file2"><br>
					</div>
				</div>
				<div class="row">
					<input type="submit" value="등록" >
				</div>
			</form>
	</div>
	

</body>
</html>