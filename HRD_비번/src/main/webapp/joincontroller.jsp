
<%@page import="DAO.member_tbl_02_DAO"%>
<%@page import="DTO.member_tbl_02_DTO"%>
<%
	
	request.setCharacterEncoding("utf-8");
	member_tbl_02_DTO dto = new member_tbl_02_DTO(
			request.getParameter("custno"),
			request.getParameter("custname"),
			request.getParameter("phone"),
			request.getParameter("address"),
			request.getParameter("joindate"),
			request.getParameter("grade"),
			request.getParameter("city")
			);
	System.out.print(dto.getCustname());
	member_tbl_02_DAO dao = new member_tbl_02_DAO();
	
	boolean result = dao.join(dto);
	if(result){
		System.out.print("1");
	}else{
		System.out.print("2");
	}
	response.sendRedirect("join.jsp");


%>