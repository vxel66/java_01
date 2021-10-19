package Day14;

import java.util.ArrayList;

public class Day14_3 {

	public static void main(String[] args) {
		
		//컬렉션 프레임워크
			//컬렉션 : 수집 [자료구조 : 데이터를 저장하는 방법]
			//프레임워크 : 미리 만들어진 라이브러리 사용방법 정의
		
		//1.List : Arraylist , Vector , LinkedList
		//2.Set
		//3.Map
		
		//p728
		//1. Arraylist : 배열과 유사
			//1.가변길이[ 기본 10 // 10이 넘으면 저장 용량이 자동 늘어남]
			//2.객체가 삭제 [ 삭제된 인덱스 뒤로 한칸씩 당겨짐]
				//예) 3번 인덱스 삭제시 [ 4번인덱스 -> 3번 // 5번 인덱스 ->4번]
			//3. 메소드
				// 1.리스트명.add(객체명) : 해당 객체를 리스트에 저장
				// 2.리스트명.size 
		
		//1. 리스트 선언	
		ArrayList<String> list = new ArrayList<>();
			//리스트클래스 <제네릭> 아무거나 = new 리스트클래스<>():
				// <제네릭> : 제네릭은 넣은 타입으로 리스트내 객체 사용
		
		//2.리스트에 객체 추가
		list.add("java");
		list.add("abc");
		list.add("servlet/jsp");
		list.add(2,"Database");
		list.add("ibatis");
		
		//3.리스트 출력
		System.out.println(list);
		System.out.println("리스트내 객체수: "+ list.size());
		
		//4.리스트낸 객체 호출
		System.out.println("2번 인덱스 호출 : "+ list.get(2));
		
		//5. 리스트내 모든 객체 호출 [ i : 반복문 사용]
		for(int i = 0; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		//5. 리스트내 모든 객체 호출 [ i : 반복문 사용]
				for(String temp : list) {
					//for (임시 객체 :리스트) :
			//		리스트내 모든 객체를 하나씩 임시 객체에 대입
					System.out.println(temp);
				}
		//6. 리스트내 객체 삭제
		list.remove(2); //database 삭제 삭제후 3번객체에 있던 servlet/jsp 가 2번 인덱스로
		System.out.println("삭제확인 " + list);
		
		//7.검색
		System.out.println(list.contains("java"));//존재 여부 확인
		System.out.println(list.indexOf("java")); //인덱스 번호 확인
		
		//리스트 초기화
		list.clear();
		
		
		
	}
	
}






















