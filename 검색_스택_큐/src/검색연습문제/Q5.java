package �˻���������;

import java.util.Scanner;

public class Q5 {
	//�����˻�
	
		// ��ڼ��� n�� �迭a���� key�� ���� ��Ҹ� �����˻�
		static int binser(int[] a, int n, int key) {
			int pl= 0;  //�˻� ������ ù �ε���
			int pr= n-1; //�˻� ������ �� �ε���
			int get= 0;
			
			while(pl<=pr){
				int pc = (pl+pr)/2; //�߾� ����� �ε���
				if(a[pc]==key) {
					get=pc;
					pr = pc -1;
				}else if (a[pc]<key) {
					pl= pc +1;		//�˻� ������ ���� �������� ����
				}else {
					pr = pc - 1; 	//�˻� ������ ���� ��������
				}
			}
			if(get==0) {
				return -1;
			}else {
				return get;
			}
		}
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("��ڼ� : ");
			int num = scanner.nextInt();
			int[]x = new int[num];
			
			System.out.println("������������ �Է��ϼ���");
			
			System.out.println("x[0] : ");
			x[0] = scanner.nextInt(); //ù ��� �Է�
			
			for(int i = 1; i < num; i++) {
				do {
					System.out.println("x["+i+"] : ");
					x[i] = scanner.nextInt();
				}while(x[i] < x[i-1]); 		//�ٷ� ���� ��Һ��� ������ �ٽ� �Է�
			}
			
			System.out.println("�˻��� �� :"); //  Ű���� �Է�
			int ky = scanner.nextInt();
			
			int idx = binser(x, num, ky);
			
			if(idx==-1) {
				System.out.println("�� ���� ��Ұ� �����ϴ�");
			}else {
				System.out.println(ky+"�� x ["+idx+"]�� �ֽ��ϴ�");
			}
		}
}
