package Day09_02;

public class 실행 {

	public static void main(String[] args) {
		
		//인터페이스 생성
		사용자메뉴 사용자메뉴;
		//인터페이스 클래스 연결
		사용자메뉴 = new 쇼핑몰_1();
		// 인터페이스로 부터 클래스 조작
		사용자메뉴.상품구매();
		사용자메뉴.상품환불();
		사용자메뉴.상품리스트();
		
		사용자메뉴 = new 쇼핑몰_2();
		
		사용자메뉴.상품구매();
		사용자메뉴.상품환불();
		사용자메뉴.상품리스트();
		
	}
	
}
