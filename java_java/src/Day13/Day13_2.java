package Day13;

public class Day13_2 {

	//스레드 우선순위
	
	public static void main(String[] args) {
		
		//1. 10개의 멀티스레드 생성
		for(int i = 1 ; i<=10 ; i++) {
			
			// 멀티스레드 생성 이름부여
			Thread thread = new CalcThread("스레드 "+i);
			
			//3 이름부여
			
			if(i !=10 ) { // 스레드 번호가 10이 아니면
				//해당 스레드를 낮은 우선순위로 설정합니다
				thread.setPriority(Thread.MIN_PRIORITY);
				
			}else {
				thread.setPriority(thread.MAX_PRIORITY);
			}
			
			thread.start();
		}
		
		//스레드 동기화 메소드
			//동기화 : 여러 스레드가 동일한 메소드 접근할때 먼저 겁근한 메소드부터 처리 나머지는 대기
		
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
	}
}






























