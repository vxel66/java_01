package ����;

import java.io.IOException;

public class �����˻� {
/*���� �ý��� ����� [ åã�� ]

- ���� �˻� ���α׷�

		1. ���� : ������� �迭����
			[4���� ������ �迭�� ���]
			1. �ȴ� ! ���̹� ��α�&����Ʈ
			2.������ ��Ʈ ���� Ȱ�� ������
			3. Tucker�� Go ��� ���α׷���
			4. ȥ�� �����ϴ� C���

		2. scanner -> System.in.read()

		3. ���� : �˻��� �Է¹޾� �˻��� �ܾ ���Ե� ���� ��� ���
		4. ������� : ������ ������ �Է¹޾� ���� �� ��ü�� �ܾ�� ���ο� �ܾ� �Է¹޾� ��ü

String[] ������� = {
		"�ȴ� ! ���̹� ��α�&����Ʈ"
		"������ ��Ʈ ���� Ȱ�� ������",
		"Tucker�� Go ��� ���α׷���"
		"ȥ�� �����ϴ� C���"
		}
	
	*/
	public static void main(String[] args) throws IOException {
		String[] books = {"�ȴ� ! ���̹� ��α�&����Ʈ" ,"������ ��Ʈ ���� Ȱ�� ������","Tucker�� Go ��� ���α׷���","ȥ�� �����ϴ� C���"};
		
		//
		while(true) {
		
		byte[] byte1 = new byte[100];
			
		System.out.println("1. ������� 2. ����ã�� 3. ��������");
		int ch = System.in.read(byte1);
		//���ڷ� �޾Ƽ�    ����Ʈ �迭�� ����
		String ch2 = new String(byte1,0,ch-2);
		if(ch2.equals("1")) {
			System.out.println("----�������----");
			for(int i = 0 ; i< books.length; i++) {
				System.out.println(books[i]);
				
			}
			
		}
		if(ch2.equals("2")) {
			System.out.println("���� �˻�:");
			ch = System.in.read(byte1);
			String find = new String(byte1,0,ch-2);
			for(int i =0; i<books.length; i++) {
				if(books[i].contains(find)) {
					System.out.println(books[i]);
					
				}
			}
			
			
		}
		if(ch2.equals("3")) {
			System.out.println("������ �����Է�: ");
			int book = System.in.read(byte1);
			String bookname = new String(byte1,0,book-2);
			for(int i = 0 ; i< books.length ; i++) {
				if(books[i]!=null&&
					books[i].equals(bookname)) {
					System.out.println("������ �ܾ�:");
					ch = System.in.read(byte1);
					String origin = new String(byte1,0,ch-2);
					System.out.println("����:");
					ch = System.in.read(byte1);
					String newstr = new String(byte1, 0,ch-1);
					String new1 = books[i].replace(origin, newstr);
					books[i]=new1;
					System.out.println("�Ϸ�");
				}
			}
			
			
			
		}
		}
		
		
	}
	
}
























