package Day10;

public class Day10_3 {

	
	public static void main(String[] args) {
		//��øŬ����
		
		A a = new A(); //AŬ������ �޸��Ҵ�ɶ� ��ø�� Ŭ�������� �޸��Ҵ� �ȵ�
		
		//2.�ν���Ʈ �ɹ� Ŭ���� ��ü ����
		A.B b = a.new B();//�ν��Ͻ�Ŭ����
	//  A.B b2 = new 
		
		 b.method1();
		 
		//3.���� Ŭ���� ��ü ����
		A.C c = new A.C();
		
		c.method1();
		
		
		
		A.C.method2();
		
		//4.����Ŭ���� ��ü ����
		a.method();
	}
}
