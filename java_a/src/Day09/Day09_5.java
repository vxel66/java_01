package Day09;

public class Day09_5 {

	//���� ���α׷� [ ���, �������̽�]
		//atm �������̽�
			//�߻�޼ҵ� : ���µ��, ���� , ��� , ��ü , �ܰ�
		//1. ���� [����Ŭ����]
			//�ʵ� : ���ڹ�ȣ , ���ݾ�
			//�޼ҵ�(�ൿ): ���µ�� , ���� , ��� , ��ü, �ܰ�
		//2. ��������[����Ŭ����]
		//3. �������� [����]
	public static Bank[] banklist = new Bank[100];
	
	public static void main(String[] args) {
		//1.�������̽�����
		ATM atm; 
		//2.�������̽� Ŭ���� ����
		atm =new ��������();
		//3.�������̽��� ���� Ŭ���� ����
		atm.���µ��();
		atm.����();
		atm.���();
		atm.�ܰ�();
		
		//5.������ ����Ŭ�����κ��� ���� �ٸ� ����Ŭ������ �迭�� ���
			// ����Ŭ������ �迭 ����
		Bank account1 =new Bank();
		banklist[0] = account1;
		
		Bank account2 =new Bank();
		banklist[1] = account2;
		
		Bank account3 =new Bank();
		banklist[2] = account3;
		
		
	}
}
