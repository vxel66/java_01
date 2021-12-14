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
	
	<div class="container">
		<div class="row">
			<form action="../../controller/productwrite.jsp"  class="form-control" method="post" enctype="multipart/form-data">
			제품명: <input type="text" name="p_name" class="form-control"><br>
			가격: <input type="text" name="p_price" class="form-control"><br>
			카테고리: <select name="p_category" class="custom-select">
						<option value="top">상의</option>
						<option value="pants">하의</option>
						<option value="outer">아우터</option>
					</select>
			<br>제조사: <input type="text"  class="form-control" name="p_made"><br>
			제품상태: <select name="p_activation" class="custom-select">
						<option value="1">판매</option>
						<option value="2">준비중</option>
						<option value="3">품절</option>
					</select>
			<br>제품상태: <select name="p_size" class="custom-select">
						<option value="1">S</option>
						<option value="2">M</option>
						<option value="3">L</option>
					</select>
			<br>재품재고:<input type="text" name="p_count"  class="form-control"> <br>
			재품이미지: <input type="file" name="p_img"  class="form-control">	<br>
			재품내용: <textarea rows="" cols="" name="p_contents"  class="form-control"></textarea>
			<div class="offset-11 col-md-1">
				<input type="submit" value="제품등록">
			</div>
			</form>
		</div>
	</div>



</body>
</html>