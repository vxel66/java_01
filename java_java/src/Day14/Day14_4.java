package Day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day14_4 {

	
	// ȸ���� ���α׷�
		//1. ����Ʈ�� �̿��� ȸ������ , �α���, ȸ������ ,ȸ������ ,ȸ��Ż��
	
	public static void main(String[] args) {
	
		//1. �޴�
		Scanner scanner = new Scanner(System.in);
		
		//�迭���� UserŬ���� �� �����ִ� (User Ŭ���� ����Ŭ����(��ӹ���)�� ����)
		ArrayList<User> users = new ArrayList<>();
		
		try {
			FileInputStream fileInputStream = new FileInputStream("C:/Users/505/git/java_01/java_java/src/Day14/UserList.txt");			
			//1. ���ϳ� ��� ���� �������� [��Ʈ�� ���� : ����Ʈ ]
				//1.byte �迭 ����
				byte[] bytes = new byte[1024];// 
				//2. �о����
				fileInputStream.read(bytes);
				String inString = new String(bytes);
			
			//2. ȸ�� �����ϱ�
				String[] usernum = inString.split("\n");
				
			//3. �ʵ� �����ϱ�
				
				for(String temp : usernum) {
					String[] userdata = temp.split(",");
					if(usernum.length == 1) break;					
					//4. ��ü ����
					User user = new User(userdata[0],userdata[1], userdata[2]);
					//5. ����Ʈ �ޱ�
					users.add(user);
					
				}
			
				
			
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		
		while(true) {
			System.out.println("1.ȸ������ 2.�α���");
			int ch = scanner.nextInt();
			
			if(ch==1) {
				System.out.println("���̵�:");	String id = scanner.next();
				System.out.println("��й�ȣ : ");	String pw = scanner.next();
				System.out.println("�̸� :");		String name = scanner.next();
				
				//2. �Է¹��� �����͸� ��üȭ [3�� ������ �ϳ��� ��ü��]
				User user = new User(id , pw , name);
				
				//���̵� �ߺ�üũ [����Ʈ�� ��ü �ϳ��� temp�� ���� ]
				for(User temp : users) {
					if(temp.getId().equals(id)) {
						System.out.println("�ߺ��� ���̵��Դϴ�");
						break;
					}
				}								
				//3.����Ʈ�� ����
				users.add(user);
				System.out.println("ȸ�����Լ���");
				
				//4.����ó��
					//1. ������� Ŭ���� 
					try {
						FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/java_01/java_java/src/Day14/UserList.txt", true);
					 
					//2.String ----> bytes ��������
					String outstring = user.getId()+","+user.getPassword()+","+user.getName()+"\n";
					fileOutputStream.write(outstring.getBytes());
					System.out.println("����ó�� ����");
					}catch (Exception e) {
						System.out.println("����ó�� ����");
					}
				
			}else if (ch==2) {
				System.out.println("���̵�:");	String id = scanner.next();
				System.out.println("��й�ȣ : ");	String pw = scanner.next();
				for(User temp : users) {
					if(temp.getId().equals(id)&&temp.getPassword().equals(pw)) {
						System.out.println("�α��μ���");
						
						///////////////////////////�α��� ����///////////////////////
						
						System.out.println("1.ȸ������ 2.ȸ������ 3. ȸ��Ż�� 4.�α׾ƿ�");
						int ch2 = scanner.nextInt();
						if (ch2==1) {
							System.out.println("���̵� :"+temp.getId());
							System.out.println("�̸� :"+temp.getName());
						}
						if (ch2==2) {
							System.out.println("������ ���� : " ); String newname = scanner.next();
							temp.setName(newname);
							//����ó��
							//1.����Ʈ�� ��� ȸ�� ����[������Ʈ]
							try {
								FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/java_01/java_java/src/Day14/UserList.txt");
								String outString = ""; //��� ȸ�������� ���� ���ڿ�
								for(User temp2 : users) {
									//ȸ���з�
									String outtemp = temp2.getId()+","+temp2.getPassword()+","+temp2.getName()+"\n";
									//�з��� ������ ��� ȸ�� ���ڿ��� �߰�
									outString += outtemp;
								}
								fileOutputStream.write(outString.getBytes());
							} catch (Exception e) {
								
								e.printStackTrace();
							}
							
						}
						if (ch2==3) {
							//����Ʈ ��ü ����
							System.out.println("ȸ��Ż��");
							users.remove(temp);
							//���� ������Ʈ ó��
							try {
								FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/java_01/java_java/src/Day14/UserList.txt");
								String outString = ""; //��� ȸ�������� ���� ���ڿ�
								for(User temp2 : users) {
									//ȸ���з�
									String outtemp = temp2.getId()+","+temp2.getPassword()+","+temp2.getName()+"\n";
									//�з��� ������ ��� ȸ�� ���ڿ��� �߰�
									outString += outtemp;
								}
								fileOutputStream.write(outString.getBytes());
							} catch (Exception e) {
								
								e.printStackTrace();
							}
							break;
						}
						if (ch2==4) {System.out.println("�α׾ƿ�");break;}
						
					}else {System.out.println("������ ȸ�������� �����ϴ�");}
				}
							
				
			}
			
			
		}
		
		
	}
}



















