package Day05;

import java.util.Scanner;

public class Day05_3 {

	//p. 181 Ȯ�ι���
	 	//1.
			// ��:������ ���� ��
			// ����:�����̸� ����
			//3. == != �ּҰ� ��  [��ü ���빰 �� x]
				// .equals [��ü ���빰 �� o]
		//2.
			//1. ���α׷� ����� �޸� �ʱ�ȭ
			//3. �������� �ʴ� ��ü�� �ڵ� �Ҹ�
			
		//3. 2 [���ڿ� �����ص� ��ü�� �ٸ��� �ֱ� ������]
	
		//4. 2 [int[] array = { 1, 2, 3} ]
	
		//5. 3[ boolean Ÿ�� �迭�� �ʱⰪ�� false ]
			// ���� - 0 , �Ǽ� - 0.0 , �� = false , ���ڿ�[��ü] = null
		//6. �迭��.length : �����
		//   �迭��[��].length :�ش� ���� �� ����
	
	
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
//		int count = 0; //���� ����
//		
//		//��ݺ�
//		for(int i = 0 ; i<array.length; i++) {
//			//�� �ݺ�
//			for(int j = 0 ; j< array[j].length; j++) {
//				//�ش� �ε��� �� �����ͼ� sum �����հ�
//				sum += array[i][j];
//			}
//			count += array[i].length ; //2 + 3 + 5
//		}
//		 avg = (double)sum / count; 
//		 System.out.println(count +" "+ sum);
		
		boolean run = true; //while ���ѷ��� ���� ����
		int studentNum = 0; //�л��� => �迭�� ����
		int[] scores = null; //�л����� �迭 [�ʱⰪ�� null ���� ]
		Scanner scanner = new Scanner(System.in); //�Է°�ü
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.println(" ���� > ");
			
			int selectNO = scanner.nextInt();
			
			if(selectNO == 1) {
				System.out.println("�л����� �Է��Ͻÿ�:");
				studentNum = scanner.nextInt(); 
				scores = new int [studentNum];
			}
			else if(selectNO == 2) {
				for(int i = 0; i< studentNum ; i++) {
						System.out.println(i +"��° �л��� ���� �Է� : ");
						scores[i] = scanner.nextInt();// �Է¹��� ���� i��°�� ����
						
				}
			}
			else if(selectNO == 3) {
				System.out.println("��������Ʈ");
				for(int i = 0 ; i< studentNum ; i++) {
					System.out.println("scores"+scores[i]);//i ��° �ε��� �� ���
					
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
		System.out.println("����");
	}
}












































