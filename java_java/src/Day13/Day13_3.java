package Day13;

public class Day13_3 {

	
	// ������ ����
		//1.sleep( �и���[1000/1��] ) :�и��ʸ�ŭ �Ͻ������� �ٽ� ����
	 		//*����ó�� �ʼ�
		//2.Thread.yield() : �ٸ� �����忡�� �纸
		//3.join() : �ٸ� �������� ���Ḧ ��ٸ�
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
		threadA.work =false; //������a�� �纸 [������A ����X]
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadA.work = true; // ������A�� ����
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
		
		System.out.println("1~100���� "+ sumThread.getSum());
		
		
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	//	printThread.setStop(true);
	//	printThread.stop(); // �������� ����
		
		printThread.interrupt();
		
	}
	
}



























