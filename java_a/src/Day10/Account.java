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
	//��� [���ݾ׺��� ��
	public void withdraw(int money) throws �ܰ���� {
		if(balance < money )  {
			//���� ���� �߻�
			throw new �ܰ����("�ܰ����: "+(money -balance));
					//�ܰ���� Ŭ���� ����
			
		}
		//�ƴϸ�
		balance -= money;
	}
	
	
}
