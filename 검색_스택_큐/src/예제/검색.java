package ����;

import java.util.Scanner;


public class �˻� {
	
	
	//��ü �˻� �����͸� �����մϴ�
			static class PhyscData{
				
				private String name ;	//�̸�
				private int height;		//Ű
				private double vision; 	//�÷�
				
				
				public PhyscData(String name, int height, double vision) {
					this.name = name;
					this.height = height;
					this.vision = vision;
				}


				public String getName() {
					return name;
				}


				public void setName(String name) {
					this.name = name;
				}


				public int getHeight() {
					return height;
				}


				public void setHeight(int height) {
					this.height = height;
				}


				public double getVision() {
					return vision;
				}


				public void setVision(double vision) {
					this.vision = vision;
				}
				
				// ���ڿ��� ��ȯ�ϴ� �޼ҵ� (���� Ȯ�ο�)
				public String toString() {
					return name +" "+height+" "+vision;
				}
				
				
			}
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				PhyscData[] x = { //Ű�� ���������� ���ĵǾ� �ִ�
						new PhyscData("�̳���", 162, 0.3),
						new PhyscData("ȫ�ر�", 171, 1.4),
						new PhyscData("������", 173, 0.7),
						new PhyscData("�̼���", 175, 2.4),
						new PhyscData("������", 168, 0.4),
						
						
						
				};
				while(true) {
					System.out.println("�˻��ϱ� : (1)Ű�� ���� ū��� ");
					int ch = scanner.nextInt();
					if(ch==1) {
						int z = 0;
						int y = 0;
						
						for(int i =0; i<=x.length; i++) {
							
							System.out.println(y);
							if(i==x.length-1) {
								System.out.println("Ű�� ���� ū����� " + x[z].toString());
								break;
							}
							if(y < x[i].height) {
								z=i;
								y=x[i].height;
							}
							
						}
					}else {
						continue;
					}
					
				}
				
			}

}
