package �˻�;

import java.util.Scanner;

public class �ǽ�3_1_2 {
	//while
	static int seqSerch(int[] a , int n , int key) {
		//��ڼ��� n�� �迭a ���� kye�� ���� ��Ҹ� ���� �˻�
		int i =0;
		while(true) {
			if(i==n) return -1;
			if(a[i]==key)return i;
			i++;
		}
	}
	//for
	static int seqser(int[] a , int n , int key) {
		for(int i = 0 ; i< n ;i++) {                                                                                                                                                                                                                                         
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
