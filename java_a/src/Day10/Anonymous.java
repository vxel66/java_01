package Day10;

public class Anonymous {

	//�ʵ�
	Person person = new Person(); //��ü
	// �͸�ü : ��ȸ��
	Person field = new Person() {
		void work() {
			System.out.println("����մϴ�");
		}
		void wake() {
			System.out.println("6�ÿ� �Ͼ�");
		}
	};// �͸�ü ���� ��
	
	
	
	//������
	
	//�޼ҵ�
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å���մϴ�");
			}
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�");
				walk();
			}
		};
		localVar.wake();
	}
	void method2() {
		person.wake();
	}
}
