package Day09;

public class Parent {

	//parent�� ���� ��ӹ��� child��ü ������ ==>�θ� Ŭ���� ������ ���� ����
	//parent ������ ����[Parent()]
	
	
	public String nation;
	
	public Parent() {
		this("���ѹα�");
		System.out.println("Parent() Call");
		
	}
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation)Call");
	}
}
