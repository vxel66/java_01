<%@page import="dto.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProductDao"%>
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
	
	
	<div class="container text-center">
		<h3>신제품</h3>
		<p>New ARRIVAL</p>
	</div>
	
	
	<div class="contatiner">
		<div class="row">
			<%	ArrayList<Product> producs =
				ProductDao.getprProductDao().getproduct();
				for(Product product : producs){			
			%>
			<div class="col-md-4">
				<div class="card">
					<a href="../product/productview.jsp?p_num=<%=product.getP_num()%>">
						<img class="card-img-top" alt="" src="../../img/<%=product.getP_img()%>">
					</a>
					<div class="card-body">
						<p class="card-text">제품명 : <%=product.getP_name() %> </p>
						<hr>
						<p class="item">
						<%=product.getP_contents() %> <br><br>
						<span>가격 : <%=product.getprice()%></span><br>
						<span class="badge badge pill badge-danger"><%=product.getact() %></span>
						</p>
					</div>
				</div>
			</div>
			<%} %>
		</div>
	</div>
	


</body>
</html>