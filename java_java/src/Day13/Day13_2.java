package Day13;

public class Day13_2 {

	//������ �켱����
	
	public static void main(String[] args) {
		
		//1. 10���� ��Ƽ������ ����
		for(int i = 1 ; i<=10 ; i++) {
			
			// ��Ƽ������ ���� �̸��ο�
			Thread thread = new CalcThread("������ "+i);
			
			//3 �̸��ο�
			
			if(i !=10 ) { // ������ ��ȣ�� 10�� �ƴϸ�
				//�ش� �����带 ���� �켱������ �����մϴ�
				thread.setPriority(Thread.MIN_PRIORITY);
				
			}else {
				thread.setPriority(thread.MAX_PRIORITY);
			}
			
			thread.start();
		}
		
		//������ ����ȭ �޼ҵ�
			//����ȭ : ���� �����尡 ������ �޼ҵ� �����Ҷ� ���� �̱��� �޼ҵ���� ó�� �������� ���
		
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
	}
}






























