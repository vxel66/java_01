<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<%
		// jsp 태그는 통신 결과로 가지 않음
		
	   	//1.ajax 통신할 데이터를 요청
		String userid = request.getParameter("userid");
		
		
		boolean idcheck = MemberDao.getmMemberDao().idcheck(userid);
		
		if(idcheck){
			out.print("1"); //jsp 태그에서 html에 작성하기
		}else{
			out.print("0");
		}
		
	%>


