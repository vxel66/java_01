package �˻�;

public class �ǽ�3c_3 {

	//���׸� Ŭ������ ��
	
	
	//���׸� Ŭ������ �Ķ���͸� T��� �ۼ��մϴ�
	static class GenericClass<T>{
		private T xyz;
		
		GenericClass(T t) {	//������
			this.xyz = t ;
		}
		T getXyz() {		//xyz�� ��ȯ�մϴ�.
			return xyz;
		}
	}
	public static void main(String[] args) {
		//������ ���� �Ķ���Ϳ� string�� �ѱ� ���� �ְ� integer�� �ѱ� ���� �ֽ��ϴ�.
		GenericClass<String> s = new GenericClass<String>("abc");
		GenericClass<Integer> n = new GenericClass<Integer>(15);
		
		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
	
	}
	
}
