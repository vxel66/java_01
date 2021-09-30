package Day01;

import java.util.Scanner;

public class Day01_4 { //c s
	
	public static void main(String[] args) {
		Scanner 입력객체 = new Scanner(System.in);
		
		// 1.입력객체 [ 키보드로부터 입력값을 저장하는 객체 ]
		
		   // 객체선언 : 클래스명 객체명[임의] = new  생성자();
		
		//2. 입력받은 값 꺼내와서 저장상자에 저장
		    // 변수는 값을 저장할수 있는 메모리 [ 기억장치 ]
		System.out.print("첫번째 입력 : ");
        String 첫번째입력 = 입력객체.next();
		    // String :  문자열 클래스 : 문자열을 저장하는 객체 선언
        
        System.out.println("두번째 입력 : ");
        int 두번째입력 = 입력객체.nextInt();
            //int : 정수형[숫자] 자료형 : 정수를 저장하는 변수 선언
        
        System.out.println("첫번째 입력값은 : "+ 첫번째입력);
        System.out.println("두번째 입력값은 : "+ 두번째입력);
       
        
        //문제1
        // 학생 한명의 이름과 13교시의 출석 여부를 입력받아 출력
		 // 4번?째 입력 ----> 입력된 데이터 저장
         
         
    	/* ------------------------------------------
		 * 이름    1교시       2교시      3교시      비고
		 * 강호동    출석       결석       출석
		 * 유재석    출석       결석       출석 
		 *  -----------------------------------------
		 
         
		
		 
		 System.out.print("이름: ");
		 String 이름 = 입력객체.next();
		 System.out.println(" 1교시 출석 : "); String 이름1 = 입력객체.next();
		 System.out.println(" 2교시 출석 : "); String 교시_2 = 입력객체.next();
		 System.out.println(" 3교시 출석 : "); String 교시_3 = 입력객체.next();
		  System.out.println("\n\t\t[[출석부]]");String 교시_4 = 입력객체.next();
		    
		  System.out.println("-----------------------------------");
		     System.out.println("이름\t1교시\t2교시\t3교시\t비고");
		     System.out.println(name + "\t교시_1\t교시_2\t교시_3");
		     System.out.println("-----------------------------------");
		     */
		
		
	}

} // c e
 