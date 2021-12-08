package ����ť��������;

import java.util.Scanner;

import ����ť.�ǽ�4_3;
import ����ť.�ǽ�4_3.EmptyIntQueueException;
import ����ť.�ǽ�4_3.OverflowIntQueueException;

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
	
	// ��ť1
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
	
	// ��ť2
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
		
	// ��ť1
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
	
	// ��ť2
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
	
	
	//ť�� �뷮�� ��ȯ
		public int capacity() {
			return max;
		}
		
		//ť�� �׿� �ִ� ������ ���� ��ȯ
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
			System.out.println("���� ������ �� : "+s.size()+"/"+s.capacity());
			System.out.println("(1)��ť1 (2)��ť2 (3)��ť1 (4)��ť2 (5)�˻� (0)���� ");
			
			int menu = scanner.nextInt();
			if(menu==0) {break;}
			
			int x;
			switch(menu) {
			
			case 1: 
				System.out.println("������ :");
				x = scanner.nextInt();
				try {
					s.enque(x);
				} catch (Q7.OverflowIntQueueException e) {
					System.out.println("ť�� ���� á���ϴ�");
				}
				break;
			
			
			case 2:
				System.out.println("������ :");
				x = scanner.nextInt();
				try {
					s.enque2(x);
				} catch (Q7.OverflowIntQueueException e) {
					System.out.println("ť�� ���� á���ϴ�");
				}
				break;
				
			case 3:
				try{
					x = s.deque();
					System.out.println("��ť�� �����ʹ� "+x+"�Դϴ�.");
				}catch (Q7.EmptyIntQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
			case 4:
				try{
					x = s.deque2();
					System.out.println("��ť�� �����ʹ� "+x+"�Դϴ�.");
				}catch (Q7.EmptyIntQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
				
			case 5:
				System.out.println("�˻��� ��:");
				int y = scanner.nextInt();
				int index= s.search(y);
				System.out.println("�˻����� ��ġ : "+index);
				break;
			}
		}
	}

}
