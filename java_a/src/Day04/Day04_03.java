package Day04;

import java.util.Scanner;

public class Day04_03 {

	//console�� Ű����ũ [���Ǳ�
	// 1 �޴��� [ 1.�ݶ�300 2.ȯŸ200 3.���̴�100 4.����]
	   // 2 ��ٱ���
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int �ݶ���� = 10 ; int ȯŸ��� = 10; int ���̴���� = 10;
		
		int �ݶ󱸸ż� = 0; int ȯŸ���ż� = 0; int ���̴ٱ��ż� = 0;
		while(true) {
			System.out.println("-------------------- �޴� ------------------- ");
			System.out.println("1.�ݶ�[300] 2.ȯŸ[200] 3.���̴�[100] 4.����");
			System.out.print(">>>>>> ���� : "); int ch = scanner.nextInt();
	
		    if(ch == 1) {
		    	if(�ݶ���� == 0) {
		    		System.out.println("�ݶ���� �����ϴ�");
		    	}
		    	else {
		    	   System.out.println("�ݶ��ҽ��ϴ�");
		    	   �ݶ󱸸ż�++;
		    	   �ݶ����--;
		    	}
		    }
		    if(ch == 2) {
		    	if(ȯŸ��� == 0) {
		    		System.out.println("ȯŸ��� �����ϴ�");
		    	}
		    	else {
		    	   System.out.println("ȯŸ��ҽ��ϴ�");
		    	   ȯŸ���ż�++;
		    	   ȯŸ���--;
		    	}
		    }
		    if(ch == 3) {
		    	if(���̴���� == 0) {
		    		System.out.println("���̴���� �����ϴ�");
		    	}
		    	else {
		    	   System.out.println("���̴ٴ�ҽ��ϴ�");
		    	   ���̴ٱ��ż�++;
		    	   ���̴����--;
		    	}
		    }
					//System.out.println("�Ѱ�����"+((�ݶ󱸸ż�*300)+(ȯŸ���ż�*200)+(���̴ٱ��ż�*100)));
					//          ��ٱ���
					System.out.println("-------------��ٱ���---------------");
					System.out.println(" ��ǰ��\t��ǰ����\t������");
					if( �ݶ󱸸ż� > 0 ) { System.out.println(" �ݶ�\t"+�ݶ󱸸ż�+"\t"+�ݶ󱸸ż�*300); }
					if( ȯŸ���ż� > 0 ) { System.out.println(" ȯŸ\t"+ȯŸ���ż�+"\t"+ȯŸ���ż�*200); }
					if( ���̴ٱ��ż� > 0 ) { System.out.println(" ���̴�\t"+���̴ٱ��ż�+"\t"+���̴ٱ��ż�*100); }
					System.out.println(" >>>>>> �� ������ " + ( (�ݶ󱸸ż�*300) + (ȯŸ���ż�*200) + (���̴ٱ��ż�*100) ) );
					System.out.println(" --------------------------------------\n");
					
					if( ch == 4 ) { 
						if( �ݶ󱸸ż� ==0 && ȯŸ���ż� ==0 && ���̴ٱ��ż� ==0 ) { System.out.println("[�˸�] ������ ��ǰ�� �����ϴ� ");}
						else{
							System.out.print(" >>>>> ���� �Ͻðڽ��ϱ�? [y] [n] : "); String ch2 = scanner.next();
							if( ch2.equals("y") ) {
								
								while(true) {
								System.out.print(" >>>>> �ݾ� ���� : "); int money = scanner.nextInt();
								int totalpay = (�ݶ󱸸ż�*300) + (ȯŸ���ż�*200) + (���̴ٱ��ż�*100) ;
								if( money < totalpay ) { 
									System.out.println(" [�˸�] �ݾ��� �����մϴ� ");
								}
								else {
									System.out.println(" [�����Ϸ�] : �ܵ� : " + ( money - totalpay ));
									// ��ٱ��� �ʱ�ȭ 
									�ݶ󱸸ż� = 0 ; ȯŸ���ż� = 0 ; ���̴ٱ��ż� = 0 ; break;
								}
								}
								break;
							}else if( ch2.equals("n") ) {
								// ��ٱ��� �ʱ�ȭ 
								�ݶ󱸸ż� = 0 ; ȯŸ���ż� = 0 ; ���̴ٱ��ż� = 0 ;
								break;
							}else {
								System.out.println("[�˸�] :  �˼� ���� �ൿ �Դϴ� ");
								
							}
						}
					}
			
			
			
		
	
		
		
		
		
		

		
		}// while ��
	
	}
}
