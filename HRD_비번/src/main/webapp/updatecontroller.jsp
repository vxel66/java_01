

<%@page import="DAO.member_tbl_02_DAO"%>
<%@page import="DTO.member_tbl_02_DTO"%>
<%
	
	request.setCharacterEncoding("utf-8");
	String re = request.getParameter("custno");
	member_tbl_02_DTO dto = new member_tbl_02_DTO(
			request.getParameter("custno"),
			request.getParameter("custname"),
			request.getParameter("phone"),
			request.getParameter("address"),
			request.getParameter("joindate"),
			request.getParameter("grade"),
			request.getParameter("city")
			);
	member_tbl_02_DAO dto2 = new member_tbl_02_DAO();
	dto2.update(dto); 
	response.sendRedirect("update.jsp?custno="+re);

%>