package 예외;

import java.util.Scanner;



public class Practice {

	static Scanner scanner = new Scanner(System.in);
	static 부모[] members = new 부모[100];
	
	
	
	public static void main(String[] args)  {
		// 인터페이스 생성
		인터페이스 메뉴;
		// 인터페이스 클래스 연결
		메뉴 = new 자식();
		
		
		while(true) {
			System.out.println("--------메뉴--------");
			System.out.println("1.로그인 .2.회원가입 3.id/pw찾기");
			System.out.println("선택 :"); int ch = scanner.nextInt();
			
		
			
			if(ch==1) {
				String 로그인체크 = 메뉴.로그인();
			try {	
				if(로그인체크.equals("어드민로그인")) {
					메뉴.관리자메뉴();
				}
			}catch (Exception a) {
				System.out.println("예외"+ a);
			}
			try {	
				if(로그인체크.equals("회원로그인")) {
					메뉴.회원메뉴();
				}
			}catch (Exception b) {
				System.out.println("예외"+ b);
			}finally {
				System.out.println("재시작");
			}
				
				if(로그인체크.equals("로그인실패")) {
					System.out.println("로그인실패");
				}
			}
			
			else if(ch==2) {
				
				메뉴.회원가입() ;
			
			}
		
		
			else if(ch==3) {
				String 로그인체크 = 메뉴.로그인();
				System.out.println(로그인체크);
			}
			else {
				//비번찾기 메소드
			}
			
		}
		
		
		
	}
	
}
