package �˻���������;

import java.util.Scanner;

public class Q1 {
	
	//�ǽ� 3-3dml seqserchsen �޼ҵ带 while���� �ƴ϶� for���� ����Ͽ� ������ ���α׷��� �ۼ��Ͻÿ�
	
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
		
		static int seqser2(int[] a , int n , int key) {
			a[n] = key; //���ʸ� �߰�
			
			for(int i = 0; i<a.length; i++) {
				if(a[i]==key) {
					return i;
				}
			}
			return -1;
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
			
			int idx = seqser2(x, num, ky);
			
			if(idx==-1) {
				System.out.println("�װ��� ��Ұ� �����ϴ�");
			}else {
				System.out.println(ky+"��x"
						+ "["+idx+"]�� �ֽ��ϴ�");
			}
		}
}
