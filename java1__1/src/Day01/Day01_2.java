package Day01;

public class Day01_2 { // c s

	
	
	//main 없이 실행 불가
	// main + ctrl + 스페이스바
	public static void main(String[] args) {
		
		// 1. 출력
		// 예1 : syso + ctrl+스페이스바
		// print :출력
		// println : 출력 후 줄 바꿈
		// printf(형식문자 , 출력문구); : fusrleNAQK 
		     //f: format : 모양
		     //  형식문자
		          //%d : 정수
		          //%f : 실수
		          //%s : 문자열
		          //%c : 문자
		     //제어문자 [p.34 ]
		          // \:엔터위에 ㅇ
		          // \n : 줄바꿈
		          // \t : 탭
	              // \r : 리턴
		          // \\ : \출력
		    
		
		System.out.print("java");
		System.out.print(12345);// 기계어 이기 떄문에 숫자에는 문자처리 x
		System.out.print("java10");// 문자 +숫자 => 문자
		      //system : 미리 만들어진 스스템이라는 클래스
		         // out : 출력 스트림
		           //print (인수: 출력하고 싶은말) : 출력 함수
		      // . : 클래스내 (함수,변수) 접근 연산자 [특수문자]
		      // "": 키워드 [미리 작성된 단어], 변수 등 제외한 모든 문자에는 문자처리
		      // ; : 한줄의 실행코드 끝
		 
		// ctrl+F11 : 컴파일
		
		//예제2
		System.out.println("java");
		System.out.println(12345);
		System.out.println("java10");
		
		//예제3
		System.out.printf("%s","java");
		System.out.printf("%d",12345);
		System.out.printf("%s","java10");
		
		// printf 장점
		System.out.printf("나이는 %d 입니다", 20);
		System.out.println("나이는 " + 20 + "입니다");
		
		
		//제어문자
		System.out.print("\njava\n"); 
		System.out.print("\t 12345");
		System.out.println("\r java10");
		
		// 문제1 
		//출력결과
		/*               [[출석부]]
		 * ------------------------------------------
		 * 이름    1교시       2교시      3교시      비고
		 * 강호동    출석       결석       출석
		 * 유재석    출석       결석       출석 
		 * ------------------------------------------
		 * 
		 * 
		 * 
		 */
	     System.out.println("\n\t\t[[출석부]]");
	     System.out.println("-----------------------------------");
	     System.out.println("이름\t1교시\t2교시\t3교시\t비고");
	     System.out.println("강호동\t출석\t결석\t출석");
	     System.out.println("유재석\t출석\t결석\t출석");
	     System.out.println("-----------------------------------");
	     
	     
	     //문제2 
	     
	     
	     System.out.println("\\    /\\");
	     System.out.println(" )  ( ')");
	     System.out.println("(  /  )");
	     System.out.println(" \\(__)|");
	     
	     System.out.println("");
	     System.out.println("\t|\\_/|");
	     System.out.println("\t|q p|   /}");
	     System.out.println("\t( 0 )\"\"\"\\"); // "" 문자처리 연산자 => \" : "출력
	     
	     System.out.println("\t|\"^\"'    |");
	     System.out.println("\t||_/=\\\\__|");
	}
	// 출력
	
	
} // c e
