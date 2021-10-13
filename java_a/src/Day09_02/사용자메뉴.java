package Day09_02;

public interface 사용자메뉴 {

	//상수 필드
	
	//추상 메소드
	public void 상품구매();
	public void 상품환불();
	public void 상품리스트();

	//default 메소드
	default void 실행() {
		System.out.println(" 회원메뉴 실행 합니다");
	}
	//정적 메소드
	
}
