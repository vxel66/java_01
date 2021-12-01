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
	<h3>로그인</h3>
	
	<%
	
	Cookie cookie = new Cookie("qweqwe","qweqwe");
	response.addCookie(cookie);
	
	%>
	
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<img alt="" src="../../img/signup.webp" width="100%">
			</div>
			<div class="col-md-6">
				<form action="../../controller/logincontroller.jsp" method="post">
					<div class="row">
						<div class="col-md-3 m-2"><label>아이디</label> </div>
						<div class="col-md-8"> <input type="text" name="id" placeholder="id" class="form-control"> </div>
					</div> 
					<div class="row">
						<div class="col-md-3 m-2"> <label>비밀번호</label> </div>
						<div class="col-md-8"> <input type="text" name="password" placeholder="pw" class="form-control"> </div>
					</div>
					<div>
							<input type="submit" value="로그인하기" class="form-control p-3 m-3" >
					</div>
					<div class="text-rigth m-2">
						<a href="#" class="btn text-dark">비밀번호 찾기</a><a href="#" class="btn text-dark">아이디 찾기</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	
	

</body>
</html>