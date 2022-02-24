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

	<script type="text/javascript">
		
		function signup() {
			if(document.join.custname.value == ""){
				alert("회원성명이 입력되지 않았습니다.");
				document.join.custname.focus();
				return false;
			}
			if(document.join.phone.value == ""){
				alert("번호가 입력되지 않았습니다.");
				document.join.phone.focus();
				return false;
			}
			if(document.join.address.value == ""){
				alert("회원주소가 입력되지 않았습니다.");
				document.join.address.focus();
				return false;
			}
			if(document.join.joindate.value == ""){
				alert("등록날짜이 입력되지 않았습니다.");
				document.join.joindate.focus();
				return false;
			}
			if(document.join.grade.value == ""){
				alert("등급이 입력되지 않았습니다.");
				document.join.grade.focus();
				return false;
			}
			if(document.join.city.value == ""){
				alert("도시코드 입력되지 않았습니다.");
				document.join.city.focus();
				return false;
			}
			if(document.join.custname.value == ""){
				alert("회원성명이 입력되지 않았습니다.");
				document.join.custname.focus();
				return false;
			}
			
			alert("회원등록이 완료되었습니다.");
			document.join.submit();
		}
	
	</script>

	<%@include file = "header.jsp" %>
	<%@include file = "menu.jsp" %>
	<br>
	
	<%
		member_tbl_02_DAO dao = new member_tbl_02_DAO();
		int custno = dao.getcustno();
	%>
	
	<center>
		<h3>홈쇼핑 회원 등록</h3>
		<form action="joincontroller.jsp" method="post" name="join">
		<table>
			<tr>
				<td>회원번호(자동발생)</td><td><input type="text" name="custno" value="<%=custno %>"></td>
			</tr>
			<tr>
				<td>회원성명</td><td><input type="text" name="custname"></td>
			</tr>
			<tr>
				<td>희망전화번호</td><td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td>휘망주소</td><td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td>가입일자</td><td><input type="text" name="joindate"></td>
			</tr>
			<tr>
				<td>고객등급[A:VIP,B:일반,C:직원]</td><td><input type="text" name="grade"></td>
			</tr>
			<tr>
				<td>도시코드</td><td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td></td><td><button type="button" onclick="signup()">등록</button><button>조회</button></td>
			</tr>
		</table>
		</form>
	</center>
	<br>
	<%@include file = "footer.jsp" %>

</body>
</html>