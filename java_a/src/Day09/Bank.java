package Day09;

public class Bank implements ATM {
	//슈퍼클래스로 사용할 예정
	//1.필드
	String 계좌번호;
	int 예금액;
	
	//2.생성자
	
	//3.메소드
	@Override
	public void 계좌등록() {
		System.out.println("계좌등록 합니다");
		
	}
	@Override
	public void 예금() {
		System.out.println("예금 합니다");
		
	}
	@Override
	public void 출금() {
		System.out.println("출금 합니다");
		
	}

	@Override
	public void 잔고() {
		System.out.println("잔고확인 합니다");
		
	}
	
	@Override
	public void 이체() {
		System.out.println("이체 합니다");
		
	}
	
	
	
}
