package Day10;

public class A {

	//필드
	
	
	//생성자 :현재 생성자명과 이름이 동일하면 생성자 // 동일하지 않으면 메소드
	A(){
		System.out.println("A객체가 생성됨");
	}
	
	//인스턴스 맴버 클래스 //
	class B {
		//필드
		int field;
		int field2;
		//생성자
		public B(){
			System.out.println("B객체가 생성됨");
		}
		//메소드
		void method1() {
			
		}
			
	}
	//정적
	static class C{
		//1필드
		int field;
		static int field2;
		//생성자
		public C() {
			System.out.println("C객체 생성");
		}
		//메소드
		void method1() {
			
		}
		static void method2() {
			
		}
		
	}
	//3. 메소드  A클래스의 메소드
	void method(){
		//로컬 클래스//
		class D{
			//1.필드
			int field;
			
			//2.생성자
			public D() {
				System.out.println("D객체 생성");
			}
			//3 메소드
			void method1() {
				
			}
		
		}
		// 메소드내 지역변수
					D d = new D();
					d.field =3;
					d.method1();
	}
	
	
	
}
























