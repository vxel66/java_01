package ����;

public class �θ� implements �������̽� {

		//�ʵ�
	
		private String m_id;
		private String m_pw;
		private String admin ="admin";
		//������
		public �θ�(String m_id, String m_pw) {
			
			this.m_id = m_id;
			this.m_pw = m_pw;
		}
		public �θ�() {
			// TODO Auto-generated constructor stub
		}
	
	public void ȸ���޴�() {
		System.out.println("1.������� 2.�뿩. 3.�ݳ� 4.�α׾ƿ�");
		System.out.println("���� : "); int ch = Practice.scanner.nextInt();
		if(ch==1) {
			
		}
		if(ch==2) {
			
		}
		if(ch==3) {
			
		}
		if(ch==4) {
			return;
		} 
	}
	public void �����ڸ޴�() {
		System.out.println("1.�������  2.�������  3.�α׾ƿ�");
		System.out.println("����:"); int ch = Practice.scanner.nextInt();
		if(ch==1) {
			
		}
		if(ch==2) {
			
		}
		if(ch==3) {
			return;
		}
	}
	
	
	public String �α���() {
		System.out.println("���̵� �Է����ּ���"); String id = Practice.scanner.next();
		System.out.println("��й�ȣ�� �Է����ּ���"); String pw = Practice.scanner.next();
		
		for(int i = 0; i<Practice.members.length; i++) {
			 
			if(	Practice.members[i] != null &&
				Practice.members[i].getM_id().equals(id)&&
				Practice.members[i].getM_pw().equals(pw))
			{
				if(id.equals("admin")) {
					return "���ηα���";
				}
				return "ȸ���α���";
			}
		}
		
		System.out.println("���̵� �Ǵ� ��й�ȣ�� �ٸ��ϴ�");
		return "�α��ν���";
	}
	
	public void ȸ������() {
		while(true) {
			System.out.println("���̵� �Է����ּ���:");String id = Practice.scanner.next();
			boolean idcheck = ���̵�üũ(id);
			if( idcheck ) {
				System.out.println(" [[ �˸� ]] : ����Ҽ� ���� ���̵� �Դϴ� ");
				 break;
			}
			System.out.println("��й�ȣ �Է�");String pw = Practice.scanner.next();
			
			�θ� idpw = new �θ�(id, pw);
			for(int i = 0; i<Practice.members.length; i++) {
				if(Practice.members[i]==null) {
					Practice.members[i]=idpw;
					System.out.println("ȸ������ �Ϸ�");
					return;
				}
			}
			
		
		}
		
	}
	
	public static boolean ���̵�üũ( String id) {
		for(int i = 0; i < Practice.members.length ; i++) {
			
			if( Practice.members[i] != null &&
				Practice.members[i].getM_id().equals(id)
				
					) {
				
				return true;
			}
		}
		return false;
	}
	
	//���� ����
		public String getM_id() {
			return m_id;
		}
		public void setM_id(String m_id) {
			this.m_id = m_id;
		}
		public String getM_pw() {
			return m_pw;
		}
		public void setM_pw(String m_pw) {
			this.m_pw = m_pw;
		}
		public String getM_idpw() {
			return m_id ;
		}
	
}
