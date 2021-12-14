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
		login login = (login)session.getAttribute("login");	//세션 자료형은 object
		
		String sname= "cart"+ login.getM_id();
		Cart cart = new Cart(p_num,p_size,p_count);
		
			//기존 카트가 있을경우 없을경우
			ArrayList<Cart> carts =  (ArrayList<Cart>)session.getAttribute(sname); //1. 카트세션 호출
			
			if(carts.size()==0){ //2. 카트세션이 없을겨우
				carts = new ArrayList<>(); //3.카트리스트에 메모리 할당
				carts.add(cart);			//4.카트리스트에 추가
				// 세션에 저장
				session.setAttribute(sname, carts);	//5.카트세션 생성
			}else{	//6.카트세션이 있을경우
				carts.add(cart);	//7.카트리스트에 제품 추가
				session.setAttribute(sname, carts);	//8.세션 다시 할당 
			}
			
		
		 
	
		//세션 저장 [ 이름 : cart+아이디 값 : cart리스트]
		
		
		
		//비동기식 사용시 페이지 전환 x
		//response.sendRedirect("../view/product/productcart.jsp");		
%>
