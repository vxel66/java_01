package Day12;

import java.lang.reflect.Array;
import java.util.Random;

public class Day12_4 {
	
	//1.모든 차량을 배열에 저장
	// 끝자리번호로 홀수 /짝수 분리
	//2.차량 끝자리 번호가 홀수 배열 생성
	//3.차량 끝자리 번호가 짝수 배열 생성
	
	
	public static void main(String[] args) {
       //	int num = Math.random(); //0~1
		//	int num = Math.random()*6; //0~1
		String[] carnum = new String[10];
		String[] 홀수= new String[10];
		String[] 짝수= new String[10];
		Random random = new Random();		
		
		for(int i = 0 ; i<carnum.length; i++) {
			if(carnum[i]==null) {
			int 차량번호 = random.nextInt(10000);
			//정수 -> 4자릿수 문자열 변환
			String strnum = String.format("%04d", 차량번호);
			carnum[i]=strnum;            // %4d : 4자릿수
			 							 // %4d : 비어있는 자릿수는 0으로
			}							
		}
		for(int i = 0 ; i<carnum.length; i++) {
			if(Integer.parseInt(carnum[i])%2==1) {
				홀수[i]=carnum[i]; 
			}else {
				짝수[i]=carnum[i]; 
			}
		}
		System.out.println("---홀수---");
		for(int i = 0 ; i<홀수.length; i++) {
			if(홀수[i]!=null) {
				System.out.println(홀수[i]);
			}
		}
		System.out.println("---짝수---");
		for(int i = 0 ; i<짝수.length; i++) {
			if(짝수[i]!=null) {
				System.out.println(짝수[i]);
			}
		}
	
	
}
}