package Day13;

import java.awt.Toolkit;

public class Day13_1 {

	//1. cpu : �޸𸮾��� [�������� : �ҷ��� ��ɾ� ���]
	//2. �޸� [�ֱ����ġ]
	
	public static void main(String[] args) throws InterruptedException {
		//1.main : ���� ������ ����
			//1.ù�ڵ���� ���������� ����
			//2.return[��������] ������ ���� ����
		//2.��Ƽ������
			//1.������ �������� �ϳ��� ���������� ���μ��� �����������
			//2.��Ƽ������ ���� ���
				//1.Runnable : ������ �������̽�
					//����Ŭ������ implements Runnable
						//Runnable
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		//p.581
		//[���Ͻ�����]
		for( int i = 0 ; i<5 ; i++ ) { // 
			toolkit.beep(); // ������ �Ҹ� �޼ҵ�
			
			// ������ ����ó��
			try {Thread.sleep(1000);}  // 1�� �Ͻ����� [ Thread.sleep( �и���[1000/1��] ) ]
			catch (InterruptedException e) {} 
		}
		
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("��");
			// ������ ����ó��
			try {Thread.sleep(1000);}  // 1�� �Ͻ����� [ Thread.sleep( �и���[1000/1��] ) ]
			catch (InterruptedException e) {} 
		}
		System.out.println("-----------------------------------------------");
		// p.582 [ ��Ƽ ������ : �Ҹ��� ���ڸ� ���ÿ� ��� ] 
		
		// 1. �������̽� ���� 
		Runnable runnable = new BeepTask();
		// 2. ������ Ŭ������ �������̽� ���� 
		Thread thread = new Thread(runnable);
		// 3. ������ ���� 
		thread.start();
		
		// ���� 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("��");
			// ������ ����ó��
			try {Thread.sleep(1000);}  // 1�� �Ͻ����� [ Thread.sleep( �и���[1000/1��] ) ]
			catch (InterruptedException e) {} 
		}
		
		// ��Ƽ������ : �͸�ü runnable 
			//�͸�ü : �������̽��� ������ = new Ŭ������(new �������̽���() { ���� } };
		System.out.println("-----------------------------------------------");
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for( int i = 0 ; i<5 ; i++ ) { // 
					toolkit.beep(); // ������ �Ҹ� �޼ҵ�
					
					
					try {Thread.sleep(1000);}  
					catch (InterruptedException e) {} 
				}
				
			}
		});
		thread2.start();
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("��");
			
			try {Thread.sleep(1000);}  
			catch (InterruptedException e) {} 
		}
		
		System.out.println("-----------------------------------------------");
		
		// ��Ƽ������ : thread Ŭ���� ���
		
		Thread thread3 = new BeepThread();
		thread3.start();//run �޼ҵ� ȣ��
		
		System.out.println("�������" +thread3.getName());
		
		
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("��");
			
			try {Thread.sleep(1000);}  
			catch (InterruptedException e) {} 
		}
		Calculator calculator = new Calculator();
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
	}

	
}
















