package polymorphism;

import java.util.Scanner;

public class OverLoading {
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	void add(String a, String b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		OverLoading o=new OverLoading();
		o.add(sc.nextInt(),sc.nextInt());
		o.add(sc.next(),sc.next());
	}
}