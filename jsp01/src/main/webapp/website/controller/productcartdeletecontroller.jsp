<%@page import="dto.login"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.Cart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		login login = (login)session.getAttribute("login");
		String sname= "cart"+ login.getM_id();
		String type = request.getParameter("type");
		int p_num = Integer.parseInt( request.getParameter("p_num"));
		String p_size = request.getParameter("p_size");
		
		if(type.equals("all")){
			session.setAttribute(sname, null);
		}
		else if(type.equals("in")){
			ArrayList<Cart> carts= (ArrayList<Cart>)session.getAttribute(sname);
			for( Cart cart : carts){
				if(cart.getP_num()==p_num && cart.getP_size().equals(p_size)){
					carts.remove(cart);
					break;
				}
			}
		}
	
	%>


</body>
</html>