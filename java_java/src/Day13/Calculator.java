package Day13;

public class Calculator {

	
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
			//동기화 : 우선 스레드가 끝날때까지 다른 스레드 대기[ 순서 대기 ]
		this.memory= memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("스레드명:"+Thread.currentThread().getName()+" : "+this.memory);
		
		
	}
}
