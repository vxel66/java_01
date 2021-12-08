<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
	Calendar calendar = Calendar.getInstance(); 
	
	int year = Integer.parseInt(request.getParameter("year"));
	int month = Integer.parseInt(request.getParameter("month")); // 0:1월 ~~ 11:12월
	
	calendar.set(year, month-1 , 1);
	
	// *해당 월의 1일 요일찾기 
	int sweek = calendar.get( Calendar.DAY_OF_WEEK); // 6
	// *해당 월의 마지막 일 찾기 [ .getActualMaximum( 필드 ) : 해당 필드의 최대값 ]
	int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
	
	%>
	<h1> <%=year %>년  <%=month %>월 달력 [ day12-5 ] </h1>
	
	<table border="1">
		<thead>
			<tr>
				<th>일요일</th><th>월요일</th><th>화요일</th><th>수요일</th>
				<th>목요일</th><th>금요일</th><th>토요일</th>
			</tr>
		</thead>	
		<tbody>	
			<tr>
			<%for(int i =1; i<sweek; i++){%>
				<td></td>
			<% }	%>
			<%for(int i =1; i<=eday; i++){%>
				<td> <%out.print(i); %> </td>
				
			<%
			if(sweek % 7 ==0 ){
			%>
				</tr> <tr>
			<%
			}
			sweek++;
			}
			%>
		</tbody>		
	</table>


</body>
</html>