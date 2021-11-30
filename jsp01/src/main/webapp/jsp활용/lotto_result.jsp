<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="header.jsp" %>
	
	<%int[] number = new int[6]; // int형 6개 변수를 저장할수 있는 배열 
	  int[] random = new int[6]; %>
	<% 
		number[0]= Integer.parseInt(request.getParameter("1"));
		number[1]= Integer.parseInt(request.getParameter("2"));
		number[2]= Integer.parseInt(request.getParameter("3"));
		number[3]= Integer.parseInt(request.getParameter("4"));
		number[4]= Integer.parseInt(request.getParameter("5"));
		number[5]= Integer.parseInt(request.getParameter("6"));
		%> 
		<%
		for(int i=0; i<6 ; i++){
			if(number[i]<1||number[i]>45){
				response.sendRedirect("lotto.jsp?check=false");
			}
		}
		%>
	<%
		for(int i = 0 ; i<6 ; i++){
			for(int j = i+1; j<6 ; j++){
				if(number[i]==number[j]){
					response.sendRedirect("lotto.jsp?check2=false");
				}
			}
	}
	%>
	
	<%for( int i = 0 ; i<6 ;i++ ) {
		Random random2 = new Random(); // 난수 객체 선언 
		int num = random2.nextInt(45)+1; // 난수 객체에서 1~45사이의 난수 가져오기 
	
		Boolean check = true;  // 중복여부 확인 체크 
		for( int j = 0 ; j<6 ;j++ ) { // 반복하면서 배열내 중복값 찾기 
			if( num == random[j] ) { // 만약에 난수가 기존 배열내 값과 동일하면 
				i--;
				check = false;
				break;
			}
		}
		if( check ) random[i] = num; // 중복값이 없을경우 i번째에 난수 넣기 
	} %>
		이번주 추첨 번호 : 
	<%for(int i = 0; i<6; i++){
		out.print(random[i]+",");	
		}
			%>
			<br>	선택 번호 : 
	<%for(int i = 0; i<6; i++){
		out.print(number[i]+",");	
		}
			%>
	<%int count=0;
	for(int i = 0; i<6 ; i++){
		for(int j = 0 ; j<6; j++){
			if(number[i]==random[j]){
				count++;
			}
		}
	}
	%>
	<br>추첨결과 : <%=count %>

	
</body>
</html>