package Day12;

import java.util.Random;

public class Day12_2 {

	public static void main(String[] args) {
		
		//Wrapper 포장 클래스 : 기본자료형 -> 객채화
		// 문자열 -> 기본타입
			//1. Integer.parseInt("문자열");
			//2. Double.parseDouble("문자열"):
			//3. Boolean.parseBoolean("문자열");
			//* Byte.parseInt() , Short.parseInt() , Long.parseInt() , Float.parseInt()
		//기본타입 -> 문자열
			//1. String.valueOf( 기본자료형)
			//바이트배열 -> 문자열
			//2. new 생성자(바이트배열)
		int value1 = Integer.parseInt("10");   // "10" -> 10
		
		double value2 = Double.parseDouble("3.14"); // "3.14" -> 3.14
		
		boolean value3 = Boolean.parseBoolean("true"); // "true" - > true
		
		// 1. Math.abs() 절대값
		System.out.println(Math.abs(-5)); //5
		System.out.println(Math.abs(-3.14)); //3.14
		
		// 2. Math.ceil() 올림
		System.out.println(Math.ceil(5.3)); //6.0
		System.out.println(Math.ceil(-5.3)); // 5.0
		
		//3. Math.floor() 버림
		System.out.println(Math.floor(5.3)); //5
		System.out.println(Math.floor(-5.3)); // -6.0
		
		//4.Math.max() 최댓값
		System.out.println(Math.max(5, 9));//9
		System.out.println(Math.max(5.3, 2.5)); //5.3
		
		//5.Math.min() 최소값
		System.out.println(Math.min(5, 9)); //5
		System.out.println(Math.min(5.3, 2.5)); //2.5
		
		//6. double random()
		System.out.println("난수 : "+Math.random());
		
		//7. Math.rint() // 가까운 정수의 실수값
		System.out.println(Math.rint(5.3));
		System.out.println(Math.rint(-5.7));
		
		//8. Math.round() : 소수점 첫째자리 반올림
		System.out.println(Math.round(5.3));
		System.out.println(Math.round(-5.7));
			//*소수점 둘째자리 반올림 (자리수 올리고 반올림 
		double value = 12.3456;
		double rvalue =( Math.round(value*100))/100.0;
		System.out.println(rvalue);
		
	//	int num = Math.random(); //0~1
	//	int num = Math.random()*6; //0~1
		int num = (int)(Math.random()*6)+1; //0~1
		System.out.println(num);
		Random random= new Random();
		int num2 = random.nextInt(6)+1; //int가 표현할수있는 범위 만큼 난수
		
		System.out.println(num2);
		
		
	}
	
}

























