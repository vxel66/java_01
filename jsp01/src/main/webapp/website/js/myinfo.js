/**
 * 
 */


 function infoupdate(){
	
	// input 값 가져오기
	var id = document.getElementById("password").value;
	var name = document.getElementById("name").value;
	var pwj= /^[A-Za-z0-9]{5,12}$/;
	var namej= /^{가-힣}{2,5}$/;
	
	if(!pwj.test(id)){
		document.getElementById("idresult").innerHTML="pw 형식을 맟춰주세요";
		return false;
	}else{
		document.getElementById("idresult").innerHTML="사용가능";
	}
	if(!namej.test(name)){
		document.getElementById("nameresult").innerText="이름 형식을 맞춰주세요";
	}else{
		document.getElementById("nameresult").innerText="사용가능";		
	}

	
	
}

// 내정보 변경

	

/*	$(function(){
		$("#updateform").submit(function(){
			alert("내정보");
			$.ajax({
				url : "update.jsp",
				data : {userid:document.getElementById("id").value,
						username:document.getElementById("name").value,},
				 		
			})
		})
	})*/














