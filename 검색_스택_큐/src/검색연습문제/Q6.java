package 검색연습문제;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = scanner.nextInt();
		int[] x = new int[num];		//요솟수가 num인 배열 생성
		
		System.out.println("오름차순으로 입력하세요");
		
		System.out.println("x[0] : ");
		x[0] = scanner.nextInt();	//배열의 첫 요소를 먼저 입력
		
		for(int i = 1; i<num; i++) {	//바로 앞의 숫자 보다 작으면 다시 입력한다
			while(x[i]<x[i-1]){
				System.out.println("x["+i+"] : ");
				x[i] = scanner.nextInt();
			}	
		}
		
		System.out.println("검색할 값 : "); //키 값을 입력 받음
		int ky = scanner.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx<0) {
			System.out.println("그값의 요소가 없습니다 삽입포인트값 : "+(-idx-1));
		}else {
			System.out.println(ky+"은x["+idx+"]에있습니다");
		}
	}
	
	
}
