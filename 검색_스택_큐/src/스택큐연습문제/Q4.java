package ����ť��������;

public class Q4 {

	private int max;
	private int num;
	private int[] que;
	
	//����� ���� : ť�� �������
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	//���� �� ���� : ť�� ���� ��
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	public Q4(int capacity) {
		num = 0 ;
		max = capacity;
		try {
			que = new int[max];
		} catch (Exception e) {
			max=0;
		}
	}
	
	
	
	
}
