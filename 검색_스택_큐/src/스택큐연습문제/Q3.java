package 스택큐연습문제;

import java.util.Scanner;

import 스택큐.실습4_1_intStack;
import 스택큐.실습4_1_intStack.EmptyIntStackException;
import 스택큐.실습4_1_intStack.OverflowIntStackException;

public class Q3 {

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
	
	public Q3(int capacity) {
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
		Q3 s = new Q3(64); //최대 64개를 푸시할 수 있는 스택
		
		while(true) {
			System.out.println("현재 데이터1 : "+s.size() );
			System.out.println("현재 데이터2 : "+s.size2());
			System.out.println("(1)푸시 (2)2푸시 (3)1팝 (4)2팝 (0)종료 ");
			int menu = scanner.nextInt();
			if(menu==0)break;
			
			int x = 0;
			switch(menu) {
			case 1 :
				System.out.println("데이터 : ");
				try {
					s.push(x);
				} catch (Q3.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다");
				}
				break;
				
			case 2 :
				System.out.println("데이터 : ");
				try {
					s.push2(x);
				} catch (Q3.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다");
				}
				break;
			case 3:
				try {
					x = s.pop();
					System.out.println("팜한 데이터는 "+x+"입니다.");
				} catch (Q3.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다");
				}
				break;
			case 4:
				try {
					x = s.pop2();
					System.out.println("팜한 데이터는 "+x+"입니다.");
				} catch (Q3.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다");
				}
				break;	
				
				
			}	
	}
	
}
	
	
	public int size() {
		return ptr1;
	}
	public int size2() {
		return ptr2;
	}
}
























