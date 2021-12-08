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
	<form action="12.틱택토.jsp">
	<%!int[] 게임판= {0,0,0,0,0,0,0,0,0,0}; %>
	
	<%for(int i=1; i<=9; i++){ %>
		<button name="btn" value="<%=i%>"> <%=i%>버튼</button>		
	<%	if(i%3==0){
		out.print("<br>");
	}
	 }
	
	int select= 0;
	if(request.getParameter("btn")!=null){
		select= Integer.parseInt(request.getParameter("btn"));	
		if(게임판[select]==0){
			게임판[select]=1;
			while(true){
			Random random = new Random();
			int com = random.nextInt(9);
			
			if( 게임판[com]==0 ){ 게임판[com] = 2 ; break; }
			}
		}
	}
	// 컴퓨터 난수 생성
	%>
	</form>
	<h1> 게임판 <%=게임판[select] %> </h1>
 	<%
	for(int i=1; i<=9; i++){ %>
		<button  > <%=게임판[i]%> </button>		
	<%	if(i%3==0){
		out.print("<br>");
	}
	 } 
	%> 
	<%
	
	
	%>
	<form action="12.틱택토.jsp">
		<% for(int i =0; i<=게임판.length; i++){ 게임판[i]=0; } %>
		<button type="submit"> 리셋 </button>
	</form>
	
	
</body>
</html>



















