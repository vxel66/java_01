package 연습;
//day4 가위바위보 [제어문] 
//day5 게시판 [배열 , 반복문]
//da6 계좌
//   ----- java 1파트 ------

//회원클래스: 아이디,비밀번호  final priv, 관리자비밀번호
//도서클래스: 도서목록
public class Account {

	private String ano;
	private String owner;
	private int balance;
	
	
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}


	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
