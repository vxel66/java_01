package Day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Day15_6 {

	// 컬렉션 프레임워크 중첩 
	public static void main(String[] args) {
		
		
		//중첩 map<키 , arraylist >
		HashMap<String, ArrayList<String>> 관리명단 = new HashMap<>();
		
		ArrayList<String> 의류명단 = new ArrayList<String>();
		ArrayList<String> 신발명단 = new ArrayList<>();
		의류명단.add("나이키상의");
		의류명단.add("아디다스상의");
		
		관리명단.put("신발", 신발명단);
		관리명단.put("의류", 의류명단);
		
		System.out.println(관리명단.get("의류").get(0));
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("-----제품현황-----");
			for(int i = 0; i<의류명단.size(); i++) {			
			System.out.println(관리명단.get("의류").get(i));
			}
			System.out.println("제품등록 : 1.의류 2.신발");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("제품명");
				String 제품명 = scanner.next();
				의류명단.add(제품명);
				
			}
		}
		
		
	}
	
}
