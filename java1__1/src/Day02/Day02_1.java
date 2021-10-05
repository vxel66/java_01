package Day02; //현재 클래스가 속한 패키지명 

import java.util.Scanner;

// java는 100% 객체지향 언어 

public class Day02_1 {//c s
// public : 접근제한자
	// class : 클ㄹ래스 선언시 사용되는 키워드 [미리 만들어진 단어]
	  //클래스명[임의] : 첫글자를 대문자 권장
         //    {:시작    }:끝     	
	
	// 자동완성 단축키 : ctrl + 스페이스바
	//main + 자동완성
	public static void main(String[] args) {// m s
	   //main메소드 main스레드 존재 [스레드 : 코드를 읽어주는 역활 ]
		    //main 메소드 괄호 밖에잇는 코드는 실행 불가
		// syso + 자동완성
		System.out.println("자바");
		
		// 1 .입력객체 선언 [키보드로부터 입력받은 값을 저장하는 객체]
		Scanner 입력객체 = new Scanner(System.in);
		// 2. next()  a메소드를 이용한 객체내 입력값 빼오기
		String 문자열 = 입력객체.next();
		// 3 . 출력 [ + : 연결연산자 (문자 + 변수) ]
		System.out.println("입력값은:"+ 문자열);
		   // "" 문자처리 : 키워드[미리 만들어진 단어],객체,클래스명,변수 등 제외
		
		
      }// m e
}// c e
