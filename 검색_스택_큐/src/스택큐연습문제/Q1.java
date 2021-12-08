package 스택큐연습문제;

import java.util.Scanner;

import 스택큐.실습4_1_intStack;

public class Q1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		실습4_1_intStack s = new 실습4_1_intStack(64); //최대 64개를 푸시할 수 있는 스택
		
		while(true) {
			System.out.println("현재 데이터 수 : "+s.size()+"/"+s.capcity());
			
			System.out.println("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)clear"
					+ "(6)capcity (7)size (8)isEmpty (9)isFull (0)종료 ");
			int menu = scanner.nextInt();
			if(menu==0)break;
			
			int x = 0;
			switch(menu) {
			case 1 :
				System.out.println("데이터 : ");
				try {
					s.push(x);
				} catch (실습4_1_intStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다");
				}
				break;
				
			case 2:
				try {
					x = s.pop();
					System.out.println("팜한 데이터는 "+x+"입니다.");
				} catch (실습4_1_intStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 "+x+"입니다.");
				} catch (Exception e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 4:
				s.dump();
				break;
			case 5:
				s.clear();
				break;
			case 6:	
				x=s.capcity();
				System.out.println("스택의 용량은 "+x+" 입니다");
				break;
			case 7:
				x=s.size();
				System.out.println("스택의 사이즈는 "+x+" 입니다");
				break;
			case 8:	
				boolean check1 = s.isEmpty();
				if(check1)System.out.println("스택이 비었습니다");
				else System.out.println("스택이 비어있지 않습니다");
				break;
			case 9:	
				boolean check = s.isFull();
				if(check)System.out.println("스택이 가득 찼습니다");
				else System.out.println("스택이 가득 차지 않았습니다");
				break;
				
			}
		}
	}
	
}

























