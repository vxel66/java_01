<%@page import="dto.login"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.Cart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%	
		// 선택한 제품의 제품번호 , 사이즈 , 수량
		
		int p_num = Integer.parseInt(request.getParameter("p_num")) ;
		String p_size = request.getParameter("p_size");
		int p_count = Integer.parseInt(request.getParameter("p_count"));
		
		Cart cart = new Cart(p_num,p_size,p_count);
		
		ArrayList<Cart> carts = new ArrayList<>();
		carts.add(cart);
		//세션 저장 [ 이름 : cart+아이디 값 : cart리스트]
		login login = (login)session.getAttribute("login");	//세션 자료형은 object
		String sname= "cart"+ login.getM_id();
		session.setAttribute(sname, carts);
		
		//비동기식 사용시 페이지 전환 x
		//response.sendRedirect("../view/product/productcart.jsp");		
%>

