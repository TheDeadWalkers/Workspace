
public class OnetonFibonnaci {

	public static void main(String[] args) throws InterruptedException {

		long t1 = 0, t2 = 1, sum;
		long i = 1;
		while (true) {
			System.out.println(t1 + " ");
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;
			Thread.sleep(500);
			i++;
		}
	}

}
