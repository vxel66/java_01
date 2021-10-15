package Day11;

public class Not extends Exception {

	//예외 클래스 만들기 로 사용하기 extends
	
	//필드
	
	//생성자
	public Not(String message) {
		super(message); //예외클래스에게 메소드 보내기
	//super():부모의 생성자
	//super.필드 // super.메소드
	}
	
	public Not() {
		// TODO Auto-generated constructor stub
	}
	
	//메소드
}
