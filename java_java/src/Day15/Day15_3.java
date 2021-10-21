package Day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Day15_3 {

	
	public static void main(String[] args) {
		
		
		
		// HastMap
		
		//1.map 객체 선언
		HashMap<String, Integer> map = new HashMap<>();
			//Map < 키,값 > 제네릭 2개 
		//2.map에 객체(엔트리{키=값}) 추가
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 키 값 중복 => 중복 불가
		System.out.println(map);
		
		System.out.println(map.size());
		
		//3.객체 검색 [get(키) => 값]
		System.out.println(map.get("홍길동"));
		
		System.out.println();
		//4
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
					//hasnext :다음 객체가 존재하는지
			String key = iterator.next();
			System.out.println(map.get(key));
		}
		System.out.println();
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		//4.entry
		Set<Map.Entry<String, Integer> > entryset = map.entrySet();
		
		//5. 삭제
		System.out.println();
		map.remove("홍길동");
		System.out.println(map);
		System.out.println();
		map.clear();// 모두 삭제
		System.out.println(map);
		
	}
}





















