package ����;
//day4 ���������� [���] 
//day5 �Խ��� [�迭 , �ݺ���]
//da6 ����
//   ----- java 1��Ʈ ------

//ȸ��Ŭ����: ���̵�,��й�ȣ  final priv, �����ں�й�ȣ
//����Ŭ����: �������
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
