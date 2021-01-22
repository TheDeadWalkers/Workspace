package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(3);
		
		Iterator<Integer> i = s.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
