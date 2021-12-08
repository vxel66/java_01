package ����ť��������;

public class �ǽ�4_3 {
	
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
	
	public �ǽ�4_3(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (Exception e) {
			max = 0;
		}
	}
	// ��ť
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
	// ��ť
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
	
	//��ũ (����Ʈ �����͸� �鿩�ٺ�)
	public int peek() throws EmptyIntQueueException{
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		return que[front];
	}
	
	//ť���� x�� �˻��Ͽ� �ε���(ã�����ϸ� -1)�� ��ȯ
	public int indexOf(int x) {
		for(int i = 0; i<num; i++) {
			int idx = (i + front)%max;
			if(que[idx]==x) {
				return idx;
			}
		}
		return -1;
	}
	
	//ť�� ���
	public void clear() {
		num = front = rear = 0;
	}
	
	//ť�� �뷮�� ��ȯ
	public int capacity() {
		return max;
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
	
	//ť���� ��� �����͸� ����Ʈ -> ���� ������ ���
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
	
	public int search(int x) {
		for(int i =0; i<num; i++) {
			if(que[i]==x) {
				return i+1;
			}
		}
		return 0;
	}
}




























