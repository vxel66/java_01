package Day03;

import java.util.Scanner;

public class Day03_8 {

	// ATM 프로그램
	public static void main(String[] args) {
		
		// 종료버튼 누르기 전까지 24시간 실행중인 프로그램 => while(true)
		boolean 실행 = true; // 무한루프를 제어하는 변수
		
		int 예금액 =0; //예금액
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(실행) { //[실행변수 true 무한루프실행 실행변수가]
		    System.out.println("---------------------------------");
		    System.out.println("1.예금   |2.출금   |3.잔고   |4.종료  ");
		    System.out.println("---------------------------------");
		    System.out.print("선택:"); int 선택 = scanner.nextInt();
		  		
		
		     if(선택 == 1) { 
		    	 	System.out.println("예금액:");
		        	예금액 += scanner.nextInt();
		    	
		    		System.out.println("예금완료");
		    
		    }
		     else if( 선택 == 2 ) { 
					System.out.print("출금액>"); 	int 출금액 = scanner.nextInt();
					
					if( 예금액 < 출금액 )  { System.out.println(" [[ 알림 ]] 잔고가 부족합니다 "); }
					else  { 예금액-= 출금액; System.out.println(" [[ 알림 ]] 출금 완료 "); }
					
				}
		    if(선택 == 3) { 
		    	
		    	System.out.println("잔고:");
		    
		    }
		    if(선택 == 4) { //만약 4를 입력했을때
		    	실행=false; //실행변수를 false 넣어서 무한루프[while] 종료
		    	System.out.println("ATM종료");
		    }
		    
		    
		    
		    
		}
		
		
		
	}
	
	
	
	
}
