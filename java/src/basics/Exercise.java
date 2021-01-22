package basics;

public class Exercise {
	int a=10;
	public static void main(String[] args) {
		int a=20;
		System.out.println(a);
		Exercise e=new Exercise();
		e.m();
	}
	void m() {
		System.out.println(this.a);
	}
}
