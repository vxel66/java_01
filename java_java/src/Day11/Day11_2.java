package Day11;

public class Day11_2 {

	//API : 
		//���̺귯��: ������� Ŭ���� , �������̽�
	//Object Ŭ����
		//1.equals(); : ��ü ��
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("�����մϴ�");
		}else {
			System.out.println("�ٶ�Ѥ��ϴ�");
		}
		if(obj1.equals(obj3)) {
			System.out.println("�����մϴ�");
		}else {
			System.out.println("�ٸ��ϴ�");
		}
			//2 toStirng() : ��ü����
				//��ü�� �ּҰ�[ �ڷ������� �� ȣ��]
		System.out.println(obj1.toString());
		
		//3 clone() : ��ü ����
			//1.���� ���� : �迭 ��ü�� ���� �Ұ� [�ֻ縸 ����]
			//2.���� ���� : ����Ÿ�Ե� �迭 ��ü ����
		
		Member2 original = new Member2("blue", "ȫ�浿", "12345", 25, true);
		
		
		Member2 cloned = original.getMember2();
		cloned.password="67890";
		
		System.out.println("-----������ ��ü ����");
		cloned.toString();
		
		System.out.println("-----���� ��ü ����");
		original.toString();
		
	}
	
	
}
