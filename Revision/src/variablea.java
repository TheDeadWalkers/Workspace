import java.util.Arrays;
import java.util.HashSet;

public class variablea {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] al = {1,4,2,75,3,1,45,7,9,4,2,76,23,56,8,9,45};
		HashSet<Integer> hs = new HashSet<>(Arrays.asList(al));
		
				String array = Arrays.toString(al);
				System.out.println(array);
				System.out.println(hs);
				String s = "Akash Muchewad";
				System.out.println(s.indexOf("s"));
	}
}
