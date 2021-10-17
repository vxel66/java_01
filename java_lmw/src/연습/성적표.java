package 연습;

import java.util.Scanner;

public class 성적표 {
	/*	무제한 입력
	 * 번호 , 이름 , 국어 ,영어 , 수학 입력
	 * 총점 평균 출력
	 * 평균은 소숫점 이하 2자리까지
	 * 총점을 이용하여 석차
	 * 입력 오류에 대하여 예외발생 상황에 대한 처리
	*/
	static 성적[] 성적표 = new 성적[100];
	static Scanner scanner = new Scanner(System.in);
		public static void main(String[] args) throws Exception {
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
			System.out.println("1.성적표 2.점수입력");
			int ch = scanner.nextInt();
			
			if(ch==1) {
				성적표();
				
			}
			else if(ch==2) {
				점수입력();
			}
			else if(ch==3) {
				
			}
			else System.out.println("잘못된 입력입니다");
			}
		}
		
		static void 점수입력() {
			
			while(true) {
				System.out.println("번호:");int 번호 = scanner.nextInt();
				
				for(int i = 0; i<성적표.length;i++) {
					if(성적표[i]!=null&&성적표[i].get번호()==번호) {
						System.out.println("존재하는 번호입니다");
						return;
					}
				}
				System.out.println("이름:");String 이름 = scanner.next();
				
				System.out.println("국어:");int 국어 = scanner.nextInt();
				
				System.out.println("영어:");int 영어 = scanner.nextInt();
				
				System.out.println("수학:");int 수학 = scanner.nextInt();
				
				int 총점 = 국어+영어+수학;
				
				double 평균 = (국어+영어+수학)/3;
				
				성적 성적 = new 성적(번호, 이름, 국어, 영어, 수학, 총점, 평균, 1);
							
				for(int i = 0; i<성적표.length;i++) {					
					if(성적표[i]==null) {
						성적표[i]=성적;
						return;
					}
				}					
			

				
			}
						
		}
		
		static void 성적표() {
			
			for(int i =0; i<성적표.length; i++) {
				if(성적표[i]!=null) {
					성적표[i].set석차(1);
					for(int j = 0; j<성적표.length ; j++) {
						if(성적표[i]!=null&&성적표[j]!=null&&성적표[i].get총점()<성적표[j].get총점()) {
							성적표[i].set석차(성적표[i].get석차()+1);
						}
					}
				}
			}
			
									
			System.out.println("성적표");
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");		
			for(int i =0; i<성적표.length; i++) {			
				if(성적표[i]==null)break;{
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",성적표[i].get번호(),성적표[i].get이름()
							,성적표[i].get국어(),성적표[i].get영어(),성적표[i].get수학()
							,성적표[i].get총점(),성적표[i].get평균(),성적표[i].get석차());
					
				}
				}
			}
			
		}
		



















