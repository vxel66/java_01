<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>


	<%
	
		request.setCharacterEncoding("UTF-8");
		String filename = request.getParameter("file");
		//해당 파일을 객체화
		String realpath = request.getSession().getServletContext().getRealPath("website/upload/"+filename);
						//request.getSession().getServletContext().getRealPath
		//서버내 업로드 폴더내 파일 찾아서 파일 객체화
		File file =new File(realpath);
		// 클라이언트에게 응답하기
		response.setHeader("Content-Disposition", "attachment;filename="+filename+";");
		//내보내기 [스트림 바이트]
			//1. 배열 선언
			byte[] b = new byte[(int)file.length()]; //file.length : 파일내 바이트 길 메소드
			if(file.isFile()){ //file.isFile(): 파일이 있는지 없는지 유무 확인
				// 입력스트림 [파일을 바이트형으로 읽어오기]
				BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));
				// 출력스트림 [ 읽어온 바이트형 파일을 내보내기 ]
				BufferedOutputStream outputStream = new BufferedOutputStream(response.getOutputStream());
				
				inputStream.read(b);
				outputStream.write(b);
				
				inputStream.close(); //입력 스트림 닫기
				outputStream.close();//출력 스트림 닫기 
			}
			
	%>