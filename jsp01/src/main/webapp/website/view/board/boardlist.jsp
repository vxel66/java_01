<%@page import="dao.MemberDao"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
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

	<%@include file="../header.jsp" %>
	
	<%
		//페이징처리
		String key = request.getParameter("key");
		String keyword = request.getParameter("keyword");
		String pagenum = request.getParameter("pagenum");
		//충게시물수
		if(pagenum==null){
			pagenum ="1";
		}
		
		int lastrow = BoardDao.getboBoardDao().boardcount2( key ,  keyword);
		
		
		int listsize = 5;//2.페이당 화면에 표시할 개시물수
		int lastpage = 0; 			//3.마지막페이지
		if(lastrow%listsize==0){	//만약에 총게시물 /페이지당게시물 나머지가 없으면
			lastpage=lastrow / listsize;	//* 총게시물 / 페이지당 게시물
		}else{
			lastpage =lastrow / listsize+1;	//* 총게시물/ 페이장게시물 +1
		}
		
		int currentpage = Integer.parseInt(pagenum);//5.현재페이지번호
		int startrow = (currentpage-1)*listsize;//6.현재페이지의 시작번호
	
		
		
		ArrayList<Board> boards = BoardDao.getboBoardDao().boardlist(startrow, listsize, key, keyword);
		
	%>
		
	<h3>보드리스트</h3>
	
	<div class="container">
	
		<a href="boardwrite.jsp"> <button>글쓰기</button> </a>
	
	
		<h3>질문 게시판</h3>
		<table class="table table-hover">
			<tr >
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회주</th>
			
			</tr>
			<%	
			if(boards.size()==0){ %>
				<tr>
					<td colspan="5">검색 결과가 없습니다</td>
				</tr>
				
			<% }
			
				
			for(Board temp : boards){ 
			%>
				
				<tr>
					<td> <%=temp.getB_no() %> </td>
					<td> <a href="boardview.jsp?b_num=<%=temp.getB_no()%>" class="text-dark" ><%=temp.getB_title() %></a>  </td>
					<td> <%=temp.getB_writer()%> </td>
					<td> <%=temp.getB_date() %> </td>
					<td> <%=temp.getB_view()%> </td>
				</tr>
				
			<% 	
			}
			%>
			
			
		</table>
		<!--  페이지 번호 -->
		<div class="row"><!-- 가로 배치 -->
			<div class="col-md-4 offset-4 my-3">
				<ul class="pagination">
					<!-- 첫페이지이면 -->
					<%if(currentpage==1){ %>
					<% if(keyword ==null){ %>
					<li class="page-item"> <a href="boardlist.jsp?pagenum=<%=currentpage %>&key=<%=key %>&keyword=<%=keyword %>" class="page-link">이전</a> </li>
					<%}else{ %>
					<li class="page-item"> <a href="boardlist.jsp?pagenum=<%=currentpage %>" class="page-link">이전</a> </li>
					<%}}else{ %>
					<li class="page-item"><a href="boardlist.jsp?pagenum=<%=currentpage-1 %>&key=<%=key %>&keyword=<%=keyword %>" class="page-link"> 이전 </a> </li>
					<% } %>
						
					
					<%for(int i = 1 ; i<=lastpage; i++) {%>
					<!-- 게시물의 수만큼 페이지 번호 생성 -->
					<li class="page-item"> <a href="boardlist.jsp?pagenum=<%=i %>&?key=<%=key %>&?keyword=<%=keyword %>" class="page-link"><%=i %></a> </li>
								<!-- i 클릭 했을때 해당 페이지번호로 이동 -->
					<% }%>
					<% if(currentpage==lastpage){ %>
					<li class="page-item"> <a href="boardlist.jsp?pagenum=<%=currentpage%>&key=<%=key %>&keyword=<%=keyword %>" class="page-link">다음</a> </li>
					<%}else{ %>
					<li class="page-item"> <a href="boardlist.jsp?pagenum=<%=currentpage+1%>&key=<%=key %>&keyword=<%=keyword %>" class="page-link">다음</a> </li>
					<%} %>
				</ul>
			</div>	
		</div>
		
		<!-- 검색 -->
		
		<form action="boardlist.jsp?pagenum=<%=currentpage %>" method="get" class="col-md-5 offset-3 input-group my-3">
				<select class="custom-select col-md-3" name="key"> <!-- 필드명 -->
					
					<option value="b_title">제목</option>
					<option value="b_contents">내용</option>
					<option value="b_no">번호</option>
					<option value="b_writer">작성자</option>
					
				</select>
			<input type="text" class="form-control" name="keyword"> <!-- keyword : 검색대상 -->
			<input type="submit" class="btn btn-outline-info" value="검색">
		</form>
		
		
	</div>
	
	<br><br><br><br><br><br>


</body>
</html>





















