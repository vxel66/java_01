package Day11;

public class Day11_2 {

	//API : 
		//라이브러리: 만들어진 클래스 , 인터페이스
	//Object 클래스
		//1.equals(); : 객체 비교
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("동등합니다");
		}else {
			System.out.println("다라ㅡㅂ니다");
		}
		if(obj1.equals(obj3)) {
			System.out.println("동등합니다");
		}else {
			System.out.println("다릅니다");
		}
			//2 toStirng() : 객체정보
				//객체의 주소값[ 자료형들은 값 호출]
		System.out.println(obj1.toString());
		
		//3 clone() : 객체 복제
			//1.얉은 복제 : 배열 객체는 복제 불가 [주사만 복사]
			//2.깊은 복제 : 참조타입도 배열 객체 가능
		
		Member2 original = new Member2("blue", "홍길동", "12345", 25, true);
		
		
		Member2 cloned = original.getMember2();
		cloned.password="67890";
		
		System.out.println("-----복제된 객체 정보");
		cloned.toString();
		
		System.out.println("-----원본 객체 정보");
		original.toString();
		
	}
	
	
}
