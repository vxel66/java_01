package ����02;

public class ���� {

	
	public static void main(String[] args) {
		
		������ ������ = new ������();
		����� ����� = new �����();
		������ ������ = new ������();
		������.start();
		�����.start();
		������.start();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		������.setStop(true);		
		�����.setStop(true);		
		������.setStop(true);		
		System.out.println(������.getName());
		System.out.println(�����.getName());
		System.out.println(������.getName());
	}
}
