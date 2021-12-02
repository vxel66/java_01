<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	<!-- 부트스트랩 설정 -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
	<!-- css 호출 -->
	<link rel="stylesheet" href="view/css/main.css">
	
</head>
<body>
	
	
	
	<!-- 부스트랩 js 설정 -->
	<script src="https://code.jquery.com/jquery-3.5.1.js"></script>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

	<!-- 본인 js 호출 -->
	<script src="/jsp01/website/js/main.js"></script>
	<!-- 다음 주소 api js 호출 -->
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	
	
	<h3>헤더 부분</h3>
	<p> <%if(session.getAttribute("loginid")!=null){ 
		out.print(session.getAttribute("loginid")+"님 안녕하세요");
	}
	%>  </p>
	
	
	<div> <a href="/jsp01/website/view/main.jsp">로고</a> </div>
	<ul>
		
		<%if(session.getAttribute("loginid")!=null){ %>
			<li> <a href="/jsp01/website/view/member/myinfo.jsp"> 내정보 </a> </li>
			<li><a  href="/jsp01/website/view/main.jsp?result=false" id="logout" > 로그아웃 </a> </li>
		<% }else{ %>
			<li> <a href="/jsp01/website/view/member/signup.jsp">회원가입</a> </li>
			<li> <a href="/jsp01/website/view/member/login.jsp">로그인</a> </li>
		<% }%>
		
	</ul>
	
		<script type="text/javascript">
		
			
			
		</script>
	

</body>
</html>














