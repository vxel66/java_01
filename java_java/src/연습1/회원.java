package ����1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import ����02.Day12_7_Memberfile;

public class ȸ�� {

	//�ʵ�
	
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;
	//������
	public ȸ��(String m_id, String m_pw) {
		
		this.m_id = m_id;
		this.m_pw = m_pw;
	}
public ȸ��(String m_id, String m_pw,String m_name,String m_phone) {
		
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	public ȸ��() {
		// TODO Auto-generated constructor stub
	}
	
	//�޼ҵ�
	public void ȸ���޴�() {
		System.out.println("�α���");
	}

	static public void �α���() throws Exception {
		FileInputStream fileInputStream = new FileInputStream("C:/java/sample.txt");
		byte[] ����Ʈ�迭 = new byte[1024];
		fileInputStream.read( ����Ʈ�迭 );
		String strread = new String( ����Ʈ�迭 );
		System.out.println(" �������� : " + strread );
		
		System.out.println("���̵� �Է����ּ���"); String id = Practice.scanner.next();
		if(strread.contains(id)) {
		
		System.out.println("��й�ȣ�� �Է����ּ���"); String pw = Practice.scanner.next();
		if(strread.contains(pw)) {
			System.out.println("�α��� �Ϸ�");
		}else {
			System.out.println("��й�ȣ�� �ٸ��ϴ�");
		}
		
		}else {
			System.out.println("���̵� �ٸ��ϴ�");
		}
		
		
		
	}
	
	public void ȸ������() throws Exception {
			
			System.out.println("���̵� �Է����ּ���:");String id = Practice.scanner.next();			
			System.out.println("��й�ȣ �Է�");String pw = Practice.scanner.next();	
			System.out.println("�̸� �Է�");String name = Practice.scanner.next();		
			System.out.println("��ȭ��ȣ �Է�");String num = Practice.scanner.next();
		
			ȸ�� member = new ȸ��(id, pw, name, num);
			
			for(int i = 0; Practice.members.length; i++) {
				if(Practice.members[i]!=null) {
					Practice.members[i]=member;
				}
			}
			
			//3. ���� ����
			FileOutputStream fileOutputStream = new FileOutputStream("C:/java/memberlist.txt");	
				String out = (member.m_id+","+member.m_pw+","+member.m_name+","+member.m_phone);
				fileOutputStream.write( out.getBytes() );
				
		
	}
	//�� ���� : �α��� /ȸ������ [����ó��]

			//���� : ȸ������ ���Ͽ� ����
			// ȸ��Ŭ����: ���̵� ��й�ȣ ���� ����ó
	
	
	public static boolean ���̵�üũ( String id) {
		for(int i = 0; i < Practice.members.length ; i++) {
			//   ******
			if( Practice.members[i] != null &&
				Practice.members[i].getM_id().equals(id)&&
				Practice.members[i] != null ) {
				
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
