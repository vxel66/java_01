package 스택큐;

import java.util.Scanner;

public class 실습4_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		실습4_3 s = new 실습4_3(64);
		
		while(true) {
			System.out.println("현재 데이터 수 : "+s.size()+"/"+s.capacity());
			System.out.println("(1)인큐 (2)디큐 (3)피크 (4)덤프 (0)종료 ");
			
			int menu = scanner.nextInt();
			if(menu==0) {break;}
			
			int x;
			switch(menu) {
			
			case 1: 
				System.out.println("데이터 :");
				x = scanner.nextInt();
				try {
					s.enque(x);
				} catch (실습4_3.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼습니다");
				}
				break;
			
			case 2:
				try{
					x = s.deque();
					System.out.println("디큐한 데이터는 "+x+"입니다.");
				}catch (실습4_3.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
			
			case 3:
				try {
					x= s.peek();
					System.out.println("피크한 데이터는 "+x+"입니다.");
				} catch (Exception e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
				
			case 4:
				s.dump();
				break;
			case 5:
				System.out.println("검색할 값:");
				int y = scanner.nextInt();
				int index= s.search(y);
				System.out.println(index);
			
			}
		}
	}
}























