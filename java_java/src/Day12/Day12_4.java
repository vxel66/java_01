package Day12;

import java.lang.reflect.Array;
import java.util.Random;

public class Day12_4 {
	
	//1.��� ������ �迭�� ����
	// ���ڸ���ȣ�� Ȧ�� /¦�� �и�
	//2.���� ���ڸ� ��ȣ�� Ȧ�� �迭 ����
	//3.���� ���ڸ� ��ȣ�� ¦�� �迭 ����
	
	
	public static void main(String[] args) {
       //	int num = Math.random(); //0~1
		//	int num = Math.random()*6; //0~1
		String[] carnum = new String[10];
		String[] Ȧ��= new String[10];
		String[] ¦��= new String[10];
		Random random = new Random();		
		
		for(int i = 0 ; i<carnum.length; i++) {
			if(carnum[i]==null) {
			int ������ȣ = random.nextInt(10000);
			//���� -> 4�ڸ��� ���ڿ� ��ȯ
			String strnum = String.format("%04d", ������ȣ);
			carnum[i]=strnum;            // %4d : 4�ڸ���
			 							 // %4d : ����ִ� �ڸ����� 0����
			}							
		}
		for(int i = 0 ; i<carnum.length; i++) {
			if(Integer.parseInt(carnum[i])%2==1) {
				Ȧ��[i]=carnum[i]; 
			}else {
				¦��[i]=carnum[i]; 
			}
		}
		System.out.println("---Ȧ��---");
		for(int i = 0 ; i<Ȧ��.length; i++) {
			if(Ȧ��[i]!=null) {
				System.out.println(Ȧ��[i]);
			}
		}
		System.out.println("---¦��---");
		for(int i = 0 ; i<¦��.length; i++) {
			if(¦��[i]!=null) {
				System.out.println(¦��[i]);
			}
		}
	
	
}
}