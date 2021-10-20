package Day15;

import java.util.HashSet;
import java.util.Iterator;

public class Day15_2 {

	
	public static void main(String[] args) {
		
		// HashSet
		
		// 1. set ��ü���� [set ��ü�� ���� �ڷ��� ���׸��� �ֱ�]
		HashSet<String> set = new HashSet<>();
		
		//2.set ��ü �ֱ� [�ߺ� ���x, ����x]
		set.add("java");
		set.add("jbc");
		set.add("servlet/jsp");
		set.add("java");		// �ߺ��߻� [set�� �ڵ������� �ߺ� ����]
		set.add("ibatis");
		
		//3.set ��� [��¼��� ����] �ε����� ����
		System.out.println(set);
		System.out.println(set.size());
		
			//Iterrator : set�� ��ü �ϳ��� ��ȸ �ݺ���
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			// . hasNext() : ������ü�� �����ϸ� true ������ false 
			String element = iterator.next(); //������ü ��������
			System.out.println("\t"+element);
		}
		System.out.println();
		//
		for(String temp : set) {
			System.out.println("\t"+temp);
		}
		set.remove("jbc");
		set.remove("ibatis");
		System.out.println(set);
		set.clear();
		System.out.println(set);
	}
}































