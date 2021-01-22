package interfaceDemo;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		Integer[] a = {1,2,5,7,2,34,1,5,2,};
		
		HashSet<Integer> hs = new HashSet<>(Arrays.asList(a));
		System.out.println(hs);
		
	}

}
