package Collection;

import java.util.ArrayList;
import java.util.List;

public class removeAllandretainAll {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(4);
		al.add(3);
		al.add(5);
		al.add(7);

		List<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(7);

		/*System.out.println(al);
		System.out.println(a);
		al.removeAll(a); 	// removes matching elements from al present in a
		System.out.println(al);*/

		System.out.println(al);
		System.out.println(a);
		al.retainAll(a);	//keeps only matching element in both list
		System.out.println(al);

	}

}
