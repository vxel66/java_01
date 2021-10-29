package Day15;

import java.util.Scanner;
import java.util.Stack;

public class Day15_문제4 {

	//문제4 :스택구조를 이용한 문자열 역순 출력
		//[조건1] 구조
		//[조건2] 입력받은 문자열을 순서대로 스택에 저장
		// 조건3 문자열 반대로 출력
		// 출력 예시 
		// 입력 ABC
		// 출력 CBA
	public static void main(String[] args) {
		
		Stack<Character> chars = new Stack<>();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			
			System.out.println("입력: "); 
			String 입력 = scanner.next();
			
			for(int i=0; i<입력.length();i++) {
				char c = 입력.charAt(i);
				chars.push(c);
			}
			
			System.out.println(chars);
			for(int i=0; i<입력.length();i++) {
				System.out.print(chars.pop());
			}
			
			
			
		}
		
	}
	
	
}
