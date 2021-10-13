package Day09_02;

public class 쇼핑몰 implements 사용자메뉴 {
	
	//1.필드
	String 상품명;
	int 상품재고;
	int 상품가격;
	
	
	
	//2.생성자
	
	//3메소드
	@Override
	public void 상품구매() {
		System.out.println("상품 구매합니다");
		
	}

	@Override
	public void 상품환불() {
		System.out.println("상품 환불합니다");
		
	}

	@Override
	public void 상품리스트() {
		System.out.println("상품리스트");
		
	}

	
}
