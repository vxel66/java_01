package Day15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day15_5 {

	
	//메모리 : 메모리 저장 하는 방버 [자료구조]
	
	//스택 : [ LIFO :후입선출 ] : 나중에 넣은 객체가 먼저 나감
		//스택 클래스
			// 입구/출구 동일
			// 동전케이스, Ctrl+z
	//큐 : [ FIFO :선입선출 ] : 먼저 들어온 객체가 먼저 나감
		//큐 인터페이스
			// 입구 +출구 다름
			// 대기, 지하철
	//트리 :
	
	public static void main(String[] args) {
		
		// 스택 클래스
		//1.스택 객체 생성
		Stack<Coin> coinbox = new Stack<>();
		
		//2.스택에 객체 넣기
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(50));
		coinbox.push(new Coin(500));
		coinbox.push(new Coin(10));
		
		System.out.println(coinbox);
		//3.삭제 pop() : 가장 나중에 들어온 객체 삭제
		System.out.println(coinbox.pop());
		
		//4
		while(!coinbox.isEmpty()) {
			
			System.out.println(coinbox.pop());
		}
		//Queue 인터페이스 먼저 들어온 객체가 먼저 나감
		Queue<Coin> coinbox2 = new LinkedList<>();
		
		//
		coinbox2.offer(new Coin(100));
		coinbox2.offer(new Coin(50));
		coinbox2.offer(new Coin(500));
		coinbox2.offer(new Coin(10));
		
		System.out.println(coinbox2 );
		System.out.println(coinbox2.poll());
								
		//4
		while(!coinbox2.isEmpty()) {
			System.out.println(coinbox2.poll());
		}
		
	}
}






























