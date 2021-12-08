<%@page import="dto.login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	<!-- 부트스트랩 설정 -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
	<!-- css 호출 -->
	<link rel="stylesheet" href="../css/main.css">
	
</head>
<body>

	<%
		login login = (login)session.getAttribute("login");
		String loginid = null;
		if(login != null){loginid = login.getM_id();}
	%>

	<div class="fixed-top bg-white">
		<div class="container">
			<header class="py-3">
				<div class="row"> <!-- 가로배치 -->
					<div class="col-md-4 offset-4 text-center"> <!-- 로고 -->
						<a href="/jsp01/website/view/main.jsp" class="headerlogo">로고</a>
					</div>
					<div class="col-md-4 d-flex justify-content-end " class="headermenu"> <!-- 상단메뉴 -->
						<ul class="nav">
							<%if(loginid!=null&&loginid.equals("admin")){%><li> <a href=""> 관리자 </a> </li> <%}%>
							<%if(loginid!=null){ %>
							<li> <a href="/jsp01/website/view/member/myinfo.jsp"> 내정보 </a> </li>
							<li> <a href="/jsp01/website/view/main.jsp?result=false" id="logout" > 로그아웃 </a> </li>
						<% }else{ %>
							<li> <a href="/jsp01/website/view/member/signup.jsp">회원가입</a> </li>
							<li> <a href="/jsp01/website/view/member/login.jsp">로그인</a> </li>
						<% }%>
						</ul>
					</div>
				</div>			
			</header>
			<!-- 헤더 메뉴 -->
			<nav class="navbar navbar-expand-lg navbar-light bg-white">
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#manubar">
					<span class="navbar-toggler-icon"></span>
				</button>
				
				<div class="collapse navbar-collapse" id="manubar">
					<ul class="navbar-nav col-md-12 justify-content-between">
						<li class="nav-item"> <a href="#" class="nav-link">신차</a> </li>
						<li class="nav-item"> <a href="#" class="nav-link">베스트</a> </li>
						<li class="nav-item"> <a href="#" class="nav-link">브랜드별</a> </li>
						<li class="nav-item"> <a href="#" class="nav-link">국산차</a> </li>
						<li class="nav-item"> <a href="#" class="nav-link">수입차</a> </li>
						<li class="nav-item"> <a href="#" class="nav-link">이벤트</a> </li>
						<li class="nav-item"> <a href="#" class="nav-link">구매후기</a> </li>
						<li class="nav-item"> <a href="/jsp01/website/view/board/boardlist.jsp" class="nav-link">고객센터</a> </li>
					</ul>
				</div>
			</nav>		
		</div>
	</div>
	
	<br><br><br><br><br><br><br>

	
	
	
	<!-- 부스트랩 js 설정 -->
	<script src="https://code.jquery.com/jquery-3.5.1.js"></script>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

	<!-- 본인 js 호출 -->
	<script src="/jsp01/website/js/main.js"></script>
	<!-- 다음 주소 api js 호출 -->
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	
	

	
		<script type="text/javascript">
		
			
			
		</script>
	

</body>
</html>















