package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> ll = new LinkedList<String>();
		
		ll.add("Hello");
		ll.add("World");
		ll.add("Welcome");
		ll.add("to");
		ll.add("the");
		ll.add("world");
		ll.add("of");
		ll.add("testing");
		
		List<String> l2 = new LinkedList<String>();
		l2.add("Hello");
		l2.add("World");
		
		System.out.println(ll);
		ll.removeAll(l2);
		System.out.println(ll);
		
		
		System.out.println(ll.containsAll(l2));
		System.out.println(ll.toArray().length);
		
		Iterator<String> i = ll.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
