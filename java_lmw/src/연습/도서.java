package ����;

public class ���� {
	//�ʵ�
	private String �����ڵ�;
	private String ������;
	private boolean �뿩����;
	private String �뿩ȸ�����̵�;
	
	//������
	public ����() {
		// TODO Auto-generated constructor stub
	}
	public ����( String �����ڵ�, String ������) {
		this.�����ڵ� = �����ڵ�;
		this.������ = ������;
	}
	
	
	
	
	public ����(String �����ڵ�, String ������, boolean �뿩����, String �뿩ȸ�����̵�) {
		super();
		this.�����ڵ� = �����ڵ�;
		this.������ = ������;
		this.�뿩���� = �뿩����;
		this.�뿩ȸ�����̵� = �뿩ȸ�����̵�;
	}
	//�޼ҵ�
	public void �������() {
		System.out.println("����� �����ڵ�");
		String �����ڵ� = Practice.scanner.next();
		System.out.println("��� ������");
		String ������ = Practice.scanner.next();
		���� �����ڵ�� = new ����(�����ڵ� ,������);
		
		boolean cheak =  ����üũ(�����ڵ�,������);
		if(cheak== true) {
			System.out.println("������ϿϷ�");
			
		}
		
		
	}
	public boolean ����üũ(String �����ڵ�, String ������) {
		for(int i = 0 ; i< Practice.books.length ; i++) {
			if(Practice.books[i]!=null&&
				Practice.books[i].get������().equals(������)&&
				Practice.books[i].get�����ڵ�().equals(�����ڵ�)) {
				return true;
				
			}
		}
		
		
		
		return false;
	}
	
	
	
	
	public String get�����ڵ�() {
		return �����ڵ�;
	}

	public void set�����ڵ�(String �����ڵ�) {
		this.�����ڵ� = �����ڵ�;
	}

	public String get������() {
		return ������;
	}

	public void set������(String ������) {
		this.������ = ������;
	}

	public boolean is�뿩����() {
		return �뿩����;
	}

	public void set�뿩����(boolean �뿩����) {
		this.�뿩���� = �뿩����;
	}

	public String get�뿩ȸ�����̵�() {
		return �뿩ȸ�����̵�;
	}

	public void set�뿩ȸ�����̵�(String �뿩ȸ�����̵�) {
		this.�뿩ȸ�����̵� = �뿩ȸ�����̵�;
	}
	
	
}
