<%@page import="dto.login"%>
<%@page import="dto.Member"%>
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%		
		
		login login2 = (login)session.getAttribute("login");		
		String id = login2.getM_id();
		String name = request.getParameter("name"); 
		String password = request.getParameter("password");
		String birth = request.getParameter("bir");
		String phone = request.getParameter("phone");
		String address =	request.getParameter("address1")+","
		+request.getParameter("address2")+","+request.getParameter("address3")+","+request.getParameter("address4");
		Member member = MemberDao.getmMemberDao().memberinfo(id);
		String sex = request.getParameter("sex");
		
		
		if(request.getParameter("type").equals("1")){
			boolean namecheck = MemberDao.getmMemberDao().memberupdate(name, id, member.getPassword(), member.getBrith(), member.getPhone(), member.getAdress(),member.getSex());                  
			if(namecheck){
				out.print(1);
			}else{
				out.print(2);
			}
		}else if(request.getParameter("type").equals("2")){
			boolean passwordcheck = MemberDao.getmMemberDao().memberupdate(member.getName(), id, password, member.getBrith(), member.getPhone(), member.getAdress(),member.getSex());                  
			if(passwordcheck){
				out.print(1);
			}else{
				out.print(2);
			}
		}else if(request.getParameter("type").equals("3")){
			boolean passwordcheck = MemberDao.getmMemberDao().memberupdate(member.getName(), id,  member.getPassword(), birth, member.getPhone(), member.getAdress(),member.getSex());                  
			if(passwordcheck){
				out.print(1);
			}else{
				out.print(2);
			}
		}else if(request.getParameter("type").equals("4")){
			boolean passwordcheck = MemberDao.getmMemberDao().memberupdate(member.getName(), id,  member.getPassword(), member.getBrith(), phone, member.getAdress(),member.getSex());                  
			if(passwordcheck){
				out.print(1);
			}else{
				out.print(2);
			}
		}else if(request.getParameter("type").equals("5")){
			boolean passwordcheck = MemberDao.getmMemberDao().memberupdate(member.getName(), id,  member.getPassword(), member.getBrith(), member.getPhone(),address,member.getSex());                  
			if(passwordcheck){
				out.print(1);
			}else{
				out.print(2);
			}
		}else if(request.getParameter("type").equals("6")){
			boolean passwordcheck = MemberDao.getmMemberDao().memberupdate(member.getName(), id,  member.getPassword(), member.getBrith(), member.getPhone(),member.getAdress(),sex);                  
			if(passwordcheck){
				out.print(1);
			}else{
				out.print(2);
			}
		}
		
		
		
	
%>
