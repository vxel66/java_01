<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="dto.login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


	<%
		
		//서버로 파일 업로드
		//MultipartRequest 객체명 = new MultipartRequest( 요청방식[request] ,업로드파일 폴더경로 , 용량(바이트) ,"인코딩타입", new DefaultFileRenamePolicy());     
		//1. 요청방식 : requst
		//2. 업로드할 폴더 경로
		//3. 용량 : 바이트 단위
		//4. 인코딩타입 : "UTF-8"
		//5. 보안 : new DefaultFileRenamePolicy() : 파일업로드시 중복값을 처리해줌   
		//String realpath ="C:/Users/505/git/java_010/jsp01/src/main/webapp/website/upload";
			//1.서버 실제 경로
		//String realpath = request.getSession().getServletContext().getRealPath("website/upload");
		
		//서버 실제경로
		String folderpath = request.getSession().getServletContext().getRealPath("website/upload");
		
		MultipartRequest multi = new MultipartRequest( request ,  folderpath , 
				1024*1024*10 ,"UTF-8" , new DefaultFileRenamePolicy() );
		
		request.setCharacterEncoding("UTF-8");
		String title = multi.getParameter("title");
		String contents = multi.getParameter("contents");
			// <br> , 프론트 < > 태그 제거
		contents = contents.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br>");
		
			title = title.replaceAll("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?(\\S)*(/)?","");			
		
		String file = multi.getFilesystemName("file");
		String file2 = multi.getFilesystemName("file2");	
				/* //요청 [일반 form]
				String title = request.getParameter("title");
				String contents = request.getParameter("contents");
				String file = request.getParameter("file"); */
		//작성자 번호
		login login = (login)session.getAttribute("login");
		String id = login.getM_id();
		int m_num = login.getM_num();
		
		Board board = new Board(title,contents,m_num,file,file2);
		
		int type = Integer.parseInt( request.getParameter("type"));
		System.out.print(type);
		
		if(type==1){
			boolean result = BoardDao.getboBoardDao().boardwrite(board);
			
		 	if(result){
				response.sendRedirect("../view/board/boardlist.jsp");
			}else{
				response.sendRedirect("../view/board/boardwrite.jsp");
			} 
		}else{
			int b_no = Integer.parseInt(multi.getParameter("b_no"));
			boolean result1 = BoardDao.getboBoardDao().boardupdate(board,b_no);
			if(result1){
				System.out.print("됨");
				response.sendRedirect("../view/board/boardlist.jsp");
			}else{
				System.out.print("안됨");
				response.sendRedirect("../view/board/boardwrite.jsp");
			}
		}
		
		
	%>
