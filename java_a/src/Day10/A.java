package Day10;

public class A {

	//�ʵ�
	
	
	//������ :���� �����ڸ�� �̸��� �����ϸ� ������ // �������� ������ �޼ҵ�
	A(){
		System.out.println("A��ü�� ������");
	}
	
	//�ν��Ͻ� �ɹ� Ŭ���� //
	class B {
		//�ʵ�
		int field;
		int field2;
		//������
		public B(){
			System.out.println("B��ü�� ������");
		}
		//�޼ҵ�
		void method1() {
			
		}
			
	}
	//����
	static class C{
		//1�ʵ�
		int field;
		static int field2;
		//������
		public C() {
			System.out.println("C��ü ����");
		}
		//�޼ҵ�
		void method1() {
			
		}
		static void method2() {
			
		}
		
	}
	//3. �޼ҵ�  AŬ������ �޼ҵ�
	void method(){
		//���� Ŭ����//
		class D{
			//1.�ʵ�
			int field;
			
			//2.������
			public D() {
				System.out.println("D��ü ����");
			}
			//3 �޼ҵ�
			void method1() {
				
			}
		
		}
		// �޼ҵ峻 ��������
					D d = new D();
					d.field =3;
					d.method1();
	}
	
	
	
}
























