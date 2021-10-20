package Day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Day15_2_0 {

	static Scanner scanner = new Scanner(System.in);
	
	
	/*대기명단 프로그램

	메뉴 

	1.명단추가 (인원수 입력받아 대기번호 반환)
	2.명단취소(대기번호 입력받아 명단 취소)

	관리자 3. 명단 입장(대기 1번부터 입장 없으면 없음 출력)
	 * 
	 */
	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<String>();
		while(true) {
			
			System.out.println("대기명단 프로그램");
			System.out.println("1.명단추가 2. 명단취소");
			int ch = scanner.nextInt();
			
			if(ch==1) {
				System.out.println("이름입력");
				String name = scanner.next();
				
				for(int i = 0 ; i<list.size(); i++) {
					if(list.get(i)==null) {
						list.add(new Member(name,i+1 ));	
						System.out.println("대기번호는 :"+i);
						break;
					}
				
				
					
				}

				
				
			}
			if(ch==2) {
				for(int i = 0 ; i<list.size(); i++) {
					if(list.get(i)==null) {
					System.out.println("null");
					}					
			}
				for(int i = 0 ; i<list2.size(); i++) {
					if(list.get(i)==null) {
					System.out.println("null2");
					}					
			}
		}
		
	}
	
	
	
}
}
























