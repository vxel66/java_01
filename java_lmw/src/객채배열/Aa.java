package ��ä�迭;



public class Aa {

	static Ab[] books = new Ab[100];
	
	public static void main(String[] args) {
		
		// ��ü �迭 �� �ʱ�ȭ, �迭�� ��Ұ� ��ü, �����ڸ� ���� �� �ʱ�ȭ
		books[0] = new Ab("����");
		
		// ��ü �迭�� ����� �� ��� [ ��ü�� ����Ǿ� ��ü�� ����Ǿ� �ֱ� ������ ������ �ּҰ��� ��µ�]
		System.out.println(books[0]);
		
		// ��� 
		System.out.println(books[0].booklist);
		System.out.println(books[0].getBooklist());
		
		// private
		books[1] = new Ab(227);
		
		//private �Ͻ� ��ºҰ�
//		System.out.println(books[1].booknum);
	
		//get �̿�
		System.out.println(books[1].getBooknum());
		
	}
}
