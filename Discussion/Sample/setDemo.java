package Sample;

import java.util.HashSet;
import java.util.Set;

public class setDemo {

	public static void main(String[] args) {
		
		Set<String> al = new HashSet<>();
		
		al.add("akash");
		al.add("akash");
		al.add("ash");
		al.add("lesha");
		al.add("lesha");
		al.add("jag");
		al.add("ruti");
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(null);
		
		System.out.println(al);

	}
}