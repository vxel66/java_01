<%@page import="dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    	
    	int p_num = Integer.parseInt(request.getParameter("p_num"));
    	boolean check = ProductDao.getprProductDao().productdelete(p_num);
    	if(check){
    		out.print("<script>alert('상품삭제되엇습니다');</script>");
    		out.println("<script>location.href='../view/admin/productview.jsp';</script>");
    	}else{
    		out.print("<script>alert('상품삭제안됨');</script>");
    		out.println("<script>location.href='../view/admin/productview.jsp';</script>");
    	}
    	
    %>