import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int[] a = {2,5,8,11,23,4,9,65,84,1,0,45,23};
		
		System.out.println(a.length);
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		//Print elements using for loop
		/*
		 * for(int i=0;i<a.length;i++) 
		 * { 
		 * System.out.print(a[i]+", "); 
		 * }
		 */
	}

}
