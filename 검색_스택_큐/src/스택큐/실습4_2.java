package ����ť;

import java.util.Scanner;

public class �ǽ�4_2 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		�ǽ�4_1_intStack s = new �ǽ�4_1_intStack(64); //�ִ� 64���� Ǫ���� �� �ִ� ����
		
		while(true) {
			System.out.println("���� ������ �� : "+s.size()+"/"+s.capcity());
			
			System.out.println("(1)Ǫ�� (2)�� (3)��ũ (4)���� (0)���� ");
			int menu = scanner.nextInt();
			if(menu==0)break;
			
			int x = 0;
			switch(menu) {
			case 1 :
				System.out.println("������ : ");
				try {
					s.push(x);
				} catch (�ǽ�4_1_intStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�");
				}
				break;
				
			case 2:
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� "+x+"�Դϴ�.");
				} catch (�ǽ�4_1_intStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� "+x+"�Դϴ�.");
				} catch (Exception e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
			case 4:
				s.dump();
				break;
			}
		}
	}
	
}










