package ����ť;

import java.util.Scanner;

public class �ǽ�4_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		�ǽ�4_3 s = new �ǽ�4_3(64);
		
		while(true) {
			System.out.println("���� ������ �� : "+s.size()+"/"+s.capacity());
			System.out.println("(1)��ť (2)��ť (3)��ũ (4)���� (0)���� ");
			
			int menu = scanner.nextInt();
			if(menu==0) {break;}
			
			int x;
			switch(menu) {
			
			case 1: 
				System.out.println("������ :");
				x = scanner.nextInt();
				try {
					s.enque(x);
				} catch (�ǽ�4_3.OverflowIntQueueException e) {
					System.out.println("ť�� ���� á���ϴ�");
				}
				break;
			
			case 2:
				try{
					x = s.deque();
					System.out.println("��ť�� �����ʹ� "+x+"�Դϴ�.");
				}catch (�ǽ�4_3.EmptyIntQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
			
			case 3:
				try {
					x= s.peek();
					System.out.println("��ũ�� �����ʹ� "+x+"�Դϴ�.");
				} catch (Exception e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
				
			case 4:
				s.dump();
				break;
			case 5:
				System.out.println("�˻��� ��:");
				int y = scanner.nextInt();
				int index= s.search(y);
				System.out.println(index);
			
			}
		}
	}
}























