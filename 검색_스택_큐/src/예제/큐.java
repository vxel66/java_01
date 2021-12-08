package 예제;

import java.util.Scanner;


public class 큐 {
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
	
	public 큐(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new String[max];
		} catch (Exception e) {
			max = 0;
		}
	}
	
	// 인큐
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
		
		// 디큐
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
		
		//큐에 쌓여 있는 뎅이터 수를 반환
		public int size() {
			return num;
		}
		
		//큐가 비어있나?
		public boolean isEmptyi() {
			return num <=0;
		}
		
		//큐가 가득 찼나요?
		public boolean isFull() {
			return num >= max;
		}
		//큐의 용량을 반환
		public int capacity() {
			return max;
		}
		
		public void dump() {
			if(num<=0) {
				System.out.println("큐가 비어있습니다");
			}else {
				for(int i = 0 ; i<num; i++) {
					System.out.print(que[(i+front)%max]+" ");
				}
				System.out.println();
			}
		}
		
		

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		큐 s = new 큐(15);
		while(true) {
			System.out.println("현재 손님수 : "+s.size()+"/"+s.capacity());
			System.out.println("(1)손님대기 (2)손님입장 (3)손님순번확인 ");
			int ch = scanner.nextInt();
			String x ;
			if(ch==1) {
				System.out.println("손님명 :");
				 x = scanner.next();
				try {
					s.enque(x);
					System.out.println("대기번호는 : "+s.size());
				} catch (큐.OverflowIntQueueException e) {
					System.out.println("손님 가득 찼습니다");
				}
			}
			if(ch==2) {
				try{
					x = s.deque();
					System.out.println("손님 입장합니다");
				}catch (큐.EmptyIntQueueException e) {
					System.out.println("대기중인 손님이 없습니다.");
				}			
			}
			if(ch==3) {
				System.out.println("손님명: ");
				x = scanner.next();
				int a= s.indexOf(x);
				System.out.println("대기번호는 "+a+1);
			}
			else {
				continue;
			}
			
		}
		
	}
	
	
	
	
	
	
	
}
