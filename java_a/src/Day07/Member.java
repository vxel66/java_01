package Day07;

import java.util.Scanner;

import Day06.Account;

public class Member {
	


	

	//1.�ʵ� ���̵�,��й�ȣ,�̸�,����ó
	private String m_id ;
	private String l_pw ;
	private String m_name ;
	private String m_phone;
	
	//2.������ [��ü ������ �ʵ��� �ʱⰪ]
		//1.ȸ�����Խ� �����Ǵ� ��ü�� ������
		//2.�� ������
	public Member() {
	}

	public Member(String m_id, String l_pw, String m_name, String m_phone) {
		super();
		this.m_id = m_id;
		this.l_pw = l_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	//3.�޼ҵ� [����]
		
		//2.ȸ������ �޼ҵ�
	static public boolean signup() {
		// public :main ���� Ŭ����(�ܺ�Ŭ����)�� ȣ���ϱ�����
		System.out.println("--------------------------------");
		System.out.println("ȸ������");
		System.out.println("--------------------------------");
		System.out.println("���̵� �Է�:"); 	String ���̵� = 	BookApplication.scanner.next();
			boolean check = idcheck(���̵�);
			if(check) {
				System.out.println("����Ҽ� ���� ���̵��Դϴ�");
				return false;
			}
			
		
		System.out.println("��й�ȣ �Է�:"); 	String ��й�ȣ =  BookApplication.scanner.next();
		System.out.println("�̸� �Է�:");   	String �̸� =  	BookApplication.scanner.next();
		System.out.println("��ȭ��ȣ �Է�:"); 	String ��ȭ��ȣ =  BookApplication.scanner.next();
		
		//2.�Է¹��� ������ ��ü ���� [������]
		Member member = new Member(���̵�, ��й�ȣ, �̸�, ��ȭ��ȣ);
		
		//3.
		for(int i =0 ; i< BookApplication.members.length; i++ ) {
			if(BookApplication.members[i]==null) {
				BookApplication.members[i]=member;
				System.out.println("ȸ������ �Ϸ�");
				return true; //ȸ������ ������ --> �޼ҵ� ��������
			}
		}
		
		return false;
	}
	//6.���̵� üũ(����üũ) �޼ҵ� 
	public static boolean idcheck(String check_id) {
		for(int i =0; i<BookApplication.members.length; i++) {
			if(BookApplication.members[i] != null&& BookApplication.members[i].getM_id().equals(check_id)) {
				return true;
			}
		}
	return false; // �μ��� ������ ���̵� �迭�� �����ϸ� true
}
		
		//3.�α��� �޼ҵ� [�Է¹��� ���̵�� ��й�ȣ�� �迭�� �����ϸ� �α��� ���� �ƴϸ� ����]	
	public static String login() {
		//��ȯ�� : �α��� ������ -> ������ ���̵� / ���н� null
		System.out.println("���̵�:"); String m_id = BookApplication.scanner.next();
		System.out.println("��й�ȣ:"); String m_pw = BookApplication.scanner.next();
		
		for(int i = 0 ; i<BookApplication.members.length; i++) {
			if(BookApplication.members[i]!=null&&BookApplication.members[i].getM_id().equals(m_id)&&
					BookApplication.members[i].getL_pw().equals(m_pw)) {
				 return m_id; //�α��� ������ ���� ���̵� ��ȯ
			}
				
		}
		
		
		return null;//�α��� ����
	}
		
		//4.���̵�ã�� �޼ҵ� (�̸��� ����ó �Է¹޾� ���̵� �˷��ֱ�
	
	static public String findid() {
		//��ȯ�� : ã������ ==> ���̵� / ���н� null
		System.out.println("------- ���̵� ã�� --------");
		System.out.println("�̸�:"); String m_name = BookApplication.scanner.next();
		System.out.println("��ȣ:"); String m_phone = BookApplication.scanner.next();
		
		for(int i = 0 ; i<BookApplication.members.length; i++) {
			if(BookApplication.members[i]!=null&&BookApplication.members[i].getM_name().equals(m_name)&&
					BookApplication.members[i].getM_phone().equals(m_phone)) {
				 return BookApplication.members[i].getM_id(); //�α��� ������ ���� ���̵� ��ȯ
			}
				
		}
		
		return null;
	}
	 	
		//5.��й�ȣã�� �޼ҵ� (���̵�, ����ó �Է� ��й�ȣ �˷��ֱ�
	static public String findpw() {
		//��ȯ�� : ã������ ==> ���̵� / ���н� null
		System.out.println("------- ��й�ȣ ã�� --------");
		System.out.println("���̵�:"); String m_id = BookApplication.scanner.next();
		System.out.println("��ȣ:"); String m_phone = BookApplication.scanner.next();
		
		for(int i = 0 ; i<BookApplication.members.length; i++) {
			if(BookApplication.members[i]!=null&&BookApplication.members[i].getM_id().equals(m_id)&&
					BookApplication.members[i].getM_phone().equals(m_phone)) {
				 return BookApplication.members[i].getM_id(); //�α��� ������ ���� ���̵� ��ȯ
			}
				
		}
		
		return null;
	}
	

	
	//1.�ʵ带 private => get, set �޼ҵ� ���
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
