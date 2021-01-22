package interfaceDemo;

public class ConstructorDemo {
		
	
	//no args constructor
		public ConstructorDemo() {
			System.out.println("Hello");
		}
		
		
	//parameterized constructor
		public ConstructorDemo(int a, int b) {
			int c = a+b;
			System.out.println(c);
		}
	
	public static void main(String[] args) {
		
		ConstructorDemo c = new ConstructorDemo();
		ConstructorDemo c1 = new ConstructorDemo(10,20);

	}

}
