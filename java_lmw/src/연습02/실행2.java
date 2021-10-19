package 연습02;

import java.util.Scanner;

public class 실행2 {

	
	public static void main(String[] args) {
		
		/* 무한루프 메뉴
		 * 1.음악재생
		 * 2.영화재생
		 * 
		 * 조건1.1번선택시 1초간격으로 음각재생
		 * 조건2.2번선선택시 1초간격 영화재생 출력
		 * 조건3.음악영화가 실행중 번호를 다시 선택하면 재생종료
		 * 
		*/
		
		boolean onoff = true ;//재생여부 확인
			
		while(true) {
				Scanner scanner = new Scanner(System.in);
				
				System.out.println(" 1.음악 2.영화");
				int ch = scanner.nextInt();
				음악 음악 = new 음악();	
				
				if(ch==1) {	
					
					음악.setStop(onoff);						
					음악.start();
					onoff = false;
					
				}else {
					음악.setStop(onoff);
					onoff= true;
				}
				
				if(ch==2) {
					영화 영화 = new 영화();
					영화.setStop(onoff);
					영화.start();
				}
				
				
			}
			
			
			
		
	}
	
}
