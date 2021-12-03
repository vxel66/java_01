/* 다음주소 api */
function sample4_execDaumPostcode() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

            // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var roadAddr = data.roadAddress; // 도로명 주소 변수
            var extraRoadAddr = ''; // 참고 항목 변수

            // 법정동명이 있을 경우 추가한다. (법정리는 제외)
            // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
            if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                extraRoadAddr += data.bname;
            }
            // 건물명이 있고, 공동주택일 경우 추가한다.
            if(data.buildingName !== '' && data.apartment === 'Y'){
               extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
            }
            // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
            if(extraRoadAddr !== ''){
                extraRoadAddr = ' (' + extraRoadAddr + ')';
            }

            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById('sample4_postcode').value = data.zonecode;
            document.getElementById("sample4_roadAddress").value = roadAddr;
            document.getElementById("sample4_jibunAddress").value = data.jibunAddress;
            
            // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
            if(roadAddr !== ''){
                document.getElementById("sample4_extraAddress").value = extraRoadAddr;
            } else {
                document.getElementById("sample4_extraAddress").value = '';
            }

            var guideTextBox = document.getElementById("guide");
            // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
            if(data.autoRoadAddress) {
                var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                guideTextBox.style.display = 'block';

            } else if(data.autoJibunAddress) {
                var expJibunAddr = data.autoJibunAddress;
                guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                guideTextBox.style.display = 'block';
            } else {
                guideTextBox.innerHTML = '';
                guideTextBox.style.display = 'none';
            }
        }
    }).open();
}
/* 다음주소 api end */

// 아이디 중복체크 [ajax] start
	$( function() {
		$("#id").change(function() {
			//비동기식 : $.ajax({속성명:"값",속성명:"값"});
			$.ajax({
				url : "idcheck.jsp", // 통신할 경로명
				data : { userid:document.getElementById("signupform").id.value } ,	//이동할데이터	
				success : function(abc){ //성공했을때
					
					if(abc != 1){
						 document.getElementById("idresult").innerText="사용가능";
						 document.getElementById("idresult").style.color="green";
					}else{
						document.getElementById("idresult").innerText="현재 사용중인 아이디입니다";
						document.getElementById("idresult").style.color="red";
					}
				
				}
				
			});
		});
		
		// $ ("id명").이벤트명(함수명(){실행코드;});
		
	})
		
	
// 아이디 중복체크 end

// 회원가입 유효성검사 start

	
	function signupcheck(){
		
		//1.폼 가져오기
		//document.getElementById("signupform")
		//2.폼내 아이디 입력 input 가져오기
		var id = document.getElementById("signupform").id.value;
		var password = document.getElementById("password").value;
		var passwordconfirm = document.getElementById("passwordconfirm").value;
		var name = document.getElementById("name").value;
		var birth = document.getElementById("birth").value;
		var sex1 = document.getElementById("sex1").checked; //체크 유무
		var sex2 = document.getElementById("sex2").checked;
		var phone = document.getElementById("phone").value;
			//alert(id);
		//3. 유효성검사 [정규표현식 : 텍스트 패턴 검사]
			//정규표현식
			var idj = /^[a-z0-9]{5,12}$/;
			var pwj = /^[A-Za-z0-9]{5,12}$/;
			var phonej = /^01([0|1|6|7|8|9]?)?([0-9]{3,4})?([0-9]{4})$/;
			var namej= /^[가-힣]{3,5}$/;
			/*
				/^ :정규표현식 시작
				$/ : 정규표현직 끈
				[] : 문자 패턴
					[a-z] : 소문자 a-z 만 가능
					[A-Z] : 대문자 A-Z 만 가능
					[0-9] : 숫자 0-9 만 가능
					[가-힣] : 한글 만 가능
				{최소값,최대값} : 문자 개수
					{최소길이,최대길이} 
					{5 , 12} : 5~15 길이만 가능
				( ) : 문자 하나로 인식
					01([0|1|6|7|8|9]?) : 중하나
				와일드 카드
				* : 문자 없거나 혹은 여러개 존재	
				? : 문자 있거나 혹은 하나 있음	 [ ? 당 문자 1개 ]
			*/ 
			
		if(!idj.test(id)){
			//alert("가능");
			document.getElementById("idresult").innerHTML="id는 소문자 숫자조합 5-15사이 가능";
			document.getElementById("idresult").style.color="red";
			return false;
		}else{
			document.getElementById("idresult").innerHTML="가능";
			document.getElementById("idresult").style.color="green";
		}
		if(!pwj.test(password)){
			document.getElementById("passwordresult").innerHTML="password는 소문자 숫자조합 5-15사이 가능";
			document.getElementById("passwordresult").style.color="red";
			return false;
		}else{
			document.getElementById("passwordresult").innerHTML="가능";
			document.getElementById("passwordresult").style.color="green";
		}
		if(password==passwordconfirm){
			document.getElementById("passwordconfirmresult").innerHTML="가능";
			document.getElementById("passwordconfirmresult").style.color="green";
		}else{
			document.getElementById("passwordconfirmresult").innerHTML="비밀번호가 다릅니다";
			document.getElementById("passwordconfirmresult").style.color="red";
			return false;
		}
		
		if(name==""){
			document.getElementById("nameresult").innerHTML="이름을 입력해주세요";
			document.getElementById("nameresult").style.color="red";
			return false;
		}
		else{
			document.getElementById("nameresult").innerHTML="이름이 입력되었습니다";
			document.getElementById("nameresult").style.color="green";
		}
		if(!namej.test(name)){
			//alert("가능");
			document.getElementById("nameresult").innerHTML="이름은 한글만 가능합니다";
			document.getElementById("nameresult").style.color="red";
			return false;
		}else{
			document.getElementById("nameresult").innerHTML="가능";
			document.getElementById("nameresult").style.color="green";
		}
		if(birth==""){
			document.getElementById("birthresult").innerHTML="생일을 입력해주세요";
			document.getElementById("birthresult").style.color="red";
			return false;
		}
		else{
			document.getElementById("birthresult").innerHTML="생일이 입력되었습니다";
			document.getElementById("birthresult").style.color="green";
		}
		if(!sex1&&!sex2){ //둘다 false 이면 //둘다 체크를 안했으면
			document.getElementById("sexresult").innerHTML="성별을 선택해주세요";
			document.getElementById("sexresult").style.color="red";
			return false;
		}else{
			document.getElementById("sexresult").innerHTML="가능";
			document.getElementById("sexresult").style.color="green";
		}
		
		if(phonej.test(phone)){
			document.getElementById("phoneresult").innerHTML="가능";
			document.getElementById("phoneresult").style.color="green";
		}else{
			document.getElementById("phoneresult").innerHTML="불가능";
			document.getElementById("phoneresult").style.color="red";
			return false;
		}
		
		
		
		
		
	}
	// 회원탈퇴 [ajax : jqury 있어야함]
	
	$(function(){
		$("#delete").click(function(){
			// ajax : 비동기식 통신 { 페이지 이동없이 통신 }
			$.ajax({
				url : "../../controller/deletecontroller.jsp",
				data : {password:document.getElementById("memberpw").value},
				success: function( result ){
					if(result==1){
						alert('회원탈퇴 되었습니다');
						location.href='../view/main.jsp';
					}else{
						document.getElementById("deleteresult").innerHTML="비밀번호가 다릅니다";
					}
				}
				 		
			})
		});
	});
		
	// 이름 버튼변경
	function namechange(){ 
	document.getElementById("tdname").innerHTML = "<input type='text' id='name' class='form-control'> <button id='namechangebtn' class='form-control'>확인</button>"
	
	$(function(){
		$("#namechangebtn").click(function(){
			alert("클릭");
			$.ajax({
				url : "../../controller/namecontroller.jsp",
				data : {type:1,
						name:document.getElementById("name").value}, 	
				success: function(result){
					alert(result);
					if(result==1){
						alert('수정');
						location.href='../member/myinfo.jsp';
					}else{
						alert('수정안됨');
						location.href='../member/myinfo.jsp';
					}
				}	
			})
		});
	});
	
	
	}
	// 비번 버튼변경
	function pwchange(){ 
	document.getElementById("tdpw").innerHTML = "<input type='text' id='password' class='form-control'> <button id='passwordchangebtn' class='form-control'>확인</button>"           
	
	$(function(){
		$("#passwordchangebtn").click(function(){
			alert("클릭");
			$.ajax({
				url : "../../controller/namecontroller.jsp",
				data : {type:2,
						password:document.getElementById("password").value}, 	
				success: function(result){
					alert(result);
					if(result==1){
						alert('수정');
						location.href='../member/myinfo.jsp';
					}else{
						alert('수정안됨');
						location.href='../member/myinfo.jsp';
					}
				}	
			})
		});
	});
	
	
	}
	
		// 생년
	function birchange(){ 
	document.getElementById("tdbir").innerHTML = "<input type='date' id='birth' class='form-control'> <button id='birchangebtn' class='form-control'>확인</button>"
	
	$(function(){
		$("#birchangebtn").click(function(){
			alert("클릭");
			$.ajax({
				url : "../../controller/namecontroller.jsp",
				data : {type:3,
						bir:document.getElementById("birth").value}, 	
				success: function(result){
					alert(result);
					if(result==1){
						alert('수정');
						location.href='../member/myinfo.jsp';
					}else{
						alert('수정안됨');
						location.href='../member/myinfo.jsp';
					}
				}	
			})
		});
	});
	
	
	}
			// 번호
	function phonechange(){ 
	document.getElementById("tdph").innerHTML = "<input type='text' id='phone' class='form-control'> <button id='phonechangebtn' class='form-control'>확인</button>" 
	
	$(function(){
		$("#phonechangebtn").click(function(){
			alert("클릭");
			$.ajax({
				url : "../../controller/namecontroller.jsp",
				data : {type:4,
						phone:document.getElementById("phone").value}, 	
				success: function(result){
					alert(result);
					if(result==1){
						alert('수정');
						location.href='../member/myinfo.jsp';
					}else{
						alert('수정안됨');
						location.href='../member/myinfo.jsp';
					}
				}	
			})
		});
	});
	
	
	}
	//주소
	function addressbtn(){ 
	document.getElementById("address1").style.display="";
	
	$(function(){
		$("#addresschange").click(function(){
			alert("클릭");
			$.ajax({
				url : "../../controller/namecontroller.jsp",
				data : {type:5,
						address1:document.getElementById("sample4_postcode").value,
						address2:document.getElementById("sample4_roadAddress").value,
						address3:document.getElementById("sample4_jibunAddress").value,
						address4:document.getElementById("sample4_detailAddress").value}, 	
				success: function(result){
					alert(result);
					if(result==1){
						alert('수정');
						location.href='../member/myinfo.jsp';
					}else{
						alert('수정안됨');
						location.href='../member/myinfo.jsp';
					}
				}	
			})
		});
	});
	}
	
			// 성별
	function sexchange(){ 
	document.getElementById("trsex").style.display="";	
	var sex;
	$("input[name='sex']:radio").change(function () {
        	sex = this.value;
        alert(sex);  
	});
	$(function(){
		$("#sexchange").click(function(){
			alert("클릭");
			$.ajax({
				url : "../../controller/namecontroller.jsp",
				data : {type:6,
						sex:sex}, 	
				success: function(result){
					alert(result);
					if(result==1){
						alert('수정');
						location.href='../member/myinfo.jsp';
					}else{
						alert('수정안됨');
						location.href='../member/myinfo.jsp';
					}
				}	
			})
		});
	});
	}
		





















