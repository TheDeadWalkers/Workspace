import java.util.Scanner;

public class Prime_OneToN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit :");
		int limit = sc.nextInt();

		System.out.println("Prime numbers between 1 to " + limit);

		for (int i = 1; i <= limit; i++) {

			int count = 0;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					count++;
				}
			}

			if (count==0)
				System.out.print(i + " ");
		}
	}
}
