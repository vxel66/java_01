<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
		String id = (String)session.getAttribute("loginid");
		String password = (String)request.getParameter("password");
		System.out.print(id);
		System.out.print(password);
		
		boolean result = MemberDao.getmMemberDao().memberdelete(id, password);
		
		if(result){
			out.print(1);
		}else{
			out.print(0);
		}
	/* 	if(result){
			session.setAttribute("loginid", null);
			out.print("<script>alert('회원탈퇴 되었습니다');</script>");
			out.print("<script>location.href='../view/main.jsp';</script>");
		}else{
			out.print("<script>alert('회원탈퇴 오류');</script>");
			out.print("<script>location.href='../view/member/myinfo.jsp';</script>");
		}
	 */
%>
