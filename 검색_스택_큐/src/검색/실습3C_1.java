package �˻�;

public class �ǽ�3C_1 {
	// ���̵� �ο��ϴ� Ŭ����
	
	private static int counter = 0; //���̵� �� �� �ο��ߴ��� ����
	private int id;		//���̵�
	
	// ������
	public �ǽ�3C_1() {
		id = ++counter;
	}
	
	//���̵� ��ȯ�ϴ� �ν��Ͻ� �޼ҵ�
	public int getid() {
		return id;
	}
	
	//counter �� ��ȯ�Ѵ� Ŭ���� �޼ҵ�
	public static int getcounter() {
		return counter;
	}
	
	public static void main(String[] args) {
		�ǽ�3C_1 a = new �ǽ�3C_1(); 	//���̵�1
		�ǽ�3C_1 b = new �ǽ�3C_1();	//���̵�2
		
		System.out.println("a�� ���̵� : " + a.getid());
		System.out.println("b�� ���̵� : " + b.getid());
		
		
		System.out.println("�ο��� ���̵� ����: " + �ǽ�3C_1.getcounter()
		);
		
	}
	
}
