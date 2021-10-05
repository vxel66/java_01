package Day01;

import java.util.Scanner;



public class Day01_5 {
	
	public static void main(String[] args) {
		
		
		
		//문제2 : 1명의 회원가입 표 만들기 
		/*
		 * 입력변수
		 * 아이디, 비밀번호, 이메일 입력받아 출력하기
		 * 
		 * 
		 * 
		*/
		
		Scanner 입력객체 = new Scanner(System.in);
		// 2.입력받은 값을 변수/객체 저장 [옮기기]
		System.out.print("아이디 : ");
        String id = 입력객체.next();
        
        System.out.print("비밀번호 : ");
        String pa = 입력객체.next();
        
        System.out.print("성명 : ");
        String na = 입력객체.next();
        
        System.out.println("이메일 : ");
        String em = 입력객체.next();
        
        // 3.출력
        System.out.println("------ 회원가입 완료 아래 정보를 확인해주세요 -------");
        System.out.println("아이디\t비밀번호\t성명\t이메일");
        System.out.println(id+"\t"+pa+"\t"+na+"\t"+em+"\t");
        
		
	}

}
