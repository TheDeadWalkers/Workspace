import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		Integer[] a = {12,4,5,8,5,0,6,2,34,12,6,33,7,9,8};
		
		HashSet<Integer> hs = new HashSet<>(Arrays.asList(a));
		System.out.println(hs);
		
		String[] s = {"Akash","Hello","Pune","Akash","Pune","Latur"};
		HashSet<String> h = new HashSet<>(Arrays.asList(s));
		System.out.println(h);
	}

}
