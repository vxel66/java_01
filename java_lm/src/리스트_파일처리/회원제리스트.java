package ����Ʈ_����ó��;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;



public class ȸ��������Ʈ {

	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Member> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		try {
			//1 ���ϳ� ������ ��������
			FileInputStream fileInputStream = new FileInputStream("C:/Users/minwook/Downloads/�� ����/pekora.txt");
			//����Ʈ�迭����
			byte[] bytes = new byte[1024];
			//����Ʈ �о����
			fileInputStream.read(bytes);
			//����Ʈ�� ���ڿ��� ����
			String inString = new String(bytes);
			// ȸ�������ϱ�
			String[] usernum = inString.split("\n");
			//�ʵ� �����ϱ�
			for(String temp : usernum) {
				String[] userdata = temp.split(",");
				if(userdata.length ==1) break;
				
				Member member = new Member(userdata[0], userdata[1], userdata[2]);
				
				list.add(member);
			}
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		while(true) {
			System.out.println("1. ȸ������ 2.�α���");
			int ch = scanner.nextInt();
			
			if(ch == 1 ) {
			System.out.println("���̵� :");	String id = scanner.next();
			System.out.println("��й�ȣ :");	String pw = scanner.next();
			System.out.println("�̸� :");		String name = scanner.next();
			
			boolean idcheck =true ;
			for(int i = 0; i< list.size() ; i++) {
				if(list.get(i).getId().equals(id)) {
					idcheck = false; break;
				}
			}
			
			if(idcheck) {
			list.add(new Member(id, pw, name));
			try {
				FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/minwook/Downloads/�� ����/pekora.txt",true);
				String out = "";
				for(Member temp : list) {
					String outtemp = temp.getId()+","+temp.getPw()+","+temp.getName()+"\n";
					out+=outtemp;
				}
				fileOutputStream.write(out.getBytes());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			}else System.out.println("���̵� �����մϴ�");			
			}
			if(ch == 2) {
				System.out.println(" ���̵� : ");		String id = scanner.next();
				System.out.println(" ��й�ȣ : ");	String password = scanner.next();
				
				for(Member temp : list) {
					if(temp.getId().equals(id)&&temp.getPw().equals(password)) {
						while(true) {
							System.out.println("1.ȸ������ 2.ȸ������ 3.ȸ��Ż�� 4.�α׾ƿ� ");
							int ch3 = scanner.nextInt();
							if(ch3 == 1) {
								System.out.println(temp.getId());
								System.out.println(temp.getName());
							}
							if(ch3 == 2) {
								System.out.println("������ ���� : ");String newname = scanner.next();
								//set �޼ҵ带 ���� �ʵ尪 ����
								temp.setName(newname);
								try {
									FileOutputStream fileOutputStream = new FileOutputStream("\"C:/Users/minwook/Downloads/�� ����/pekora.txt\",true");
									
									//����Ʈ�� ���ȸ�� ���� [������Ʈ[
									String outstring =""; //���ȸ���� ������ ���� ���ڿ�
									for(Member temp2 : list) {
										String outtemp = temp.getId()+","+temp.getPw()+","+temp.getName()+"\n";
										outstring+=outtemp;
									}
									fileOutputStream.write(outstring.getBytes());
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								
							}
							if(ch3 == 3) {
								
							}
							if(ch3 == 4) {
								System.out.println("�α׾ƿ�");
							}
							
						}
						
					}else {
						System.out.println("���̵�Ǵ� ��й�ȣ�� �帳�ϴ�");
					}
				}
					
				
			}
		}
	}
	
	
	
}






















