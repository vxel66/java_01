package Day10;

public class Day10_3 {

	
	public static void main(String[] args) {
		//중첩클래스
		
		A a = new A(); //A클래스가 메모리할당될때 중첩된 클래스들은 메모리할당 안됨
		
		//2.인스턴트 맴버 클래스 객체 생성
		A.B b = a.new B();//인스턴스클래스
	//  A.B b2 = new 
		
		 b.method1();
		 
		//3.정적 클래스 객체 생성
		A.C c = new A.C();
		
		c.method1();
		
		
		
		A.C.method2();
		
		//4.로컬클래스 객체 생성
		a.method();
	}
}
