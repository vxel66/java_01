package Day11;

import java.io.IOException;

public class Day11_4 {

	
	public static void main(String[] args) throws IOException {
		
		//키보드로부터 문자열 받아오는 원리
			// 키보드 입력 => 입력값 [바이트 ] => 바이트 => 문자열 변환
			//키보드 입력 => 입력값[ 바이트변환] => 바이트 => 문자열 변환
						//		a		=>  97 	=>    a
						//    키보드     변환 바이트 변환    출력
		//Stirng 클래스
			//1. Stirng 생성자
				//
		// 1.바이트배열 정수 저장
//		byte[] bytes = {72,101,100,108,108,111,32,74,97,118,97};
//	
//		//2. 바이트배열을 String 생성자에 넣기
//		String str1 = new String(bytes);
//		System.out.println(str1);
//		
//		//3.						 //시작점 갯수
//		String str2 = new String(bytes , 6, 4);
//		System.out.println(str2);
//		
//		//p498
//		byte[] bytes2 = new byte[100];
//		
//		System.out.println("입력 : "); 
//		int reedcount = System.in.read(bytes2);
//		System.in.read(bytes2); //무조건 예외처리 
//			// 입출력관련 항상 예외처리 발생
//				// System.in.read(배열명) : 키보드로부터 읽어온 바이트를 배열에 저장
//		System.out.println(new String(bytes2));
//							// 바이트열 => 문자열 변환
//		
//		System.out.println( new String(bytes2,0,reedcount-2) );
//		
//		//문자 추출
//		
//		String ssn = "010624-1230123";
//		char sex = ssn.charAt(7);
//		switch(sex) {
//		case '1' :
//		case '3' :System.out.println("남자"); break;
//		case '1' :
//		case '4' :System.out.println("여자"); break;
//		
//		}
		
		// equals(비교대상문자열 ) : 문자열 비교
		
		String strVar1 = new String("성민철");
		String strVar2 = "성민철";
		
		if(strVar1 ==  strVar2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		// getBytes() : 문자열을 바이트열로 변환
		
		String str = "안녕하세요";
		
		byte[] bytes3 = str.getBytes(); // String 을 바이트로 변환후 배열에 대입
		
		System.out.println(bytes3.length); // 글자수*2 10바이트 | 글자 = 한글(2바이트)
		
		System.out.println(new String(bytes3));
		
		//인코딩 종류 
			//1. UTF-8 : 전세계 공용어
		
		//5. indexOf() : 문자열 찾기
			String subject = "자바 프로그래밍";
			System.out.println(subject.indexOf("프로그래밍"));
			
			if(subject.indexOf("자바")!=-1) {
									//인덱스가 -1 인면 인덱스가 없다 //찾을문자가 존재하지 않음
				System.out.println("자바 관련된 책입니다");
			}else {
				System.out.println("자바 관련없는 책입니다");
			}
		//5.5 contains : 문자열 포합여부 [인수 : 찾을문자열 반환: true/false]
			
			System.out.println(subject.contains("자바"));
			
			
			
			
			//6. length() : 문자열의 길이
			System.out.println(subject.length());
			
			//7. replace("교체할문자" , "새로운문자") : 문자열 대치
			String oldstr = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 지원합니다";
			String newstr = oldstr.replace("자바", "java");
			
			System.out.println(newstr);
		//8. substirng() : 문자열 잘라내기
		String ssn2 = "880815-1234567";
		System.out.println(ssn2.substring(0,6));// 시작인덱스 , 끝인덱스
		System.out.println(ssn2.substring(7)); //시작인덱스
		
		//9. sprit() : 문자열 분리	
		String[] ssn3 = ssn2.split("-");
						//"-" 기준으로 분해 => 2개의 문자열
		System.out.println(ssn3[0]);
		System.out.println(ssn3[1]);
		
		//10. toLowerCase() : 소문자로 변환 toUpperCase() : 대문자로 변환
		String str3 = "java Programming";
		System.out.println( str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		
		//11. trim() :문자열 앞뒤 공백 제거 [ 사이공백 제거 불가 ]
		String str4 = "       자바            프로그래밍  ";
		System.out.println(str4.trim());
		
		//12. valueOf() : 기본타입을 문자열로 변환
		String str5 = String.valueOf(10); //정수형 문자열 변환
		String str6 = String.valueOf(10.5);
		String str7 = String.valueOf(true);
		
		
		System.out.println(str5); //숫자가 아니라 문자열
		System.out.println(str6);
		System.out.println(str7); 

	}
	
}











































