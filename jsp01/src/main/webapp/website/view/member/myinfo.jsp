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

		<%@include file="../header.jsp" %>
		
		<% 
			String id = (String)session.getAttribute("loginid");
			Member member = MemberDao.getmMemberDao().memberinfo(id);
		%>

		<div class="container">
			<div>
				<h3>회원정보</h3>
			</div>
		
			<div class="row">
				<div class="col-md-3"> <!-- 사이드바 -->
					<div class="nav flex-column nav-pills">
						<a class="nav-link" data-toggle="pill" href="#pills-order">주문목록</a>
						<a class="nav-link" data-toggle="pill" href="#memberinfo">회원정보</a>
						<a class="nav-link" data-toggle="pill" href="#memberwrite">내가쓴글</a>
						<a class="nav-link" data-toggle="pill" href="#memberupdate">회원수정</a>
						<a class="nav-link" data-toggle="pill" href="#memberdelete">회원탈퇴</a>
					</div>
				</div>
				<div class="col-md-9"> <!-- 내용 -->
					<div class="tab-content" id="pills-tabcontent">
						<div class="tab-pane fade show active" id="pills-order">
							<h3> 주문 목록 </h3>
							<div class="container">
								하하하하하하하
							</div>
						</div>
						<div class="tab-pane fade " id="memberinfo">
							<h3> 회원정보 </h3>
							<div class="container">
								<table class="table text-center">
									<thead>
										<tr>
											<th colspan="2">개인정보</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>아이디</td> <td colspan="2"><%=member.getId() %> </td>
										</tr>
										<tr>
											<td>회원명</td> <td id="tdname"><%=member.getName() %> </td ><td > <button onclick="namechange()">수정</button> </td>                       
										</tr>
										<tr>
											<td>비번</td> <td id="tdpw"><%=member.getPassword() %> </td> <td> <button onclick="pwchange()">수정</button> </td>
										</tr>
										<tr>
											<td>생년월일</td> <td id="tdbir"><%=member.getBrith() %> </td> <td> <button onclick="birchange()">수정</button> </td>
										</tr>
										<tr>
											<td>연락처</td> <td id="tdph"><%=member.getPhone() %> </td> <td> <button onclick="phonechange()">수정</button> </td>
										</tr>
										<tr>
											<td>주소</td> <td id="tdaddress"><%=member.getAdress() %> </td> <td> <button onclick="addressbtn()">수정</button> </td>
										</tr>
										<tr style="display: none;" id="address1">
											<td colspan="3">
												<div class="row">	<!-- 3:8 -->
													<div class="col-md-3 m-2"> <label>주소</label> </div>
													<div class="col-md-8"> 
														<div class="row">
															<div class="col-md-6"> <input type="text" id="sample4_postcode" name="adress1" placeholder="우편번호" class="form-control"> </div>
															<div class="col-md-6"> <input type="button"  onclick="sample4_execDaumPostcode()" value="우편번호 찾기" class="form-control"><br> </div>
														</div>
														<div class="row">
															<div class="col-md-6"> <input type="text" id="sample4_roadAddress" name="adress2" placeholder="도로명주소" class="form-control"> </div>
															<div class="col-md-6"> <input type="text" id="sample4_jibunAddress" name="adress3" placeholder="지번주소" class="form-control"> </div>
														</div>
														<input type="text" id="sample4_detailAddress" name="adress4" placeholder="상세주소" class="form-control">
													</div>
												</div>
												<div>
													<button id="addresschange">확인</button>
												</div>
											</td>
										</tr>
										
										<tr>
											<td>포인트</td> <td colspan="2"><%=member.getPoint() %> </td> 
										</tr>
										<tr>
											<td>성별</td> <td id="tdsex"><%=member.getSex() %> </td> <td> <button onclick="sexchange()">수정</button> </td> 
										</tr>
										<tr style="display: none;" id="trsex">
											<td colspan="3">
												<div class="row">	<!-- 3:8 -->
													<div class="col-md-3 m-2"> <label>성별</label> </div>
													<div class="col-md-8 text-center"> 
													
														<input type="radio"  id="sex1" name="sex" value="man"> 남
														<input type="radio" id="sex2" name="sex" value="woman"> 여
														
													</div>
												</div>
												<div>
													<button id="sexchange">확인</button>
													<label id="sexresult"> </label>
												</div>
											</td>
										</tr>
										<tr>
											<td>가입일</td> <td colspan="2"> <%=member.getM_sdate() %> </td> 
										</tr>
									</tbody>
								</table>
							</div>
						</div>
						<div class="tab-pane fade " id="memberwrite">
							<h3> 주문 목록 </h3>
							<div class="container">
								하하하하하하하
							</div>
						</div>
						<div class="tab-pane fade " id="memberupdate">
							<h3> 회원수정 </h3>
							<div class="container">
								하하하하하하하
							</div>
						</div>
						<div class="tab-pane fade " id="memberdelete">
							<div class="container">
								<div class="col-md-8 offset-3">
									<h3>정말 회원탈퇴 하시겠습니까?</h3><br>
									<form id="deleteform" >
										<input name="memberpw" id="memberpw" type="password" class="form-control " value="패스워드" >
										<br>
										<input type="button" id="delete" value="확인">
										<span id="deleteresult"> </span>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		


</body>
</html>