package �˻���������;

import java.util.Scanner;


public class Q2 {

	static int seqser(int[] a , int n , int key) {
		System.out.print(" ");
		System.out.print("|");
		for(int b = 0; b< n ; b++) {
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("------------------");
		for(int i = 0 ; i< n ;i++) {
			System.out.print(" ");
			System.out.print("|");
			for(int x =0; x< n ; x++) {
				if(x==i) {
					System.out.print("*");
				}
				System.out.print("  ");
				if(x==n-1) {
					System.out.println();
				}
			}
			for(int j = 0; j< n; j++) {
				if(j==0) {
					System.out.print(i);
					System.out.print("|");
				}
				System.out.print(a[j]+" ");
				
			}
			System.out.println();
			if(a[i]==key) {
				return i;
			}
		}return -1;
	}
	
	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("��ڼ�");
		int num = scanner.nextInt();
		int[] x = new int[num]; //��ڼ��� num�� �迭
		
		for(int i = 0; i<num ; i++) {
			System.out.println("x["+i+"]:");
			x[i]=scanner.nextInt();
		}
		System.out.println("�˻��� �� :"); //Ű ���� �Է�
		int ky = scanner.nextInt();
		int idx = seqser(x, num, ky); //�迭 x���� Ű���� ky�� ��Ҹ� �˻�
		
		if(idx==-1)System.out.println("�װ��� ��Ұ� �����ϴ�");
		else System.out.println(ky+"�� x["+idx+"]�� �ֽ��ϴ�");
	}

}
