<%@page import="DTO.member_tbl_02_DTO"%>
<%@page import="DAO.member_tbl_02_DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%@include file = "header.jsp" %>
	<%@include file = "menu.jsp" %>
	<br>
	
	<%
		
		member_tbl_02_DAO dao = new member_tbl_02_DAO();
		String custno = request.getParameter("custno");
		member_tbl_02_DTO dto = dao.getmember(custno);
		
	%>

	<center>
		<h3>홈쇼핑 회원 수정</h3>
		<form action="updatecontroller.jsp" method="post" name="join">
		<table>
			<tr>
				<td>회원번호(자동발생)</td><td><input type="text" name="custno" value="<%=dto.getCustno() %>"></td>
			</tr>
			<tr>
				<td>회원성명</td><td><input type="text" name="custname" value="<%=dto.getCustname() %>"></td>
			</tr>
			<tr>
				<td>희망전화번호</td><td><input type="text" name="phone" value="<%=dto.getPhone() %>"></td>
			</tr>
			<tr>
				<td>휘망주소</td><td><input type="text" name="address" value="<%=dto.getAddress() %>"></td>
			</tr>
			<tr>
				<td>가입일자</td><td><input type="text" name="joindate" value="<%=dto.getJoindate().split(" ")[0] %>"></td>
			</tr>
			<tr>
				<td>고객등급[A:VIP,B:일반,C:직원]</td><td><input type="text" name="grade" value="<%=dto.getGrade() %>"></td>
			</tr>
			<tr>
				<td>도시코드</td><td><input type="text" name="city" value="<%=dto.getCity() %>"></td>
			</tr>
			<tr>
				<td></td><td><button type="submit">등록</button><button>조회</button></td>
			</tr>
		</table>
		</form>
	</center>
	<br>
	<%@include file = "footer.jsp" %>

</body>
</html>