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
	

	<h3> 아이디찾기 </h3>
	
	<div class="container">
		<div class="col-md-6">
			
		</div>
		<div class="col-md-6">
			<form action="" id="findidform">
				<div class="row m-3">
					<div class="col-md-3">
						<label>이름</label>
					</div>
					<div class="col-md-8">
						<input type="text" class="form-control ">
					</div>
				</div>
				<div class="row m-3">
					<div class="col-md-3">
						<label>번호</label>
					</div>
					<div class="col-md-8">
						<input type="text" class="form-control ">
					</div>
				</div>
				<div >
					<input id="submit" type="submit" value="아이디찾기" class="form-control m-3">
				</div>
			</form>	
		</div>	
	</div>


</body>
</html>