package Day15;

import java.util.HashSet;
import java.util.Iterator;

public class Day15_2 {

	
	public static void main(String[] args) {
		
		// HashSet
		
		// 1. set 객체생성 [set 객체에 넣을 자료형 제네릭에 넣기]
		HashSet<String> set = new HashSet<>();
		
		//2.set 객체 넣기 [중복 허용x, 순서x]
		set.add("java");
		set.add("jbc");
		set.add("servlet/jsp");
		set.add("java");		// 중복발생 [set은 자동적으로 중복 제거]
		set.add("ibatis");
		
		//3.set 출력 [출력순서 없음] 인덱스가 없음
		System.out.println(set);
		System.out.println(set.size());
		
			//Iterrator : set낸 객체 하나씩 순회 반복자
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			// . hasNext() : 다음객체가 존재하면 true 없으면 false 
			String element = iterator.next(); //다음객체 가져오기
			System.out.println("\t"+element);
		}
		System.out.println();
		//
		for(String temp : set) {
			System.out.println("\t"+temp);
		}
		set.remove("jbc");
		set.remove("ibatis");
		System.out.println(set);
		set.clear();
		System.out.println(set);
	}
}































