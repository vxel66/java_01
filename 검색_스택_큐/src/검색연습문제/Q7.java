package 검색연습문제;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Q7 {

	//신체 검사 데이터 배열에서 이진 검색하기
	
		//신체 검사 데이터를 정의합니다
		static class PhyscData{
			
			private String name ;	//이름
			private int height;		//키
			private double vision; 	//시력
			
			
			public PhyscData(String name, int height, double vision) {
				this.name = name;
				this.height = height;
				this.vision = vision;
			}
			
			// 문자열을 반환하는 메소드 (정보 확인용)
			public String toString() {
				return name +" "+height+" "+vision;
			}
			
			//오름차순으로 정렬하기 위한 comparator
			public static final Comparator<PhyscData> height_order = new HeightOrderComparator();
			
			private static class HeightOrderComparator implements Comparator<PhyscData>{
				public int compare(PhyscData d1, PhyscData d2) {
					return(d1.vision>d2.vision) ? 1 : (d1.vision < d2.vision) ? - 1 : 0;
				}
			}
		}
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			PhyscData[] x = { //키의 오름차순을 정렬되어 있다
					new PhyscData("이나령", 162, 0.3),
					new PhyscData("유지훈", 168, 0.4),
					new PhyscData("홍준기", 171, 1.4),
					new PhyscData("전서현", 173, 0.7),
					new PhyscData("이수민", 175, 2.4),
			};
			
			System.out.println("시력이 몇인 사람을 찾고 있나요 ?  : ");
			double height = scanner.nextDouble();
			int idx = Arrays.binarySearch(x, 		//배열 x에서
					new PhyscData("", 0, height),	//키가 heigh인 요소를
					PhyscData.height_order);		//heigh_order에 의해 검색
			
			if(idx<0) {
				System.out.println("요소가 없습니다");
			}else {
				System.out.println("x["+idx+"]에 있습니다");
				System.out.println("찾은 데이터 : "+ x[idx]);
			}
		}
	
}
