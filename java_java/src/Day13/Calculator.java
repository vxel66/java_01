package Day13;

public class Calculator {

	
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
			//����ȭ : �켱 �����尡 ���������� �ٸ� ������ ���[ ���� ��� ]
		this.memory= memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("�������:"+Thread.currentThread().getName()+" : "+this.memory);
		
		
	}
}
