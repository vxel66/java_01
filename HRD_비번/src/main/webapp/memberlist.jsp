<%@page import="DAO.member_tbl_02_DAO"%>
<%@page import="DTO.member_tbl_02_DTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	
	.t1{
		border: 1px solid black;
	}
	.t1 td{
		border: 1px solid black;
		text-align: center;
		padding: 5px 15px;
	}
	
</style>

</head>
<body>

	<%@include file = "header.jsp" %>
	<%@include file = "menu.jsp" %>
	<br>
	
	<%
	member_tbl_02_DAO member = new member_tbl_02_DAO();
	ArrayList<member_tbl_02_DTO> arrayList = member.getlist(); 

	%>
	
	<center>
		<h2>회원목록/수정</h2>
		<table class="t1">
			<tr>
				<td>회원번호</td>
				<td>회원성명</td>
				<td>회원번호</td>
				<td>주소</td>
				<td>가입일자</td>
				<td>고객등급</td>
				<td>거주지역</td>
			</tr>
			<% for(member_tbl_02_DTO temp : arrayList){ %>
			<% if(temp.getGrade().equals("A")){
				temp.setGrade("VIP");
			}else if(temp.getGrade().equals("B")){
				temp.setGrade("일반");
			}else{
				temp.setGrade("직원");
			}
				%>
			
			<tr>
				<td><a href="update.jsp?custno=<%=temp.getCustno() %>"><%=temp.getCustno() %></a></td>
				<td><%=temp.getCustname() %></td>
				<td><%=temp.getPhone() %></td>
				<td><%=temp.getAddress() %></td>
				<td><%=temp.getJoindate().split(" ")[0] %></td>
				<td><%=temp.getGrade() %></td>
				<td><%=temp.getCity() %></td>
			</tr>
			<% }%>
		</table>
	</center>
	

	<%@include file = "footer.jsp" %>

</body>
</html>