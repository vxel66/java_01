<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>좋아요</title>
</head>
<body>
	<%if(request.getParameter("result")!=null&&request.getParameter("result").equals("false")){session.removeAttribute("loginid");}%>
	<%@include file="header.jsp" %>
	
		<div id="contents" class="carousel slide" data-ride="carousel" data-interval="2000">
		
			<ol class="carousel-indicators">
				<li data-target="contents" data-slide-to="0" class="active"></li>
				<li data-target="contents" data-slide-to="1"></li>
				<li data-target="contents" data-slide-to="2"></li>
			</ol>
		
			<div class="carousel-inner">
				<div class="carousel-item active"> <img alt="" src="/jsp01/website/img/메인1.png"> </div>
				<div class="carousel-item"> <img alt="" src="../img/메인2.jpg"> </div>
				<div class="carousel-item"> <img alt="" src="../img/메인3.jpg"> </div>
			</div>
		</div>
	
	<%@include file="footer.jsp" %>

	
	
	

</body>
</html>




























