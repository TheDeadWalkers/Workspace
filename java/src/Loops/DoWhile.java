package Loops;

public class DoWhile {
	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}