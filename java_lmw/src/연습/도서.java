package 연습;

public class 도서 {
	//필드
	private int 도서코드;
	private String 도서명;
	private boolean 대여여부;
	private String 대여회원아이디;
	
	//생성자
	public 도서() {
		// TODO Auto-generated constructor stub
	}
	
	public 도서(int 도서코드, String 도서명, boolean 대여여부, String 대여회원아이디) {
		super();
		this.도서코드 = 도서코드;
		this.도서명 = 도서명;
		this.대여여부 = 대여여부;
		this.대여회원아이디 = 대여회원아이디;
	}
	//메소드
	
	
	public int get도서코드() {
		return 도서코드;
	}

	public void set도서코드(int 도서코드) {
		this.도서코드 = 도서코드;
	}

	public String get도서명() {
		return 도서명;
	}

	public void set도서명(String 도서명) {
		this.도서명 = 도서명;
	}

	public boolean is대여여부() {
		return 대여여부;
	}

	public void set대여여부(boolean 대여여부) {
		this.대여여부 = 대여여부;
	}

	public String get대여회원아이디() {
		return 대여회원아이디;
	}

	public void set대여회원아이디(String 대여회원아이디) {
		this.대여회원아이디 = 대여회원아이디;
	}
	
	
}
