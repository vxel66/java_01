package 연습;

public class 도서 {
	//필드
	private String 도서코드;
	private String 도서명;
	private boolean 대여여부;
	private String 대여회원아이디;
	
	//생성자
	public 도서() {
		// TODO Auto-generated constructor stub
	}
	public 도서( String 도서코드, String 도서명) {
		this.도서코드 = 도서코드;
		this.도서명 = 도서명;
	}
	
	
	
	
	public 도서(String 도서코드, String 도서명, boolean 대여여부, String 대여회원아이디) {
		super();
		this.도서코드 = 도서코드;
		this.도서명 = 도서명;
		this.대여여부 = 대여여부;
		this.대여회원아이디 = 대여회원아이디;
	}
	//메소드
	public void 도서등록() {
		System.out.println("등록할 도서코드");
		String 도서코드 = Practice.scanner.next();
		System.out.println("등록 도서명");
		String 도서명 = Practice.scanner.next();
		도서 도서코드명 = new 도서(도서코드 ,도서명);
		
		boolean cheak =  도서체크(도서코드,도서명);
		if(cheak== true) {
			System.out.println("도서등록완료");
			
		}
		
		
	}
	public boolean 도서체크(String 도서코드, String 도서명) {
		for(int i = 0 ; i< Practice.books.length ; i++) {
			if(Practice.books[i]!=null&&
				Practice.books[i].get도서명().equals(도서명)&&
				Practice.books[i].get도서코드().equals(도서코드)) {
				return true;
				
			}
		}
		
		
		
		return false;
	}
	
	
	
	
	public String get도서코드() {
		return 도서코드;
	}

	public void set도서코드(String 도서코드) {
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
