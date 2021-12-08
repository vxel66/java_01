package �˻�;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class �ǽ�3_8 {
	//��ü �˻� ������ �迭���� ���� �˻��ϱ�
	
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
		
		// ���ڿ��� ��ȯ�ϴ� �޼ҵ� (���� Ȯ�ο�)
		public String toString() {
			return name +" "+height+" "+vision;
		}
		
		//������������ �����ϱ� ���� comparator
		public static final Comparator<PhyscData> height_order = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return(d1.height>d2.height) ? 1 : (d1.height < d2.height) ? - 1 : 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		PhyscData[] x = { //Ű�� ���������� ���ĵǾ� �ִ�
				new PhyscData("�̳���", 162, 0.3),
				new PhyscData("������", 168, 0.4),
				new PhyscData("ȫ�ر�", 171, 1.4),
				new PhyscData("������", 173, 0.7),
				new PhyscData("�̼���", 175, 2.4),
		};
		
		System.out.println("�� cm�� ����� ã�� �ֳ��� ?  : ");
		int height = scanner.nextInt();
		int idx = Arrays.binarySearch(x, 		//�迭 x����
				new PhyscData("", height, 0.0),	//Ű�� heigh�� ��Ҹ�
				PhyscData.height_order);		//heigh_order�� ���� �˻�
		
		if(idx<0) {
			System.out.println("��Ұ� �����ϴ�");
		}else {
			System.out.println("x["+idx+"]�� �ֽ��ϴ�");
			System.out.println("ã�� ������ : "+ x[idx]);
		}
	}
	
	
	
}
















