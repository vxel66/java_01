package Day13;

public class Day13_3 {

	
	// 스레드 제어
		//1.sleep( 밀리초[1000/1초] ) :밀리초만큼 일시정지후 다시 시행
	 		//*예외처리 필수
		//2.Thread.yield() : 다른 스레드에게 양보
		//3.join() : 다른 스레드의 종료를 기다림
	public static void main(String[] args) {
		
		ThreadA threadA = new ThreadA();
		ThreadA2 threadA2 = new ThreadA2();
		
		threadA.start();
		threadA2.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadA.work =false; //스레드a가 양보 [스레드A 실행X]
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadA.work = true; // 스레드A가 실행
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		threadA.stop = true;
		threadA2.stop = true;
		
		
		//p607
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("1~100의합 "+ sumThread.getSum());
		
		
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	//	printThread.setStop(true);
	//	printThread.stop(); // 권장하지 않음
		
		printThread.interrupt();
		
	}
	
}



























