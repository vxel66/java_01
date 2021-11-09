package Day29;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Day29_1 {

	
	//��Ʈ��ũ : �δ� �̻��� ��ǻ�͵��� �����ϰ� ����Ҽ� �ִ� ��
		//��Ÿ� : ���ڽ�ȣ�� ���� ����ϴ� ��� ��Ⱑ ���� ����ϱ� ���� �ϳ��� ��
			//LAN ,MAN , WAN 
		//���ͳ� : TCP/IP ��� ��� �������� �̿��� ��ǻ�� ��Ʈ��ũ 
			//�������� : �Ծ�, ��Ģ ,���
	// TCP/IP 
		//TCP : Transmission Control Protocol : ��� ����
		//IP  :	Internet Protocol address     : ��� �ν� ��ȣ
			//���ּ� [�� 1�� -> 1�� �ּ� ] : ��ǻ���ּ�[��ǻ�� 1�� -> 1�� IP ]
			//�ù� 	   [����-> �� ] 	  : ��� [ PC�� -> �п� ]
			//���̹����� [ �п�IP ----> ���̹�IP ]
				//* IP : ���� 0~255 , 4�ڸ� , ����
					//IP�� ����� ����Ʈ���� �ܿ�� ���� ----> ��������
				//*IP --> ���� : �������ּ�[DNS]
	
		//SERVER PC : ���� �ڷḦ �����ص� PC
	
	//���� IP Ȯ�� ���
		//CMD - > ipconfig
		//�ڹ� - > InetAddress
	public static void main(String[] args) {
		
		// 1. ���� pc�� ȣ��Ʈ ��������
		try {
			
			InetAddress address = InetAddress.getLocalHost(); //������ ����ó��
			System.out.println("���� pc ���� ��ü"+address);
			System.out.println(address.getHostName());
			System.out.println(address.getHostAddress());
			//2. ���̹� ȸ�� ȣ��Ʈ ��������
			InetAddress address2 = InetAddress.getByName("www.naver.com");
			System.out.println(address2);
			System.out.println(address2.getHostName());
			System.out.println(address2.getHostAddress());
		// 3. ���̹� ȸ���� �ټ� ip Ȯ��
			InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
			for(InetAddress temp : inetAddresses) {
				System.out.println(temp.getHostAddress());
			}
			InetAddress address3 = InetAddress.getByName("www.facebook.com");
			System.out.println(address3);
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}















