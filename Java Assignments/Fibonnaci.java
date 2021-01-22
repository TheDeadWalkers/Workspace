import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int t1 = 0, t2 = 1;

		System.out.print("First " + n + " terms: ");

		for (int i = 1; i <= n; i++) {
			System.out.print(t1 + " ");

			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}
}
