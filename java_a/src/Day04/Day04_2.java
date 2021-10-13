package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_2 {

	// 가위0 바위1 보2
	  // 가위바위보 입력
	  // 컴퓨터는 랜덤으로 가위바위보 하나 선택
	  //승리한 플레이어 호출
	     // 
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		boolean 실행 = true;
		int 플레이어; 
		int 컴퓨터;  
		int 게임수=0; // 게임수 저장 변수
	    int 플레이어승 = 0;
	    int 컴퓨터승 = 0;
		while(실행)	{
				// 입력받기
				System.out.println("가위바위보 게임");
				System.out.println("입력  0가위 1바위 2보 3종료");
				플레이어 = scanner.nextInt();
				if( 플레이어 == 3 ) {  // 만약에 4를 입력했을때 
				
					System.out.println("종료 게임수:" + 게임수); 
					break;
				}
				if(플레이어승 > 컴퓨터승) {
					System.out.println("플레이어승");
				}
				else if(플레이어승 < 컴퓨터승) {
					System.out.println("컴퓨터승");
				}
				else {System.out.println("비김");
				}
				if(플레이어 <0 || 플레이어 >3) {
					System.out.println("다시입력");
					continue;// 가장 가까운 반복문 탈출
				}
				
				// 컴퓨터 난수생성
				System.out.println("컴퓨터 선택 중");
				Random random = new Random();// 난수 객체
				
				컴퓨터 = random.nextInt(3); //0` 2
				System.out.println("컴퓨터선택"+컴퓨터);
				// 승리자 판단                   0가위      1바위      2보
				if((플레이어 ==0 && 컴퓨터 ==2 )||(플레이어 ==1 && 컴퓨터 ==0 )|| (플레이어 ==2 && 컴퓨터 ==1 )) {
					System.out.println("플레이어 승리");
				    플레이어승++;
				}
				else if ((플레이어 ==0 && 컴퓨터 ==0 )||(플레이어 ==1 && 컴퓨터 ==1 )|| (플레이어 ==2 && 컴퓨터 ==2 )) {
					System.out.println("비김");
				}
			
				else {
					System.out.println("컴퓨터 승리");
					컴퓨터승++;
				}
				게임수++; //게임수 
				
	
		}
	
	
	}
}












