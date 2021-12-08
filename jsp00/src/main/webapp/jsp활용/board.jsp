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
	<h3>게시물 목록</h3>
	<%if(loginid == null){ //로그인이 완되어 있는경우%>
		<p>로그인이 안되어있습니다
		<% }else{ %>
		<a href="boardwrite.jsp"><button> 글작성 </button></a>
		<%
		}
		
		%>
	
	
	<table>
		<tr>
			<th>번호</th><th>제목</th><th>작성자</th>
		</tr>
		<%for(int i = 0 ; i<boards.size() ; i++){ %>
		<tr>
			<td> <%=(i+1) %> </td>
			<td><a href="boarddetail.jsp?bnum=<%=i%>"><%=boards.get(i).getContents() %></a> </td>
			<td><%=boards.get(i).getWriter()%></td>
		</tr>
		<%} %>
	</table>

</body>
</html>