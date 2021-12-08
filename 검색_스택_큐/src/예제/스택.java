package 예제;

import java.util.Scanner;


public class 스택 {

	private int max1;	//스택 용량
	private int ptr1;	//스택 포인터
	private int[] stk1;	//스택 본체
	
	private int ptr2;	//스택 포인터
	
	
	//실행시 예외 : 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
		
	//실행 시 예외 : 스택이 가듣 참
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}	
	
	public 스택(int capacity) {
		ptr1 = 0 ;
		max1 = capacity;
		ptr2 = max1-1;
		try {
			stk1 = new int[max1];
		} catch (Exception e) {
			max1=0;
		}
	}
	
	public int push(int x) throws OverflowIntStackException{
		if(ptr1>=max1||ptr2==ptr1) {
			throw new OverflowIntStackException();
		}
		return stk1[ptr1++] = x;
	}
	
	public int push2(int x) throws OverflowIntStackException{
		if(ptr2<=0||ptr2==ptr1) {
			throw new OverflowIntStackException();
		}
		return stk1[ptr2--] = x;
	}
	
	public int pop() throws EmptyIntStackException{
		if(ptr1<=0) {
			throw new EmptyIntStackException();
		}
		return stk1[--ptr1];
	}
	
	public int pop2() throws EmptyIntStackException{
		if(ptr2>=max1-1) {
			throw new EmptyIntStackException();
		}
		System.out.println(ptr2);
		return stk1[++ptr2];
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		스택 s = new 스택(10); 
		
		while(true) {
			System.out.println("남자 위치 : "+s.ptr1() );
			System.out.println("여자 위치 : "+s.ptr2());
			System.out.println("(1)남자 전진 (2)여자 전진 (3)남자 후진 (4)여자 후진");
			int menu = scanner.nextInt();
			if(menu==0)break;
			
			int x = 0;
			switch(menu) {
			case 1 :
				System.out.println("남자 앞으로 ");
				try {
					s.push(x);
				} catch (스택.OverflowIntStackException e) {
					System.out.println("만났습니다");
				}
				break;
				
			case 2 :
				System.out.println("여자 앞으로 ");
				try {
					s.push2(x);
				} catch (스택.OverflowIntStackException e) {
					System.out.println("만났습니다");
				}
				break;
			case 3:
				try {
					x = s.pop();
					System.out.println("남자 뒤로");
				} catch (스택.EmptyIntStackException e) {
					System.out.println("뒤로 갈수없습니다");
				}
				break;
			case 4:
				try {
					x = s.pop2();
					System.out.println("여자 뒤로");
				} catch (스택.EmptyIntStackException e) {
					System.out.println("뒤로 갈수없습니다");
				}
				break;	
				
				
			}	
	}
	
}
	
	
	public int ptr1() {
		return ptr1;
	}
	public int ptr2() {
		return ptr2;
	}

	
	
}
