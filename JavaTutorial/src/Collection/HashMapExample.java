package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "akash");
		hm.put(2, "Reddy");
		hm.put(3, "akash");
		hm.put(4, "Welcome");
		
		System.out.println(hm);
		
		Set<Entry<Integer, String>> s =hm.entrySet();
		
		
		Iterator<Entry<Integer, String>> itr =  s.iterator();
		while(itr.hasNext()) {
			
			Map.Entry me = itr.next();
		System.out.println(me.getKey());
		System.out.println(me.getValue());
			//System.out.println(itr.next());
		}
		
		
	}

}
