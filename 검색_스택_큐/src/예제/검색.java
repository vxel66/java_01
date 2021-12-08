package 예제;

import java.util.Scanner;


public class 검색 {
	
	
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


				public String getName() {
					return name;
				}


				public void setName(String name) {
					this.name = name;
				}


				public int getHeight() {
					return height;
				}


				public void setHeight(int height) {
					this.height = height;
				}


				public double getVision() {
					return vision;
				}


				public void setVision(double vision) {
					this.vision = vision;
				}
				
				// 문자열을 반환하는 메소드 (정보 확인용)
				public String toString() {
					return name +" "+height+" "+vision;
				}
				
				
			}
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				PhyscData[] x = { //키의 오름차순을 정렬되어 있다
						new PhyscData("이나령", 162, 0.3),
						new PhyscData("홍준기", 171, 1.4),
						new PhyscData("전서현", 173, 0.7),
						new PhyscData("이수민", 175, 2.4),
						new PhyscData("유지훈", 168, 0.4),
						
						
						
				};
				while(true) {
					System.out.println("검색하기 : (1)키가 제일 큰사람 ");
					int ch = scanner.nextInt();
					if(ch==1) {
						int z = 0;
						int y = 0;
						
						for(int i =0; i<=x.length; i++) {
							
							System.out.println(y);
							if(i==x.length-1) {
								System.out.println("키가 가장 큰사람은 " + x[z].toString());
								break;
							}
							if(y < x[i].height) {
								z=i;
								y=x[i].height;
							}
							
						}
					}else {
						continue;
					}
					
				}
				
			}

}
