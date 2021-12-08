package 검색;

import java.util.Scanner;

public class 실습3_3 {

	//요솟수가 n인 배열a 에서 key와 같은 요소를 보초법을 선현검색
	static int seqser(int[] a , int n,  int key ) {
		int i = 0;
		a[n] = key; //보초를 추가
		
		while(true) {
			if (a[i]==key) {//검색 성공
				break;
			}i++;
		}
		return i == n ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("요솟수 :");
		int num = scanner.nextInt();
		int[] x = new int[ num + 1 ];
		
		for(int i = 0 ; i<num; i++) {
			System.out.println("x["+i+"]:");
			x[i] = scanner.nextInt();
		}
		
		System.out.println("검색할값 : ");
		int ky = scanner.nextInt();
		
		int idx = seqser(x, num, ky);
		
		if(idx==-1) {
			System.out.println("그값의 요소가 없습니다");
		}else {
			System.out.println(ky+"은x"
					+ "["+idx+"]에 있습니다");
		}
	}
}



















