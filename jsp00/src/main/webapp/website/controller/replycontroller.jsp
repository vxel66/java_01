<%@page import="dto.login"%>
<%@page import="dto.Reply"%>
<%@page import="dao.MemberDao"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int b_num = Integer.parseInt(request.getParameter("b_num"));
	String contents = request.getParameter("contents");
	login login = (login)session.getAttribute("login");
	String id = login.getM_id();
	int m_num = MemberDao.getmMemberDao().member_num(id);
	
	
	Reply reply = new Reply(contents,m_num,b_num);
	 
	boolean check = BoardDao.getboBoardDao().replywrite(reply);
	
	if(check){
		out.print(1);
	}else{
		out.print(2);
	}
%>
	
	
