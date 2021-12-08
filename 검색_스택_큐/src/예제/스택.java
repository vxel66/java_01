package ����;

import java.util.Scanner;


public class ���� {

	private int max1;	//���� �뷮
	private int ptr1;	//���� ������
	private int[] stk1;	//���� ��ü
	
	private int ptr2;	//���� ������
	
	
	//����� ���� : ������ �������
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
		
	//���� �� ���� : ������ ���� ��
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}	
	
	public ����(int capacity) {
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
		���� s = new ����(10); 
		
		while(true) {
			System.out.println("���� ��ġ : "+s.ptr1() );
			System.out.println("���� ��ġ : "+s.ptr2());
			System.out.println("(1)���� ���� (2)���� ���� (3)���� ���� (4)���� ����");
			int menu = scanner.nextInt();
			if(menu==0)break;
			
			int x = 0;
			switch(menu) {
			case 1 :
				System.out.println("���� ������ ");
				try {
					s.push(x);
				} catch (����.OverflowIntStackException e) {
					System.out.println("�������ϴ�");
				}
				break;
				
			case 2 :
				System.out.println("���� ������ ");
				try {
					s.push2(x);
				} catch (����.OverflowIntStackException e) {
					System.out.println("�������ϴ�");
				}
				break;
			case 3:
				try {
					x = s.pop();
					System.out.println("���� �ڷ�");
				} catch (����.EmptyIntStackException e) {
					System.out.println("�ڷ� ���������ϴ�");
				}
				break;
			case 4:
				try {
					x = s.pop2();
					System.out.println("���� �ڷ�");
				} catch (����.EmptyIntStackException e) {
					System.out.println("�ڷ� ���������ϴ�");
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
