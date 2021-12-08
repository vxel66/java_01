package 검색;

import java.util.Scanner;

public class 실습3_4 {
	//이진검색
	
	// 요솟수가 n인 배열a에서 key와 같은 요소를 이진검색
	static int binser(int[] a, int n, int key) {
		int pl= 0;  //검색 번위의 첫 인덱스
		int pr= n-1; //검색 범위의 끝 인덱스
		
		do {
			int pc = (pl+pr)/2; //중앙 요소의 인덱스
			if(a[pc]==key) {
				return pc;    	// 검색 성공
			}else if (a[pc]<key) {
				pl= pc +1;		//검색 범위를 뒤쪽 절반으로 좁힘
			}else {
				pr = pc - 1; 	//검색 범위를 압쪽 절반으로
			}
		}while(pl<=pr);
		return -1;				//검색 실패
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = scanner.nextInt();
		int[]x = new int[num];
		
		System.out.println("오름차순으로 입력하세요");
		
		System.out.println("x[0] : ");
		x[0] = scanner.nextInt(); //첫 요소 입력
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.println("x["+i+"] : ");
				x[i] = scanner.nextInt();
			}while(x[i] < x[i-1]); 		//바로 앞의 요소보다 작으면 다시 입력
		}
		
		System.out.println("검색할 값 :"); //  키값을 입력
		int ky = scanner.nextInt();
		
		int idx = binser(x, num, ky);
		
		if(idx==-1) {
			System.out.println("그 값의 요소가 없습니다");
		}else {
			System.out.println(ky+"은 x ["+idx+"]에 있습니다");
		}
	}
	
}
























