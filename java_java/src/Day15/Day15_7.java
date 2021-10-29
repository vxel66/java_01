package Day15;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Day15_7 {

	
	// ����Ʈ�� : �ϳ��� ��� �������� ���� / ������ �ڽ� ��� ���� 
		// �θ� ��� �������� ���� ���� ���� ���� /ū���� ������
			//1. Ʈ����.first() : ������� ��� [���� ���� ��]
			//2. Ʈ����.last() : ���� ������ ��� [���� ���� ��]
	public static void main(String[] args) {
		
		//��ü����
		TreeSet<Integer> scores = new TreeSet<>();
		
		//����Ʈ���� ��ü �ֱ�
		scores.add(87);
		scores.add(98);
		scores.add(77);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		
		System.out.println("���� ���� ���� : "+ scores.first());
		System.out.println("���� ���� ���� : "+ scores.last());
		System.out.println("95�� �Ʒ� ���� : "+ scores.lower(95));
		System.out.println("95�� �� ����"+ scores.higher(95));
		System.out.println("95�� �̰ų� �ٷ� �Ʒ����� : "+scores.floor(93));
		System.out.println("85�� �̰ų� �ٷ� �� ����: "+scores.ceiling(85));
		
		//4.��������
		NavigableSet<Integer> decendingSet = scores.descendingSet();
		for(int score1 : decendingSet) {
			System.out.println(score1);
		}
		NavigableSet<Integer> ascIntegers = decendingSet.descendingSet();
		for(int score1 : ascIntegers) {
			System.out.println(score1);
		}
		
		
		
		while(!scores.isEmpty()) {
			scores.pollFirst();
			System.out.println("���� ��ü�� : "+ scores.size());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
