package Day15;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Day15_8 {

	//
	
	public static void main(String[] args) {
		
		//1. map컬렉션 객체 선언
		TreeMap<Integer, String> scores = new TreeMap<>();
			// 키 =integer , 값 = string 
		
		//2. map 객체 넣기 자동정렬 => 이진트리
		scores.put(87, "홍길동");
		scores.put(98, "이동수");
		scores.put(75, "발길순");
		scores.put(95, "신용권");
		scores.put(80, "김자바");
		
		//3. 내림차순 [ socres.des~~~ () 인터페이스에 연결]
		NavigableMap<Integer, String> desc = scores.descendingMap();
		
	
		
		for(Map.Entry<Integer, String> entry : desc.entrySet()) {
								//      엔트리자료형        정렬된 엔트리
			System.out.println(entry.getKey()+ "    ");
		}
		
		NavigableMap<Integer, String> arc =desc.descendingMap();
		
		for(Map.Entry<Integer, String> entry : desc.entrySet()) {
			//      엔트리자료형        정렬된 엔트리
			System.out.println(entry.getKey()+ "    ");
		}
	}
	
	
}
