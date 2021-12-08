package 스택큐연습문제;

public class 실습4_3 {
	
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	public 실습4_3(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (Exception e) {
			max = 0;
		}
	}
	// 인큐
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
	// 디큐
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
	
	//피크 (프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntQueueException{
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		return que[front];
	}
	
	//큐에서 x를 검색하여 인덱스(찾지못하면 -1)를 반환
	public int indexOf(int x) {
		for(int i = 0; i<num; i++) {
			int idx = (i + front)%max;
			if(que[idx]==x) {
				return idx;
			}
		}
		return -1;
	}
	
	//큐를 비움
	public void clear() {
		num = front = rear = 0;
	}
	
	//큐의 용량을 반환
	public int capacity() {
		return max;
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
	
	//큐안의 모든 데이터를 프런트 -> 리어 순으로 출력
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
	
	public int search(int x) {
		for(int i =0; i<num; i++) {
			if(que[i]==x) {
				return i+1;
			}
		}
		return 0;
	}
}




























