package ����;

import java.util.Scanner;

public class ����ǥ {
	/*	������ �Է�
	 * ��ȣ , �̸� , ���� ,���� , ���� �Է�
	 * ���� ��� ���
	 * ����� �Ҽ��� ���� 2�ڸ�����
	 * ������ �̿��Ͽ� ����
	 * �Է� ������ ���Ͽ� ���ܹ߻� ��Ȳ�� ���� ó��
	*/
	static ����[] ����ǥ = new ����[100];
	static Scanner scanner = new Scanner(System.in);
		public static void main(String[] args) throws Exception {
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
			System.out.println("1.����ǥ 2.�����Է�");
			int ch = scanner.nextInt();
			
			if(ch==1) {
				����ǥ();
				
			}
			else if(ch==2) {
				�����Է�();
			}
			else if(ch==3) {
				
			}
			else System.out.println("�߸��� �Է��Դϴ�");
			}
		}
		
		static void �����Է�() {
			
			while(true) {
				System.out.println("��ȣ:");int ��ȣ = scanner.nextInt();
				
				for(int i = 0; i<����ǥ.length;i++) {
					if(����ǥ[i]!=null&&����ǥ[i].get��ȣ()==��ȣ) {
						System.out.println("�����ϴ� ��ȣ�Դϴ�");
						return;
					}
				}
				System.out.println("�̸�:");String �̸� = scanner.next();
				
				System.out.println("����:");int ���� = scanner.nextInt();
				
				System.out.println("����:");int ���� = scanner.nextInt();
				
				System.out.println("����:");int ���� = scanner.nextInt();
				
				int ���� = ����+����+����;
				
				double ��� = (����+����+����)/3;
				
				���� ���� = new ����(��ȣ, �̸�, ����, ����, ����, ����, ���, 1);
							
				for(int i = 0; i<����ǥ.length;i++) {					
					if(����ǥ[i]==null) {
						����ǥ[i]=����;
						return;
					}
				}					
			

				
			}
						
		}
		
		static void ����ǥ() {
			
			for(int i =0; i<����ǥ.length; i++) {
				if(����ǥ[i]!=null) {
					����ǥ[i].set����(1);
					for(int j = 0; j<����ǥ.length ; j++) {
						if(����ǥ[i]!=null&&����ǥ[j]!=null&&����ǥ[i].get����()<����ǥ[j].get����()) {
							����ǥ[i].set����(����ǥ[i].get����()+1);
						}
					}
				}
			}
			
									
			System.out.println("����ǥ");
			System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");		
			for(int i =0; i<����ǥ.length; i++) {			
				if(����ǥ[i]==null)break;{
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",����ǥ[i].get��ȣ(),����ǥ[i].get�̸�()
							,����ǥ[i].get����(),����ǥ[i].get����(),����ǥ[i].get����()
							,����ǥ[i].get����(),����ǥ[i].get���(),����ǥ[i].get����());
					
				}
				}
			}
			
		}
		



















