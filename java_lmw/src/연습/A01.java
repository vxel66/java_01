package ����;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;




public class A01 {

	 public static void main(String[] args) {
		ArrayList<A02> list = new ArrayList<>();
		
		list.add(new A02(5));
		list.add(new A02(3));
		list.add(new A02(1));
		list.add(new A02(2));
		list.add(new A02(4));
		
		for(A02 temp : list) {
			for(A02 temp2 : list) {
				
				if(temp.get����() > temp2.get����()) {
					Collections.swap(list, list.indexOf(temp), list.indexOf(temp));
				}
			}
		}
		
		for(A02 temp : list) {
			System.out.println(temp.get����());
		}
	}
	
	
}
