import java.util.Arrays;
import java.util.Scanner;

public class Trial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to add in array?");
		int[] a = new int[sc.nextInt()];
		int total=0;
		int avg;
		
		System.out.println("Enter "+a.length+" elements");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		for(int j=0;j<a.length;j++) {
			total=total+a[j];
		}
		System.out.println(total);
		avg=total/a.length;
		System.out.println(avg);
	}
}
