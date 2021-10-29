package 연습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class 성적 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<성적표> arrayList = new ArrayList<>();
		
		
		while (true) {
			
			try {
			System.out.println("1.성적표 2.성적입력");
			int ch = scanner.nextInt();
			if(ch==1) {
				
				for(성적표 temp : arrayList) {
					temp.set석차(1);
					for(성적표 temp2 : arrayList) {
						if(temp.get총점()<temp2.get총점()) {
							temp.set석차(temp.get석차()+1);
						}
					}
				}			
				
			Collections.sort(arrayList);
			
			System.out.println("성적표");
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
			for(성적표 temp : arrayList) {
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",temp.get이름(),temp.get국어(),temp.get영어(),temp.get수학(),temp.get총점(),
						temp.get평균(),temp.get석차());
			}
			
			
			
				
			}
			if(ch==2) {
				System.out.println("이름 : "); String 이름 = scanner.next();
				System.out.println("국어 : "); int 국어 = scanner.nextInt();
				System.out.println("영어 : "); int 영어 = scanner.nextInt();
				System.out.println("수학 : "); int 수학 = scanner.nextInt();
				
				int 총점 = (국어+영어+수학) ;
				double 평균 =(double)(국어+영어+수학)/3;
				
				성적표 성적모음 = new 성적표(이름, 국어, 영어, 수학, 총점, 평균, 1);
				
				arrayList.add(성적모음);
				
				
			}
			}catch (Exception e) {
				System.out.println("잘못된 입력입니다");
				scanner= new Scanner(System.in);
			}
		}
		
		
	}
	
	
}
