package Day09;

public class 신한은행 extends Bank {

	final String 은행코드 = "01";
	
	
	public void 계좌등록() {
		System.out.println("한은행 계좌 등록");
	}
	
	@Override
	public void 예금() {
		System.out.println("신한 예금");
	}
	
	public void 적금() {
		System.out.println("신한 적금");
	}

	public String get은행코드() {
		return 은행코드;
	}
	
	
}
