package constructors;

public class ConstructorDemo {
	
	int rollno;
	String name;
	String addr;
	String clg="MIT";
	
	public ConstructorDemo() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		
		ConstructorDemo c=new ConstructorDemo();
		c.rollno=1;
		System.out.println(c.rollno);
	}

}
