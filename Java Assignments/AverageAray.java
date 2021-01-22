
public class AverageAray {

	public static void main(String[] args) {

		int[] a = { 1, 4, 7, 34, 6, 8, 16, 24, 63 };
		int total = 0;
		int avg;

		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
		}
		System.out.println(total);
		avg = total / a.length;
		System.out.println(avg);
	}
}
