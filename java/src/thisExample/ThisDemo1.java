package thisExample;

public class ThisDemo1 {
	void a() {
		System.out.println("Hello there, we are in 'a' method");
	}
	void b() {
		System.out.println("hello there, we are in 'b' method");
		this.a();
	}
	public static void main(String[] args) {
		ThisDemo1 d=new ThisDemo1();
		d.b();

	}

}
