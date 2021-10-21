package Day15;

import java.util.HashSet;
import java.util.Scanner;

public class 로또 {

	/*
	 * set
		로또 프로그램
		1.6개의 숫자 입력받아 set컬렉션에 저장하여 출력
		[조건] 중복값허용 x
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(true) {
			System.out.println("1~45까지 숫자 선택 (중복불가)");
			int num = scanner.nextInt();
			
			if(num<1|| num>45) {
				System.out.println("중복입니다");
			}else {
				if(set.contains(num)) {
					System.out.println("중복 번호 입니다");
				}else {
				set.add(num);
				System.out.println("확인: "+set);
				}
			}
			//
			if(set.size()==6) break;
				
			
		}
		
	
	}
	
}
