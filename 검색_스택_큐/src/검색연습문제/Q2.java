package 검색연습문제;

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
		System.out.println("요솟수");
		int num = scanner.nextInt();
		int[] x = new int[num]; //요솟수가 num인 배열
		
		for(int i = 0; i<num ; i++) {
			System.out.println("x["+i+"]:");
			x[i]=scanner.nextInt();
		}
		System.out.println("검색할 값 :"); //키 값을 입력
		int ky = scanner.nextInt();
		int idx = seqser(x, num, ky); //배열 x에서 키값이 ky인 요소를 검색
		
		if(idx==-1)System.out.println("그값의 요소가 없습니다");
		else System.out.println(ky+"은 x["+idx+"]에 있습니다");
	}

}
