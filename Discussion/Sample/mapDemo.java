package Sample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1, "akash");
		hm.put(2, "ash");
		hm.put(3, "jaggu");
		hm.put(4, "xyz");
		
		//System.out.println(hm);
		
		//System.out.println(hm.get(3));
		
		Set<Map.Entry<Integer,String>> s= hm.entrySet();
		
		HashSet<String> hss = new HashSet<>();
		  
		Iterator<Map.Entry<Integer,String>> it =s.iterator();
		  
		  while(it.hasNext()) { 
			  
		Map.Entry<Integer, String> es = it.next();
		
		hss.add(es.getValue());
			
		
			  }
		  
		  System.out.println(hss);
		 
		

	}

}
