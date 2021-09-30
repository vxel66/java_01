package Day03;

import java.util.Scanner;

public class Day03_7 {

	//1. 무한로프로 입력을 계속 받기
	    //1.while(true)
	    //2.while(boolean변수)
	//2. 변수를 제어
	
	public static void main(String[] args) {
		
		boolean run = true;

		// 무한루프 [ 조건이 false 일때까지 계속 반복실행 ]
		int keycode = 0;
		int sp = 0;
		while (run) {System.out.println("무한루프");
		     Scanner scanner = new Scanner(System.in);
		    
		     System.out.println("1.증속 2.감속 3중지");
		     System.out.print("선택:");  keycode = scanner.nextInt();
		    
		     if(keycode == 1) {sp++; System.out.println(sp);}
		     if(keycode == 2) {sp--; System.out.println(sp);}
		     
		     
		     
		     
		     
	}
	
	}
}
