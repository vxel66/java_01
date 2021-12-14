<%@page import="dao.ProductDao"%>
<%@page import="dto.Product"%>
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
	<% 
		//제품 상세페이지 == 게시물 보기
		int p_num = Integer.parseInt( request.getParameter("p_num"));
		Product product = ProductDao.getprProductDao().getproduct(p_num);
	%>

	<div class="container"> <!--  박스권 -->
		<div class="row">	<!--  가로 배치 -->
			<div class="col-md-6 " style="width: 50%;">
				<img alt="" src="../../img/<%=product.getP_img()%>" style="max-width: 100%;">
			</div>
			<div  class="col-md-6">
				<input type="hidden" class="p_num" name="p_num" value="<%=product.getP_num()%>" id="p_num">
				<p><%=product.getP_made() %></p>
				<h4><%=product.getP_name() %></h4>
				<hr>
					<div class="row">
						<div class="col-md-3">구매 혜택</div>
						<div class="col-md-9">포인트 1% 제공</div>
					</div> <br>
					<div class="row">
						<div class="col-md-3">배송정보</div>
						<div class="col-md-9">영업일 기중 1~3일(휴일 제외)</div>
					</div><br>
				<hr>	
					<div class="row">
						<div class="col-md-3">가격</div>
						<div class="col-md-9"><%=product.getprice() %> 원</div>
					</div> <br>
				<hr>
					<div class="row">	
						<p class="col-md-3">제품 사이즈</p>
						<select id="p_size" name="p_size"  class="col-md-9 form-control" >
							<option value="0"> 옵션선택 </option>
							<option value="L"> L </option>
							<option value="M"> M </option>
							<option value="S"> S </option>
						</select>	
					</div>
				<hr>
					<div class="row">
						<div class="col-md-3">수량</div>
						<div class="col-md-9 row no-gutters" > <!-- no-gutters : 여백 없애기 -->
							<div class="row">
							
								<button class="btn btn-outline-secondary" 
								onclick="pchange('p',<%=product.getP_count()%>,<%=product.getP_price()%>)">+</button>
								
								<div class="col-md-4">
									<input class="form-control" type="text" id="pcount" value="1" name="p_count"
									onchange="pchange('s',<%=product.getP_count()%>,<%=product.getP_price()%>)">
								</div>
								
								<button class="btn btn-outline-secondary" 
								onclick="pchange('m',<%=product.getP_count()%>,<%=product.getP_price()%>)">-</button>
							
							</div>	
						</div>
					</div> <br>	
				<hr>
					<div class="row">
						<div class="col-md-3">총 상품 금액</div>
						<div class="col-md-9 text-right">
							<span id="total"><%=product.getprice() %> </span>원 
						</div>
					</div> <br>
					
				<hr>
				<div>
					<button class="form-control bg-success text-white" style="font-size: 1.5rem">구매하기</button>
				</div>
				<div class="row my-3"> <!-- my : 마진[바깥여백] 세로 -->
					<div class="col-md-6">
						<button onclick="cartadd()"  class="form-control">장바구니</button> 
					</div>
					<div class="col-md-6">
						<%int m_num = 0 ;
						if(login!=null){m_num = login.getM_num();} %>
						<button class="form-control" onclick="plike(<%=product.getP_num()%>,<%=m_num %>)">
						<span id="love">좋아요<%
						
						if(ProductDao.getprProductDao().plikecheck(p_num, m_num)){
							out.print("♥");
						}else{
							out.print("♡");
						}
						
						%></span> </button>                        
					</div>
				</div>		
			</div>
		</div>
			<br> <br>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<ul class="navbar-nav col-md-12 text-center">
				<li class="nav-item col-md-3"> <a href="#detail" class="nav-link pview">상품상세</a>  </li>
				<li class="nav-item col-md-3"> <a href="#quide" class="nav-link pview">상품가이드</a>  </li>
				<li class="nav-item col-md-3"> <a href="#review" class="nav-link pview">상품리뷰</a>  </li>
				<li class="nav-item col-md-3"> <a href="#qna" class="nav-link pview">상품문의</a>  </li>
			</ul>
		</nav>
		
		<div id="detail">
			상품상세 위치 <br><br><br><br><br><br><br><br><br>
		</div>
		<div id="quide">
			상품가이드 위치	<br><br><br><br><br><br><br><br><br>
		</div>
		<div id="review">
			상품리뷰 위치 <br><br><br><br><br><br><br><br><br>
		</div>
		<div id="qna">
			상품문의 <br><br><br><br><br><br><br><br><br>
		</div>
		
		
		
	</div>

	
	
	
</body>
</html>














