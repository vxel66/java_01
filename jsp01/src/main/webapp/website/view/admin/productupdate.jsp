<%@page import="dao.ProductDao"%>
<%@page import="dto.Product"%>
<%@page import="java.util.ArrayList"%>
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
		int p_num = Integer.parseInt(request.getParameter("p_num"));
		
		ArrayList<Product> products = ProductDao.getprProductDao().getproduct();
		
		for(Product product : products){
			
		if(product.getP_num()==p_num){
	%>


	<div class="container">
		<div class="row">
			<div class="offset-2 col-md-8">
				<form action="../../controller/productupdate.jsp?p_num=<%=p_num %>" class="form-control" method="post" enctype="multipart/form-data">
					<div class="row m-2">
						제품명 : <input type="text" name="p_name"  class="form-control" placeholder=<%=product.getP_name() %>>
					</div>
					<div class="row m-2">
						제품가격 : <input type="text" name="p_price"  class="form-control" placeholder=<%=product.getprice() %>>
					</div>
					<div class="row m-2">
				카테고리: <select name="p_category" class="custom-select">
							<option value="none"><%=product.getP_category() %></option>
							<option value="top">상의</option>
							<option value="pants">하의</option>
							<option value="outer">아우터</option>
						</select>
					</div>
					<div class="row m-2">
						제품제조다 : <input type="text"  class="form-control"  name="p_made" placeholder=<%=product.getP_made() %>>
					</div>
					<div class="row m-2">
					제품사이즈: <select name="p_size" class="custom-select" >
							<option value="none"><%=product.getP_size() %></option>
							<option value="1">S</option>
							<option value="2">M</option>
							<option value="3">L</option>
						</select>
					</div>
					<div class="row m-2">
						제품재고 : <input type="text" name="p_count"  class="form-control" placeholder=<%=product.getP_count() %>>
					</div>
					<div class="row m-2">
						제품이미지 : <input type="file" name="p_img"  class="form-control" placeholder=<%=product.getP_img() %>>
					</div>
					<div class="row m-2">
						제품설명 : <input type="text" name="p_contents"  class="form-control" placeholder=<%=product.getP_contents() %>>
					</div>
					<div class="row m-2">
						<button type="submit" class="btn float-right by-5 btn-info">수정하기</button>
					</div>
				</form>
			</div>	
		</div>
	</div>

<%} }%>

</body>
</html>