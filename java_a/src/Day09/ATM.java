package Day09;

public interface ATM {

	//상수 필드
	
	//추상 메소드
	public void 계좌등록();
	public void 예금();
	public void 출금();
	public void 이체();
	public void 잔고();
	
	//default 메소드
	default void 실행() {
		System.out.println("ATM 실행 합니다");
	}
	//정적 메소드
	
}
