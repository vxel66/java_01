package ��ü����Ʈ_����;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ����ǥ {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<����> arrayList = new ArrayList<����>();
		
		while(true) {
			System.out.println("1.��� 2.�Է�");
			int ch = scanner.nextInt();
			
			if(ch==1) {		
				for(���� temp : arrayList) {
					temp.set����(1);
					for(���� temp2 : arrayList) {
						if(temp.get����()<temp2.get����()) {
							temp.set����(temp.get����()+1);
						}
					}
				}
				// ����Ʈ ���� �޼ҵ� 
				// ��ü����Ʈ�� ����
				// Comparable�������̽� ��� �������̵�� �������� �ۼ�
				Collections.sort(arrayList);
				
				System.out.println("����ǥ");
				System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
				for(���� temp : arrayList) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",temp.get�̸�(),temp.get����(),temp.get����(),temp.get����(),temp.get����(),
							temp.get���(),temp.get����());
				}
				
			}
			if(ch==2) {
				System.out.println("�̸�:");String �̸� = scanner.next();					
				System.out.println("����:");int ���� = scanner.nextInt();					
				System.out.println("����:");int ���� = scanner.nextInt();					
				System.out.println("����:");int ���� = scanner.nextInt();
				
				int ���� = ����+����+���� ;
				int ��� = (����+����+����)/3;
				
				���� ����0 = new ����(�̸�, ����, ����, ����, ����, ���, 1);
				
				arrayList.add(����0);
				
			}
			
		}
	}
	
}
