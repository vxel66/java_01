package �˻�;

import java.util.Arrays;
import java.util.Scanner;

public class �ǽ�3_5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int num = scanner.nextInt();
		int[] x = new int[num];		//��ڼ��� num�� �迭 ����
		
		System.out.println("������������ �Է��ϼ���");
		
		System.out.println("x[0] : ");
		x[0] = scanner.nextInt();	//�迭�� ù ��Ҹ� ���� �Է�
		
		for(int i = 1; i<num; i++) {
			do {
				System.out.println("x["+i+"] : ");
				x[i] = scanner.nextInt();
			}while(x[i]<x[i-1]);	//�ٷ� ���� ���� ���� ������ �ٽ� �Է��Ѵ�
		}
		
		System.out.println("�˻��� �� : "); //Ű ���� �Է� ����
		int ky = scanner.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx<0) {
			System.out.println("�װ��� ��Ұ� �������");
		}else {
			System.out.println(ky+"��x["+idx+"]���ֽ��ϴ�");
		}
	}
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	