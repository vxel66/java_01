package 검색;

public class 실습3C_1 {
	// 아이디를 부여하는 클래스
	
	private static int counter = 0; //아이디를 몇 개 부여했는지 저장
	private int id;		//아이디
	
	// 생성자
	public 실습3C_1() {
		id = ++counter;
	}
	
	//아이디를 반환하는 인스턴스 메소드
	public int getid() {
		return id;
	}
	
	//counter 를 반환한는 클래스 메소드
	public static int getcounter() {
		return counter;
	}
	
	public static void main(String[] args) {
		실습3C_1 a = new 실습3C_1(); 	//아이디1
		실습3C_1 b = new 실습3C_1();	//아이디2
		
		System.out.println("a의 아이디 : " + a.getid());
		System.out.println("b의 아이디 : " + b.getid());
		
		
		System.out.println("부여한 아이디 개수: " + 실습3C_1.getcounter()
		);
		
	}
	
}
