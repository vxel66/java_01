package 스택큐연습문제;

import 스택큐.실습4_1_intStack.OverflowIntStackException;

public class Q2<E> {

	private int max;	//스택 용량
	private int ptr;	//스택 포인터
	private E[] stk;	//스택 본체
	
	//실행시 예외 : 스택이 비어있음
		public class EmptyIntStackException extends RuntimeException{
			public EmptyIntStackException() {}
		}
		
		//실행 시 예외 : 스택이 가듣 참
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
