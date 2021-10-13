package Day10;

public class Account {

	private long balance;
	
	public Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	public void deposit (int money) {
		balance += money;
	}
	//출금 [예금액보다 츨
	public void withdraw(int money) throws 잔고부족 {
		if(balance < money )  {
			//예외 만들어서 발생
			throw new 잔고부족("잔고부족: "+(money -balance));
					//잔고부족 클래스 생성
			
		}
		//아니면
		balance -= money;
	}
	
	
}
