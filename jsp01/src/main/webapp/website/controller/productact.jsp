<%@page import="dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

 	int p_num = Integer.parseInt(request.getParameter("p_num"));
	
	int p_act = ProductDao.getprProductDao().productnumact(p_num);
	System.out.print(p_act);
	if(p_act==1){
		p_act=2;
	}else if(p_act==2){
		p_act=3;
	}else{
		p_act=1;
	}
	boolean check = ProductDao.getprProductDao().productact(p_num, p_act);
	if(check){
		out.print(1);
	}else{
		out.print(2);
	}

	 
%>