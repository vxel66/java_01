package ����ť;

import java.util.Scanner;

public class �ǽ�4C_1 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int N = 10;
		int[] a = new int[N];
		int cnt = 0;
		int retry = 1;
		
		System.out.println("������ �Է��ϼ���. ");
		
		
		while(retry==1) {
			System.out.printf("%d��° ���� : ",cnt+1);
			a[cnt++ % N]= scanner.nextInt();
			
			System.out.println("��� �ұ��? (��.1 / �ƴϿ�.0) :"); 
			retry = scanner.nextInt();
		}
		int i = cnt -N;
		if(i<0)i=0;
		
		for(;i<cnt;i++) {
			System.out.printf("%2������ ���� = %d\n",i+1,a[i%N]);
		}
	}
}
