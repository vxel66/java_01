package 스택큐연습문제;

public class Q4 {

	private int max;
	private int num;
	private int[] que;
	
	//실행시 예외 : 큐이 비어있음
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	//실행 시 예외 : 큐이 가듣 참
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
