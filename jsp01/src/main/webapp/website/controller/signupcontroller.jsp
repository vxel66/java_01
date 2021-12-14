<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		alert("abc");
	</script>


	<%
	//signup form에서 name으로 가져왔음
	request.setCharacterEncoding("UTF-8");
	String id =	request.getParameter("id");	
	String password =	request.getParameter("password");	
	String passwordconfirm =	request.getParameter("passwordconfirm");	
	String name =	request.getParameter("name");	
	String birth =	request.getParameter("birth");
	String sex =	request.getParameter("sex");
	String phone =	request.getParameter("phone");
	// 주소 우편번호+지번주소+도로명주소+상세주소 합친것
	String adress =	request.getParameter("adress1")+","
	+request.getParameter("adress2")+","+request.getParameter("adress3")+","+request.getParameter("adress4");
	
	Cookie cookie = new Cookie("message","qwe");
	response.addCookie(cookie);
	
	/* // 유효성검사 
			if( id.length() <5 ){
				out.print("<script>alert('아이디 5~15 사이로 입력해주세요');</script>");
				out.println("<script>location.href='../view/member/signup.jsp';</script>");
			}
			else if( password.length() <5  ){ 
				out.print("<script>alert('비밀번호는 5~15 사이로 입력해주세요');</script>");
				out.println("<script>location.href='../view/member/signup.jsp';</script>");
			}
			else if( !password.equals(passwordconfirm) ){ 
				out.print("<script>alert('비밀번호가 동일하지 않습니다');</script>");
				out.println("<script>location.href='../view/member/signup.jsp';</script>");
			}
			else if( name == null ){
				out.print("<script>alert('이름을 입력해주세요');</script>");
				out.println("<script>location.href='../view/member/signup.jsp';</script>");
			}
			else if( birth== null ){
				out.print("<script>alert('생년월일을 선택해주세요');</script>");
				out.println("<script>location.href='../view/member/signup.jsp';</script>");
			}
			else if( sex == null ){
				out.print("<script>alert('성별을 선택해주세요');</script>");
				out.println("<script>location.href='../view/member/signup.jsp';</script>");
			}
			else if( phone.length() != 11 ){
				out.print("<script>alert('연락처는 - 제외 한 11 자리로 입력해주세요');</script>");
				out.println("<script>location.href='../view/member/signup.jsp';</script>");
			}
			else if( request.getParameter("address4").indexOf(",") > 0 ){
				out.print("<script>alert('상세주소는 , 제외한 입력해주세요');</script>");
				out.println("<script>location.href='../view/member/signup.jsp';</script>");
			}
			else { */
				// 객체화
				Member member = new Member( id , password , name , birth , sex , phone , adress );
				// DB처리
				boolean result =  MemberDao.getmMemberDao().membersignup(member);
				if( result ){	// 회원가입 성공
					response.sendRedirect("../view/member/signupsuccess.jsp");
				}else{	// 회원가입 실패
					response.sendRedirect("../view/member/signup.jsp");
				}
			//}
	%>


</body>
</html>






















