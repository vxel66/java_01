

	var price = 5;
		var num1 =14;
		var total = price*num1; //변수 연산
	
		// 현재 문서의 id 가져오기 [span을 객체로 가져오기]
		var elem = document.getElementById("number");
		elem.textContent = total;
		
		var minus = price - num1;
		var plus = price + num1;		
		var elem1 = document.getElementById("number1");
		if(price==num1){
			elem1.textContent = minus;
		}else{
			elem1.textContent = plus;
		}
		
		function start(){ //함수 선언
				
		//배열
		var color = ["red", "white" , "black"];
		var colorName = document.getElementById("color");
		colorName.textContent = color[0];
		colorName.style.color = color[0];
		
		var colors = color.length;
		var colorLength = document.getElementById("colors");
		colorLength.textContent = colors;
		
		document.body.style.background = "blue";
		
	}	
		
		function start2(){
			var text="";//변수 선언
			var count = 1;
			while(count <10){ //반복문
				text += "<li> 여기는 숫자"+ count +"</li>";
				//html 태그는 문자 처리
				count++;
			}
			document.getElementById("list").innerHTML = text;
			//if문
			if(document.getElementById("list").innerHTML !=""){
				document.getElementById("list").innerHTML = "";
			}
			//alert(document.getElementById("list").innerHTML = "");
			
			//for
			var text1 ="";
			for(var i=1 ; i<6; i++){
				text1 += "<li>"+ i +"</li>";
				document.getElementById("list1").innerHTML=text1;
			}
			
			
			//배열
			var text2 ="";
			var phones =["아이폰" , "갤럭시" , "엘지폰"];
			for(var i = 0; i<phones.length; i++){
				text2+= "<li>"+phones[i]+"</li>";
			}
			document.getElementById("list2").innerHTML=text2;
			
		}
		
		function cencel(){
			alert(document.getElementById("list1").innerHTML);
			document.getElementById("list").innerHTML ="";
			document.getElementById("list1").innerHTML="";
			document.getElementById("list2").innerHTML="";
		}
		
		function start3(){
			// 기존 리스트 가져오기
			var text = document.getElementById("list").innerHTML;
			var product = "콜라";//콜라
			text +="<li>"+product+"</li>"; // 콜라변수 추가
			document.getElementById("list").innerHTML=text;			
			
		}
		
		
		function start4(num1, num2){ // 변수를 인수로 받음
			
			var tatal =	num1*num2;
			document.getElementById("result").textContent=tatal;
			
		}
		
			
		function start5(){ // 변수를 인수로 받음
			var name="abc";
			name = document.getElementById("name").Value;
			document.getElementById("re").textContent=name;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		