package 연습;

import java.util.Scanner;

import Day07.Member;

public class 실행 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("\n\n ------------------ 로그인 페이지 -------------");
			System.out.println(" 1.로그인 | 2.회원가입 | 3.아이디찾기 | 4.비밀번호찾기 ");
			System.out.print(" >>> 선택 : ");	int ch = scanner.nextInt();
			if( ch == 1 ) {
				// 로그인 메소드 호출
				String loginid = Member.login();
					// login 메소드의 반환값에 따른 제어
				// 1. 로그인 실패
				if( loginid ==null ) { System.out.println(" [[ 알림 ]] : 동일한 회원정보가 없습니다");}
		
				
				// 3.  일반회원메뉴
				else { member_menu( loginid ); }
					
			}
			if( ch == 2 ) {
				// 회원가입 메소드 호출 
					// 1. 다른클래스 메소드 호출 방법 
						// 1. 객체생성후 객체로 부터 멤버 접근 
							//Member member = new Member();
							//member.login()
						// 2. 해당 메소드 static
				Member.signup();
			}
			if( ch == 3 ) {
				// 아이디찾기 메소드 호출 
			 	String findid = Member.findid();
			 	if( findid == null ) { System.out.println(" [[ 알림 ]] : 동일한 회원정보가 없습니다");}
			 	else {System.out.println(" [[ 회원님의 아이디는 "+findid+" ]] ");}
			}
			if( ch == 4 ) {
				// 비밀번호찾기 메소드 호출 
			 	String findpw = Member.findpw();
			 	if( findpw == null ) { System.out.println(" [[ 알림 ]] : 동일한 회원정보가 없습니다");}
			 	else {System.out.println(" [[ 회원님의 비밀번호는 "+findpw+" ]] ");}
			 	
			}
		}
	}
}
