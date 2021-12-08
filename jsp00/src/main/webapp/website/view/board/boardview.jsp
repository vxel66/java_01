<%@page import="dao.MemberDao"%>
<%@page import="dto.Reply"%>
<%@page import="java.util.ArrayList"%>
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
		int b_num = Integer.parseInt(request.getParameter("b_num"));
		
		String boardviews = loginid+":"+b_num;
		
		if(session.getAttribute(boardviews)== null){
			
			BoardDao.getboBoardDao().view(b_num);
			
			String boardview = loginid+":"+b_num;
			
			session.setAttribute(boardview, true);	
			session.setMaxInactiveInterval(60*60*24);
		}
		
		int m_num = MemberDao.getmMemberDao().member_num(loginid);
		
		Board board = BoardDao.getboBoardDao().getboar(b_num);
		
		String pagenum = "1";
		//페이지 정리
		if(request.getParameter("pagenum")!=null){
			pagenum = request.getParameter("pagenum");
		}
		int lastrow = BoardDao.getboBoardDao().replycount(b_num);
		
		int listsize = 5;
		int lastpage = 0;
		if(lastrow%listsize==0){
			lastpage=lastrow / listsize;
		}else{
			lastpage = lastrow/listsize+1;
		}
		
		int currentpage = Integer.parseInt(pagenum);
		int startrow = (currentpage-1)*listsize;
		
		
		
	%>
	<!-- 게시물 상세 페이지 -->
		<div class="container">
			<div class="row">
				<div class="m-2"> <a href="boardlist.jsp"><button class="form-control">목록보기</button></a> </div>
			<%if(board.getB_writer().equals(loginid)) {%>				
				<div class="m-2"> <a href="boardupdate.jsp?b_num=<%=b_num%>"><button class="form-control">수정하기</button></a> </div>
				<div class="m-2"> <a href="../../controller/boarddelete.jsp?b_no=<%=board.getB_no()%> "><button class="form-control">삭제하기</button></a> </div>
			<%} %>
			</div>
			<table class="table">
				<tr>
					<td style="width: 20%"> 작성자 <%=board.getB_writer() %> </td> 
					<td> 작성일 <%=board.getB_date() %> </td>
					<td> 조회수 <%=board.getB_view() %> </td>
				</tr>
				<tr>
					<td>제목</td> <td colspan="2"> <%=board.getB_title() %> </td>
				</tr>
				<tr>
					<td style="height:300px;">내용</td> <td colspan="2">  <%=board.getB_contents() %>  </td>
				</tr>
				<tr>
					<td> 첨부파일 다운로드 <br>
					<a href="../../controller/filedowncontroller.jsp?file=<%=board.getB_file()%>"><%=board.getB_file() %></a> 
					</td> 
					
					<td colspan="2"> 미리보기<br> <img src="../../upload/<%=board.getB_file()%>" width="100%"></td>
					
				</tr>
			</table>
			
			<table class="table">
				<tr>
					<td>댓글번호</td><td>댓글내용</td><td>작성자</td><td>작성일</td><td></td>
				</tr>
				<% 
				ArrayList<Reply> replylist = BoardDao.getboBoardDao().ReplyList2(startrow, listsize); 
					for(Reply temp : replylist){
						if(temp.getB_no()==board.getB_no()){
				%>	
					<tr>
						<td><%=temp.getR_num() %></td>
						<td><%=temp.getR_contents() %></td>
						<td><%=temp.getM_num() %></td>
						<td><%=temp.getR_date() %></td>
						<%if(m_num==temp.getM_num()){ 
						%>
						<td> <a href="../../controller/replydelete.jsp?r_no=<%=temp.getR_num() %>&b_num=<%=b_num%>"> <button>삭제하기</button> </a>  </td>	
						<%	}%>
					</tr>
				<% }} %>
				<tr id="reply" style="display: none;"> 
					<td colspan="3"> <input type="hidden" id="b_num" value=<%=b_num%>> 
					<input type="text" id="contents" style="width: 900px"> </td> <td> 
					<button id="replybtn">댓글 입력</button> </td>
				</tr>
			</table>
			
			<div class="row">
				<div class="col-md-4 offset-4 my-3">
					<ul class="pagination">
						<%if(currentpage==1){ %>
							<li class="page-item"> <a href="boardview.jsp?b_num=<%=b_num %>&pagenum=<%=currentpage%>" class="page-link">이전</a> </li>
						<%}else{ %>
							<li class="page-item"> <a href="boardview.jsp?b_num=<%=b_num %>&pagenum=<%=currentpage-1%>" class="page-link">이전</a> </li>
						<%} %>	
							<%for(int i=1; i<=lastpage; i++){ %>
							<li class="page-item"> <a href="boardview.jsp?pagenum=<%=i %>&b_num=<%=b_num%>" class="page-link"><%=i %></a> </li>
							<%} %>
						<% if(currentpage==lastpage){ %>	
							<li class="page-item"> <a href="boardview.jsp?b_num=<%=b_num %>&pagenum=<%=currentpage%>" class="page-link">다음</a> </li>
						<%}else{ %>	
							<li class="page-item"> <a href="boardview.jsp?b_num=<%=b_num %>&pagenum=<%=currentpage+1%>" class="page-link">다음</a> </li>
						<%} %>
					</ul>
				</div>
			</div>
			
			<button onclick="replybtn()">댓글쓰기</button>
			
		</div>
	

		
		

</body>
</html>













