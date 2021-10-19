package Day13;

import java.awt.Toolkit;

public class Day13_1 {

	//1. cpu : 메모리없음 [레지스터 : 소량의 명령어 기억]
	//2. 메모리 [주기억장치]
	
	public static void main(String[] args) throws InterruptedException {
		//1.main : 메인 스레드 포함
			//1.첫코드부터 순차적으로 샐행
			//2.return[생략가능] 만나면 실행 종료
		//2.멀티스레드
			//1.여러개 스레드중 하나라도 남아있으면 프로세스 종료되지않음
			//2.멀티스레드 구현 방법
				//1.Runnable : 스레드 인터페이스
					//구현클래스명 implements Runnable
						//Runnable
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		//p.581
		//[단일스레드]
		for( int i = 0 ; i<5 ; i++ ) { // 
			toolkit.beep(); // 비프음 소리 메소드
			
			// 무조건 예외처리
			try {Thread.sleep(1000);}  // 1초 일시정지 [ Thread.sleep( 밀리초[1000/1초] ) ]
			catch (InterruptedException e) {} 
		}
		
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			// 무조건 예외처리
			try {Thread.sleep(1000);}  // 1초 일시정지 [ Thread.sleep( 밀리초[1000/1초] ) ]
			catch (InterruptedException e) {} 
		}
		System.out.println("-----------------------------------------------");
		// p.582 [ 멀티 스레드 : 소리와 문자를 동시에 출력 ] 
		
		// 1. 인터페이스 생성 
		Runnable runnable = new BeepTask();
		// 2. 스레드 클래스에 인터페이스 연결 
		Thread thread = new Thread(runnable);
		// 3. 스레드 시작 
		thread.start();
		
		// 문자 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			// 무조건 예외처리
			try {Thread.sleep(1000);}  // 1초 일시정지 [ Thread.sleep( 밀리초[1000/1초] ) ]
			catch (InterruptedException e) {} 
		}
		
		// 멀티스레드 : 익명객체 runnable 
			//익명객체 : 인터페이스명 변수명 = new 클래스명(new 인터페이스명() { 구현 } };
		System.out.println("-----------------------------------------------");
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for( int i = 0 ; i<5 ; i++ ) { // 
					toolkit.beep(); // 비프음 소리 메소드
					
					
					try {Thread.sleep(1000);}  
					catch (InterruptedException e) {} 
				}
				
			}
		});
		thread2.start();
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			
			try {Thread.sleep(1000);}  
			catch (InterruptedException e) {} 
		}
		
		System.out.println("-----------------------------------------------");
		
		// 멀티스레드 : thread 클래스 상속
		
		Thread thread3 = new BeepThread();
		thread3.start();//run 메소드 호출
		
		System.out.println("스레드명" +thread3.getName());
		
		
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			
			try {Thread.sleep(1000);}  
			catch (InterruptedException e) {} 
		}
		Calculator calculator = new Calculator();
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
	}

	
}
















