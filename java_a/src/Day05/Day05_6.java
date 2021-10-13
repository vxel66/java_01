package Day05;

import java.lang.reflect.Member;

public class Day05_6 {

	// 쇼핑몰의 회원 설계
		//1. 필드 : 속성
			//1. id, password , name , phone 등
		//2. 메소드 : 동작
			//1. 회원가입 , 로그인 , 회원탈퇴 , 회원수정
	//객체 만들기
	public static void main(String[] args) {
		//1. 책체 생성 [클래스명 객체명 = new 생성자(); ]
		Member 객체1 = new Member();
			//Member : 사용자가 만든 클래스
				//객체1 : 클래스명[아무거나]
					//new : 객체의 메모리할당 [메모리 할당시 무조건 ]
					//예외 : 기본자료형(미리 정해져 있기 때문에 )
						//int 정수 = 10;
						//String 문자열 = "유재석" (영문1바이트 한글2바이트)
							//Member() : 객체생성시 초기값
		//2. 객체 내용물 넣기
		객체1.아이디 = "qwe"; 객체1.비밀번호="qwe"; 
		객체1.이름 ="qwe"; 객체1.연락처="qwe"
	}
	
	
}
