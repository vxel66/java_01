package ����;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ���� {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<����ǥ> arrayList = new ArrayList<>();
		
		
		while (true) {
			
			try {
			System.out.println("1.����ǥ 2.�����Է�");
			int ch = scanner.nextInt();
			if(ch==1) {
				
				for(����ǥ temp : arrayList) {
					temp.set����(1);
					for(����ǥ temp2 : arrayList) {
						if(temp.get����()<temp2.get����()) {
							temp.set����(temp.get����()+1);
						}
					}
				}			
				
			Collections.sort(arrayList);
			
			System.out.println("����ǥ");
			System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
			for(����ǥ temp : arrayList) {
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",temp.get�̸�(),temp.get����(),temp.get����(),temp.get����(),temp.get����(),
						temp.get���(),temp.get����());
			}
			
			
			
				
			}
			if(ch==2) {
				System.out.println("�̸� : "); String �̸� = scanner.next();
				System.out.println("���� : "); int ���� = scanner.nextInt();
				System.out.println("���� : "); int ���� = scanner.nextInt();
				System.out.println("���� : "); int ���� = scanner.nextInt();
				
				int ���� = (����+����+����) ;
				double ��� =(double)(����+����+����)/3;
				
				����ǥ �������� = new ����ǥ(�̸�, ����, ����, ����, ����, ���, 1);
				
				arrayList.add(��������);
				
				
			}
			}catch (Exception e) {
				System.out.println("�߸��� �Է��Դϴ�");
				scanner= new Scanner(System.in);
			}
		}
		
		
	}
	
	
}
