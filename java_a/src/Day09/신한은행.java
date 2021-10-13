package Day09;

public class 신한은행 extends Bank{

	final String 은행코드 = "1";
	
	@Override
	public void 계좌등록() {
		System.out.println("------신한은행 계좌 등록 합니다");
	}
	@Override
	public void 예금() {
		System.out.println("신한은행 예금");
	}
}
