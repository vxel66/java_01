package Day07;

import java.util.Scanner;

import Day06.Account;

public class Member {
	


	

	//1.필드 아이디,비밀번호,이름,연락처
	private String m_id ;
	private String l_pw ;
	private String m_name ;
	private String m_phone;
	
	//2.생성자 [객체 생성시 필드의 초기값]
		//1.회원가입시 생성되는 객체의 생성자
		//2.빈 생성자
	public Member() {
	}

	public Member(String m_id, String l_pw, String m_name, String m_phone) {
		super();
		this.m_id = m_id;
		this.l_pw = l_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	//3.메소드 [동작]
		
		//2.회원가입 메소드
	static public boolean signup() {
		// public :main 속한 클래스(외부클래스)로 호출하기위해
		System.out.println("--------------------------------");
		System.out.println("회원가입");
		System.out.println("--------------------------------");
		System.out.println("아이디 입력:"); 	String 아이디 = 	BookApplication.scanner.next();
			boolean check = idcheck(아이디);
			if(check) {
				System.out.println("사용할수 없는 아이디입니다");
				return false;
			}
			
		
		System.out.println("비밀번호 입력:"); 	String 비밀번호 =  BookApplication.scanner.next();
		System.out.println("이름 입력:");   	String 이름 =  	BookApplication.scanner.next();
		System.out.println("전화번호 입력:"); 	String 전화번호 =  BookApplication.scanner.next();
		
		//2.입력받은 정보로 객체 생성 [생성자]
		Member member = new Member(아이디, 비밀번호, 이름, 전화번호);
		
		//3.
		for(int i =0 ; i< BookApplication.members.length; i++ ) {
			if(BookApplication.members[i]==null) {
				BookApplication.members[i]=member;
				System.out.println("회원가입 완료");
				return true; //회원가입 성공시 --> 메소드 강제종료
			}
		}
		
		return false;
	}
	//6.아이디 체크(종복체크) 메소드 
	public static boolean idcheck(String check_id) {
		for(int i =0; i<BookApplication.members.length; i++) {
			if(BookApplication.members[i] != null&& BookApplication.members[i].getM_id().equals(check_id)) {
				return true;
			}
		}
	return false; // 인수와 동일한 아이디가 배열내 존재하면 true
}
		
		//3.로그인 메소드 [입력받은 아이디와 비밀번호가 배열내 존재하면 로그인 성공 아니면 실패]	
	public static String login() {
		//반환값 : 로그인 성공시 -> 성공한 아이디 / 실패시 null
		System.out.println("아이디:"); String m_id = BookApplication.scanner.next();
		System.out.println("비밀번호:"); String m_pw = BookApplication.scanner.next();
		
		for(int i = 0 ; i<BookApplication.members.length; i++) {
			if(BookApplication.members[i]!=null&&BookApplication.members[i].getM_id().equals(m_id)&&
					BookApplication.members[i].getL_pw().equals(m_pw)) {
				 return m_id; //로그인 성공시 성공 아이디 반환
			}
				
		}
		
		
		return null;//로그인 실패
	}
		
		//4.아이디찾기 메소드 (이름과 연락처 입력받아 아이디 알려주기
	
	static public String findid() {
		//반환값 : 찾았을때 ==> 아이디 / 실패시 null
		System.out.println("------- 아이디 찾기 --------");
		System.out.println("이름:"); String m_name = BookApplication.scanner.next();
		System.out.println("번호:"); String m_phone = BookApplication.scanner.next();
		
		for(int i = 0 ; i<BookApplication.members.length; i++) {
			if(BookApplication.members[i]!=null&&BookApplication.members[i].getM_name().equals(m_name)&&
					BookApplication.members[i].getM_phone().equals(m_phone)) {
				 return BookApplication.members[i].getM_id(); //로그인 성공시 성공 아이디 반환
			}
				
		}
		
		return null;
	}
	 	
		//5.비밀번호찾기 메소드 (아이디, 연락처 입력 비밀번호 알려주기
	static public String findpw() {
		//반환값 : 찾았을때 ==> 아이디 / 실패시 null
		System.out.println("------- 비밀번호 찾기 --------");
		System.out.println("아이디:"); String m_id = BookApplication.scanner.next();
		System.out.println("번호:"); String m_phone = BookApplication.scanner.next();
		
		for(int i = 0 ; i<BookApplication.members.length; i++) {
			if(BookApplication.members[i]!=null&&BookApplication.members[i].getM_id().equals(m_id)&&
					BookApplication.members[i].getM_phone().equals(m_phone)) {
				 return BookApplication.members[i].getM_id(); //로그인 성공시 성공 아이디 반환
			}
				
		}
		
		return null;
	}
	

	
	//1.필드를 private => get, set 메소드 사용
	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getL_pw() {
		return l_pw;
	}

	public void setL_pw(String l_pw) {
		this.l_pw = l_pw;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_phone() {
		return m_phone;
	}

	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	
	
	
	
}
