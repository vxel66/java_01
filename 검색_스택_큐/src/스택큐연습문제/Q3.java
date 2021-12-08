package ����ť��������;

import java.util.Scanner;

import ����ť.�ǽ�4_1_intStack;
import ����ť.�ǽ�4_1_intStack.EmptyIntStackException;
import ����ť.�ǽ�4_1_intStack.OverflowIntStackException;

public class Q3 {

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
		Q3 s = new Q3(64); //�ִ� 64���� Ǫ���� �� �ִ� ����
		
		while(true) {
			System.out.println("���� ������1 : "+s.size() );
			System.out.println("���� ������2 : "+s.size2());
			System.out.println("(1)Ǫ�� (2)2Ǫ�� (3)1�� (4)2�� (0)���� ");
			int menu = scanner.nextInt();
			if(menu==0)break;
			
			int x = 0;
			switch(menu) {
			case 1 :
				System.out.println("������ : ");
				try {
					s.push(x);
				} catch (Q3.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�");
				}
				break;
				
			case 2 :
				System.out.println("������ : ");
				try {
					s.push2(x);
				} catch (Q3.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�");
				}
				break;
			case 3:
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� "+x+"�Դϴ�.");
				} catch (Q3.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�");
				}
				break;
			case 4:
				try {
					x = s.pop2();
					System.out.println("���� �����ʹ� "+x+"�Դϴ�.");
				} catch (Q3.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�");
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
























