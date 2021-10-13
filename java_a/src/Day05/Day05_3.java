package Day05;

import java.util.Scanner;

public class Day05_3 {

	//p. 181 확인문제
	 	//1.
			// 힙:변수내 실제 값
			// 스택:변수이름 저장
			//3. == != 주소값 비교  [객체 내용물 비교 x]
				// .equals [객체 내용물 비교 o]
		//2.
			//1. 프로그램 종료시 메모리 초기화
			//3. 참조되지 않는 객체는 자동 소멸
			
		//3. 2 [문자열 동일해도 객체가 다를수 있기 때문에]
	
		//4. 2 [int[] array = { 1, 2, 3} ]
	
		//5. 3[ boolean 타입 배열의 초기값은 false ]
			// 정수 - 0 , 실수 - 0.0 , 논리 = false , 문자열[객체] = null
		//6. 배열명.length : 행길이
		//   배열명[행].length :해당 행의 열 길이
	
	
	public static void main(String[] args) {
		//7	
//		int max = 0; int[] array = {1,5,3,8,2};
//		
//		for(int i = 0 ; i < 5 ; i++) {
//			if(array[i] > max ) max = array[i];
//		}
//		System.out.println(max);
//	}
//	
		//8
//		int [][] array = {
//				{95,86},
//				{83,92,96},
//				{78,83,93,87,88},
//		};
//		int sum = 0 ; double avg = 0.0; 
//		int count = 0; //정수 개수
//		
//		//행반복
//		for(int i = 0 ; i<array.length; i++) {
//			//열 반복
//			for(int j = 0 ; j< array[j].length; j++) {
//				//해당 인덱스 값 가져와서 sum 누적합계
//				sum += array[i][j];
//			}
//			count += array[i].length ; //2 + 3 + 5
//		}
//		 avg = (double)sum / count; 
//		 System.out.println(count +" "+ sum);
		
		boolean run = true; //while 무한루프 제어 변수
		int studentNum = 0; //학생수 => 배열의 길이
		int[] scores = null; //학생점수 배열 [초기값은 null 공백 ]
		Scanner scanner = new Scanner(System.in); //입력객체
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println(" 선택 > ");
			
			int selectNO = scanner.nextInt();
			
			if(selectNO == 1) {
				System.out.println("학생수를 입력하시요:");
				studentNum = scanner.nextInt(); 
				scores = new int [studentNum];
			}
			else if(selectNO == 2) {
				for(int i = 0; i< studentNum ; i++) {
						System.out.println(i +"번째 학생의 점수 입력 : ");
						scores[i] = scanner.nextInt();// 입력받은 값을 i번째에 저장
						
				}
			}
			else if(selectNO == 3) {
				System.out.println("점수리스트");
				for(int i = 0 ; i< studentNum ; i++) {
					System.out.println("scores"+scores[i]);//i 번째 인덱스 값 출력
					
				}
			}
			else if(selectNO == 4) {
				int max = 0; int sum = 0 ; double avg = 0.0;

				for(int i = 0 ; i<studentNum; i++ ) {
					if(scores[i]>max) max = scores[i];
					
					sum += scores[i];
				}
				avg = (double)sum/ studentNum;
				System.out.println(sum+" "+ max);		
			}
			else{
				run= false;
			}
			
		}
		System.out.println("종료");
	}
}












































