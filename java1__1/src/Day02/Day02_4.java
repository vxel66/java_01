package Day02;

import java.util.Scanner;

public class Day02_4 {

	public static void main(String[] args) {
		
		
		
		Scanner 입력객체 = new Scanner(System.in);
		
		//1
     /*
      * System.out.println("기본금:");
		int a0 = 입력.nextInt();
		System.out.println("수당:");
		int a1 = 입력.nextInt();
		
		int 세금 = (int)(a0 * 0.1);
		
		System.out.println("실수령액 :"+(a0+a1-세금));
	 
		//2
	    System.out.println("금액 : ");
		int 금액 = 입력객체.nextInt();
	    
	        // 1.십만원 권
	        System.out.println("십만원:"+ (금액/100000) + "장");
		          금액 = 금액 - (금액/100000) + 100000;// 십만원 단위 제거
	        // 2.만원 권
	        System.out.println("만원 : "+ (금액/ 10000) + "장");
		       금액 -= (금액/10000) * 10000;
		    // 3. 천원 권
		    System.out.println("천원 : "+ (금액/1000) + "장");
		    금액 -= (금액/1000) * 1000; 
		    // 4. 백원
		    System.out.println("백원 : "+ (금액/100) + "원");
		    
		 */   
		    
		 //3 
		/* 
		System.out.println("정수 입력 : ");
		int 정수1 = 입력객체.nextInt();
		
		System.out.println(정수1%7==0);
		   
		 //4    
		
		System.out.println(정수1%2==1);   
		
		
		//5
		
		System.out.println("7의 배수이면서 짝수인지" + (정수1%7==0 && 정수1%2==0) );
		
		
		
		
		//6
		
		System.out.println("정수를 입력하시요:");
		int a1 = 입력객체.nextInt();
		
		System.out.println("정수를 입력하시요:");
		int a2 = 입력객체.nextInt();
		
		System.out.println(a1 > a2);
		
		
		
		//7
		System.out.println("반지름을 입력하시요 : ");
		int ban = 입력객체.nextInt();
		double won = 3.14;
	    System.out.println(ban*ban*won);
		
		*/
		/*
		//8
		System.out.println("실수를 입력하시요 : ");
		double a = 입력객체.nextDouble();
		
		System.out.println("실수를 입력하시요 : ");
		double b = 입력객체.nextDouble();
		
		double 비율 = (b/a)*100;
		System.out.println(비율 + "%");
		// 소수점 단윌를 형식 변경
		System.out.printf("실수1의 실수2의 백분율 : %.2f%%", 비율);
		                      // 형식문자 : %f [실수 ]
		                      // %.숫자f [숫자 " 소수점 자리수 ]
		                      // %.2f   [ 소수점 2자리수]
		*/
		//9
		/*
		System.out.println("윗변의 길이 :"); double 윗변 = 입력객체.nextDouble();
		System.out.println("밑변의 길이 :"); double 밑변 = 입력객체.nextDouble();
		System.out.println("높이:"); double 높이 = 입력객체.nextDouble();
		
		System.out.println("넓이는" +(int)(윗변 * 밑변 * 높이)/2);
		*/
		
		//11
	/*	System.out.println("키 :");
		int 키 = 입력객체.nextInt();
		System.out.println("몸무게 :");
		int 몸무게 = 입력객체.nextInt();
		
		System.out.println("BMI : "+ 몸무게 / (키/100)*(키/100));
		
	*/
	/*	
		//10 
		System.out.println("키 :");
		int 키 = 입력객체.nextInt();
		
		System.out.println("표준체중 :" + (키-100) *0.9 );
	*/
		
		
		//12 
	/*	System.out.println("inch :");
		int inch = 입력객체.nextInt();
		
		System.out.println("cm :" + inch*2.54);
	
		//13
		System.out.println("중간고사 : "); double 중간 = 입력객체.nextDouble();
		System.out.println("기말고사 : "); double 기말 = 입력객체.nextDouble();
		System.out.println("수행평가 : "); double 수행 = 입력객체.nextDouble();
		
		System.out.printf("중간고사 : %.2f \n", (중간*0.3));
		System.out.printf("기말고사 : %.2f \n", (기말*0.3));
		System.out.printf("수행평가 : %.2f \n", (수행*0.4));
		
		중간 *= 0.3; 기말 *= 0.3; 수행 *= 0.3;
		
		System.out.println("점수" +(중간+기말+수행));
		
		//14
		//int x = 10;
		//int y = x-- + 5 + --x;
		  //1. x-- + 5 =>10+5
		  //2. x-- => 10-> 9
		  //3. --x => 9 -> 8
		  //4. 15 + 8 => 23
		//printf(" x의 값 : %d , y의값 :  %d ", x, y)
	*/	
		int x =10;
	    System.out.println(x--);
		
   
		
		
		
	}
	
}






























