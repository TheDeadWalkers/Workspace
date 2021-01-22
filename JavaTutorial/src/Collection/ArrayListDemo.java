package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	
	public static void main(String[] args) {
		
		List<String> l1= new ArrayList<String>();
		l1.add("John");
		l1.add("Sam");
		l1.add("Harry");
		l1.add("Martha");
		l1.add("Will");
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		Collections.shuffle(l1);
		System.out.println(l1);
		
		Iterator<String> s=l1.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
	}

}
