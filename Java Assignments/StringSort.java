import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {

		String[] s = { "Hello", "Pune", "Latur", "Akash", "Aditya" };
		Arrays.sort(s); // Sort array of string
		System.out.println(Arrays.toString(s));

		String x = "quick brown fox jumps over the lazy dog";
		char[] xc = x.toCharArray();
		Arrays.sort(xc); // Sort String
		System.out.println(x);
		System.out.println(xc);
	}
}
