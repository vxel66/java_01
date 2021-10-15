package 연습1;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice {

	static Scanner scanner = new Scanner(System.in);
	static 회원[] members = new 회원[100];
	
	
	
	public static void main(String[] args) throws Exception {

		
		while(true) {
			System.out.println("--------메뉴--------");
			System.out.println("1.로그인 .2.회원가입");
			System.out.println("선택 :"); int ch = scanner.nextInt();
			
		
			회원 mem = new 회원();
			if(ch==1) {
				회원.로그인();
			}
			else if(ch==2) {
				mem.회원가입();
			}
			else if(ch==3) {
				
			}
			else {
				
				
			}
			
		}
		
		
		
		
	}
	
}
