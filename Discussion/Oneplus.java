
public class Oneplus implements Mobile {

	int x;
	
	public static void main(String[] args) {
		Oneplus o = new Oneplus();
		o.display();
		o.sim();
		o.touch();
		Mobile.keypad();
		o.xyz();
		
		System.out.println(Mobile.i);
		
		System.out.println(o.x);

	}

	@Override
	public void display() {
		System.out.println("5 inch");
		
	}

	@Override
	public void sim() {
		System.out.println("idea");
		
	}
	
	public void touch() {
		System.out.println("capacitive");
	}

	
	
		

}
