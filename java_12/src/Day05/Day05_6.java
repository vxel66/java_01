package Day05;

public class Day05_6 {

	// ȸ�� ����
		// 1. �ʵ� : �Ӽ�
			// 1. ���̵� , ��й�ȣ , �̸� , ����ó �� 
	
		// 2. �޼ҵ� : ���� 
			// 1. ȸ������ , �α��� , ȸ��Ż�� , ȸ������ 
	
	// ��ü ����� 
	public static void main(String[] args) {
		
		// 1. ��ü ����  [ Ŭ������ ��ü�� = new ������(); ]
		Member ��ü1 = new Member();
		// Member : ����� ���� Ŭ����
			// ��ü1 : Ŭ������[�ƹ��ų�]
				// new : ��ü�� �޸��Ҵ� [�޸� �Ҵ�� ������ ]
				// ���� : �⺻�ڷ��� , String ( �̸� ������ �ֱ� ������ )
					// int ���� = 10 ;
					// String ���ڿ� = "���缮" ( ����1����Ʈ �ѱ�2����Ʈ ) 
						// Member() : ��ü ������ �ʱⰪ
		
		// 2. ��ü ���빰 �ֱ� [ . : ���ٿ����� ]  
			// ��ü�� �ʵ忡 �����ؼ� �ش� �ʵ忡 �� �ֱ� 
		��ü1.���̵� = "qwe"; 	��ü1.��й�ȣ="qwe";  
		��ü1.�̸�="qwe";		��ü1.����ó = 12345;
		
		// 3. ��ü ���빰 ȣ�� 
		System.out.println(" ��ü : " + ��ü1 );
		System.out.println(" ��ü�� �ʵ� => ���̵� : " + ��ü1.���̵� );
		System.out.println(" ��ü�� �ʵ� => ��й�ȣ : "+ ��ü1.��й�ȣ );
		System.out.println(" ��ü�� �ʵ� => �̸� : " + ��ü1.�̸�);
		System.out.println(" ��ü�� �ʵ� => ����ó : " + ��ü1.����ó );
		
	
	}
}