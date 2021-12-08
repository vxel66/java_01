package 스택큐연습문제;

import java.util.Scanner;

import 스택큐.실습4_3;
import 스택큐.실습4_3.EmptyIntQueueException;
import 스택큐.실습4_3.OverflowIntQueueException;

public class Q7 {
	
	
	private int max;
	private int front;
	private int rear;
	private int front2;
	private int rear2;
	private int num;
	private int[] que;
	
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	public Q7(int capacity) {
		max = capacity;
		num = front = rear = 0;
		front2=rear2=max-1;
		
		try {
			que = new int[max];
		} catch (Exception e) {
			max = 0;
		}
	}
	
	// 인큐1
	public int enque(int x) throws OverflowIntQueueException{
		if(num>=max) {
			throw new OverflowIntQueueException();
		}
		que[rear++] = x;
		num++;
		if(rear == max) {
			rear = 0;
		}
		return x;
	}
	
	// 인큐2
		public int enque2(int x) throws OverflowIntQueueException{
			if(num>=max) {
				throw new OverflowIntQueueException();
			}
			que[rear2--] = x;
			num++;
			if(rear2 == 0) {
				rear2 = max;
			}
			return x;
		}
		
	// 디큐1
	public int deque() throws EmptyIntQueueException{
		if(num<=0) {
			throw new EmptyIntQueueException();
		}
		int x = que[front++];
		num--;
		if(front == max) {
			front = 0 ;
		}
		return x;
	}
	
	// 디큐2
		public int deque2() throws EmptyIntQueueException{
			if(num<=0) {
				throw new EmptyIntQueueException();
			}
			int x = que[front2--];
			num--;
			if(front == 0) {
				front = 0 ;
			}
			return x;
		}
	
	
	//큐의 용량을 반환
		public int capacity() {
			return max;
		}
		
		//큐에 쌓여 있는 뎅이터 수를 반환
		public int size() {
			return num;
		}
		public int search(int x) {
		for(int i =0; i<max; i++) {
			if(que[i]==x) {
				return i+1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Q7 s = new Q7(10);
		
		while(true) {
			System.out.println("현재 데이터 수 : "+s.size()+"/"+s.capacity());
			System.out.println("(1)인큐1 (2)인큐2 (3)디큐1 (4)디큐2 (5)검색 (0)종료 ");
			
			int menu = scanner.nextInt();
			if(menu==0) {break;}
			
			int x;
			switch(menu) {
			
			case 1: 
				System.out.println("데이터 :");
				x = scanner.nextInt();
				try {
					s.enque(x);
				} catch (Q7.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼습니다");
				}
				break;
			
			
			case 2:
				System.out.println("데이터 :");
				x = scanner.nextInt();
				try {
					s.enque2(x);
				} catch (Q7.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼습니다");
				}
				break;
				
			case 3:
				try{
					x = s.deque();
					System.out.println("디큐한 데이터는 "+x+"입니다.");
				}catch (Q7.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
			case 4:
				try{
					x = s.deque2();
					System.out.println("디큐한 데이터는 "+x+"입니다.");
				}catch (Q7.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
				
			case 5:
				System.out.println("검색할 값:");
				int y = scanner.nextInt();
				int index= s.search(y);
				System.out.println("검색값의 위치 : "+index);
				break;
			}
		}
	}

}
