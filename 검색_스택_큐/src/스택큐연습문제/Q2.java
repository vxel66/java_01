package ����ť��������;

import ����ť.�ǽ�4_1_intStack.OverflowIntStackException;

public class Q2<E> {

	private int max;	//���� �뷮
	private int ptr;	//���� ������
	private E[] stk;	//���� ��ü
	
	//����� ���� : ������ �������
		public class EmptyIntStackException extends RuntimeException{
			public EmptyIntStackException() {}
		}
		
		//���� �� ���� : ������ ���� ��
		public class OverflowIntStackException extends RuntimeException{
			public OverflowIntStackException() {}
		}
	public Q2(int capacity) {
		ptr = 0 ;
		max = capacity;
		try {	
			stk = new b[capacity];
		} catch (Exception e) {
			max=0;
		}
	}
	
	public E push(E x) throws OverflowIntStackException{
		if(ptr>=max) {
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x;
	}
	
}
