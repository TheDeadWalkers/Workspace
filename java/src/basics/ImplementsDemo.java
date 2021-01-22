package basics;

public class ImplementsDemo implements interfaceDemo {

		public void myFirstMethod() {
			System.out.println("first method");
			
		}
		public void mySecondMethod() {
			System.out.println("second method");
		}
			public static void main(String[] args) {
				ImplementsDemo i=new ImplementsDemo();
				i.myFirstMethod();
				i.mySecondMethod();
		}
		

	}

