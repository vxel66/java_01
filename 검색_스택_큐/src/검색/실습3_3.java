package �˻�;

import java.util.Scanner;

public class �ǽ�3_3 {

	//��ڼ��� n�� �迭a ���� key�� ���� ��Ҹ� ���ʹ��� �����˻�
	static int seqser(int[] a , int n,  int key ) {
		int i = 0;
		a[n] = key; //���ʸ� �߰�
		
		while(true) {
			if (a[i]==key) {//�˻� ����
				break;
			}i++;
		}
		return i == n ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��ڼ� :");
		int num = scanner.nextInt();
		int[] x = new int[ num + 1 ];
		
		for(int i = 0 ; i<num; i++) {
			System.out.println("x["+i+"]:");
			x[i] = scanner.nextInt();
		}
		
		System.out.println("�˻��Ұ� : ");
		int ky = scanner.nextInt();
		
		int idx = seqser(x, num, ky);
		
		if(idx==-1) {
			System.out.println("�װ��� ��Ұ� �����ϴ�");
		}else {
			System.out.println(ky+"��x"
					+ "["+idx+"]�� �ֽ��ϴ�");
		}
	}
}



















