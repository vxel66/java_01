package 연습;

import java.util.Scanner;

public class Practice {

	static Scanner scanner = new Scanner(System.in);
	static 회원[] members = new 회원[100];
	static 도서[] books = new 도서[100];
	
	
	public static void main(String[] args) {
//		------------------- 회원제 도서관 프로그램 ---------------------
//		// [조건1] : 객체지향 [ 회원 클래스 , 도서 클래스  ]
//			설계 : 필드 , 생성자 , 메소드
//		// [조건2] : 객체는 배열에 저장
//		// [조건3] : 회원만 프로그램 이용
//			[ 로그인전 ] : 로그인 , 회원가입 , 아이디/비밀번호 찾기   
//			[ 로그인시 ] : 1.도서목록 ,2. 대여 , 3.반납  , 4.로그아웃
//		// [조건4] : 관리자[ ID:admin ] 만 도서 등록 가능 
//			[ 관리자 로그인시 ] : 1.도서등록 ,2.도서목록 3. 로그아웃 
		
		while(true) {
			System.out.println("--------메뉴--------");
			System.out.println("1.로그인 .2.회원가입 3.id/pw찾기");
			System.out.println("선택 :"); int ch = scanner.nextInt();
			
		
			회원 mem = new 회원();
			if(ch==1) {
				String 로그인체크 = mem.로그인();
				if(로그인체크.equals("어드민로그인")) {
					mem.관리자메뉴();
				}
				if(로그인체크.equals("회원로그인")) {
					mem.회원메뉴();
				}			
				if(로그인체크.equals("로그인실패")) {
					System.out.println("로그인실패");
				}
			}
			else if(ch==2) {
				mem.회원가입();
			}
			else if(ch==3) {
				String 로그인체크 = mem.로그인();
				System.out.println(로그인체크);
			}
			else {
				//비번찾기 메소드
			}
			
		}
		
		
		
		
	}
	
}
