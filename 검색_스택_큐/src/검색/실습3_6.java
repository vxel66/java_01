package 검색;

import java.util.Arrays;
import java.util.Scanner;

public class 실습3_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		String[] x= {
				"abstract" , "assert" , "boolean", "break" , "byte"
		};
		
		System.out.println("원하는 키워드를 입력하세요 : ");
		String ky = scanner.next(); // 키값을 입력
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx<0) {
			System.out.println("해당 키워드가 없습니다");
		}else {
			System.out.println("해당 키워드는x["+ idx +"]에 있습니다");
		}
	}
	
}
