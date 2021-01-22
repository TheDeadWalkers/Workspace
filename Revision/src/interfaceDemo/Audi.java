package interfaceDemo;

import java.util.*;

public class Audi {
	
	public static void main(String[] args) {
		
		List<String> s = new LinkedList<String>();
		s.add("akash");
		s.add("john");
		System.out.println(s);
		
		Iterator<String> ss = s.iterator();
		for(String a:s) {
		if(ss.hasNext()) {
			System.out.println(a);
		}
	}
	}

}
