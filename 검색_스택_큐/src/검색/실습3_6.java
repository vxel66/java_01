package �˻�;

import java.util.Arrays;
import java.util.Scanner;

public class �ǽ�3_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		String[] x= {
				"abstract" , "assert" , "boolean", "break" , "byte"
		};
		
		System.out.println("���ϴ� Ű���带 �Է��ϼ��� : ");
		String ky = scanner.next(); // Ű���� �Է�
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx<0) {
			System.out.println("�ش� Ű���尡 �����ϴ�");
		}else {
			System.out.println("�ش� Ű�����x["+ idx +"]�� �ֽ��ϴ�");
		}
	}
	
}
