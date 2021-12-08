package 검색연습문제;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
	//for
	static void seqser(int[] a , int n , int key ) {
		int x =0;
		for(int i = 0 ; i<n ; i++) {
			if(a[i]==key) {
				x++;
			}
		}
		int[] idk = new int[x];
		for(int i = 0 ; i<n ; i++) {
			for(int j = 0 ; j<idk.length; j++) {
				if(a[i]==key) {
					if(idk[j]==0) {
						idk[j]=i;
						break;
					}
				}
			}
		}
		System.out.println("idk 크기 : "+x);
		System.out.print("");
			System.out.print(Arrays.toString(idk));
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
		seqser(x, num, ky);
	}
	
	
	
	
}
