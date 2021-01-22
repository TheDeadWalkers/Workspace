package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		
	List<String> l = new ArrayList<>();
	l.add("Akash");
	l.add("Babu");
	l.add("Muchewad");
	
	
	System.out.println(l);
	
	for (String string : l) {
		
		if(string.equals("Babu")) {
			System.out.println("Found");
		}else {
			System.out.println("Not found");
		}
	}
	
	List<Integer> i = new LinkedList<>();
	i.add(1);
	i.add(3);
	i.add(2);
	i.add(6);
	i.add(5);
	i.add(9);
	i.add(8);
	
	System.out.println(i);
	
	
	}

}
