<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
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
	<script type="text/javascript" src="../../js/myinfo.js"></script>
		<% 
			String id = (String)session.getAttribute("loginid");
			Member member = MemberDao.getmMemberDao().memberinfo(id);
			String[] adress = member.getAdress().split(",");
		%>
	<div class="container">
		<form id="../../controller/infoupdatecontroller.jsp" action="myinfo.jsp" onsubmit="return infoupdate()">
			<div class="row">
				<div class="col-md-3">
					<label>비밀번호</label>
				</div>
				<div class="col-md-8">
					<input id="password" type="text" onchange="infoupdate();"  placeholder="<%=member.getPassword()%>">	
				</div>
			</div>
			<div>
				<span id="idresult"></span>
			</div>
			<div class="row">
				<div class="col-md-3">
					<label>이름</label>
				</div>
				<div class="col-md-8">
					<input id="name" type="text" onchange="infoupdate();" >	
				</div>
			</div>
			<div>
				<span id="nameresult"></span>
			</div>
			<div class="row">	<!-- 3:8 -->
				<div class="col-md-3 m-2"> <label>주소</label> </div>
				<div class="col-md-8"> 
					<div class="row">
						<div class="col-md-6"> <input type="text" id="sample4_postcode" name="adress1" placeholder=" <%=adress[0] %> " class="form-control"> </div>
						<div class="col-md-6"> <input type="button"  onclick="sample4_execDaumPostcode()" value="우편번호 찾기" class="form-control"><br> </div>
					</div>
					<div class="row">
						<div class="col-md-6"> <input type="text" id="sample4_roadAddress" name="adress2" placeholder=" <%=adress[1] %> " class="form-control"> </div>
						<div class="col-md-6"> <input type="text" id="sample4_jibunAddress" name="adress3" placeholder=" <%=adress[2] %> " class="form-control"> </div>
					</div>
					<input type="text" id="sample4_detailAddress" name="adress4" placeholder=" <%=adress[3] %> " class="form-control">
				</div>
			</div>
			<div class="row">
				<div class="col-md-3">
					<button type="submit">회원정보 변경</button>	
				</div>
			</div>
		</form>	
	</div>
		
	


</body>
</html>























