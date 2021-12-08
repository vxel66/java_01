package ����;

import java.util.Scanner;


public class ť {
	private int max;
	private int front;
	private int rear;
	private int num;
	private String[] que;
	
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	public ť(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new String[max];
		} catch (Exception e) {
			max = 0;
		}
	}
	
	// ��ť
		public String enque(String x) throws OverflowIntQueueException{
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
		
		// ��ť
		public String deque() throws EmptyIntQueueException{
			if(num<=0) {
				throw new EmptyIntQueueException();
			}
			String x = que[front++];
			num--;
			if(front == max) {
				front = 0 ;
			}
			return x;
		}
		
		public int indexOf(String x) {
			for(int i = 0; i<num; i++) {
				int idx = (i + front)%max;
				if(que[idx].equals(x)) {
					return idx;
				}
			}
			return -1;
		}
		
		//ť�� �׿� �ִ� ������ ���� ��ȯ
		public int size() {
			return num;
		}
		
		//ť�� ����ֳ�?
		public boolean isEmptyi() {
			return num <=0;
		}
		
		//ť�� ���� á����?
		public boolean isFull() {
			return num >= max;
		}
		//ť�� �뷮�� ��ȯ
		public int capacity() {
			return max;
		}
		
		public void dump() {
			if(num<=0) {
				System.out.println("ť�� ����ֽ��ϴ�");
			}else {
				for(int i = 0 ; i<num; i++) {
					System.out.print(que[(i+front)%max]+" ");
				}
				System.out.println();
			}
		}
		
		

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ť s = new ť(15);
		while(true) {
			System.out.println("���� �մԼ� : "+s.size()+"/"+s.capacity());
			System.out.println("(1)�մԴ�� (2)�մ����� (3)�մԼ���Ȯ�� ");
			int ch = scanner.nextInt();
			String x ;
			if(ch==1) {
				System.out.println("�մԸ� :");
				 x = scanner.next();
				try {
					s.enque(x);
					System.out.println("����ȣ�� : "+s.size());
				} catch (ť.OverflowIntQueueException e) {
					System.out.println("�մ� ���� á���ϴ�");
				}
			}
			if(ch==2) {
				try{
					x = s.deque();
					System.out.println("�մ� �����մϴ�");
				}catch (ť.EmptyIntQueueException e) {
					System.out.println("������� �մ��� �����ϴ�.");
				}			
			}
			if(ch==3) {
				System.out.println("�մԸ�: ");
				x = scanner.next();
				int a= s.indexOf(x);
				System.out.println("����ȣ�� "+a+1);
			}
			else {
				continue;
			}
			
		}
		
	}
	
	
	
	
	
	
	
}
