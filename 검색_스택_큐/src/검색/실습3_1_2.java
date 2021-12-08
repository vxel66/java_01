package 검색;

import java.util.Scanner;

public class 실습3_1_2 {
	//while
	static int seqSerch(int[] a , int n , int key) {
		//요솟수가 n인 배열a 에서 kye와 같은 요소를 선형 검색
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
