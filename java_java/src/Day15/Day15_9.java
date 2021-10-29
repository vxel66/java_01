package Day15;

import java.util.Iterator;
import java.util.TreeSet;

public class Day15_9 {

	
	public static void main(String[] args) {
		
		
		TreeSet<Person> treeset = new TreeSet<Person>();
		
		treeset.add(new Person("È«±æµ¿",45));
		treeset.add(new Person("±èÀÚ¹Ù",25));
		treeset.add(new Person("¹é½Ã¿µ",31));
		
		Iterator<Person> iterator = treeset.iterator();
		
		while(iterator.hasNext()) {
			
			Person person = iterator.next();
			
			System.out.println(person.name + "\t "+person.age);
			
			
		}
		for( Person person : treeset) {
			System.out.println(person.name + "\t "+person.age);
		}
		
		
	}
	
}
