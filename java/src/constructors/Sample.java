package constructors;

public class Sample {
	
	public Sample() {
		this(10);
		System.out.println("in default constructor");
	}
	
	public Sample(int a) {
		System.out.println("in int type constructor\n" + a);
	}
	
	public Sample(float f) {
		System.out.println("in float type constructor\n" + f);
	}
	
	

	public static void main(String[] args) {
		
		new Sample();	
		new Sample(12.4f);
		System.out.println("in main method");

	}

}
