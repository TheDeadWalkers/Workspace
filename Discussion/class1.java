
public class class1 {
	
	private static int a;
	
	private static void getter() {
		System.out.println(a);
	}
	
	public static void setter() {
		
		a=50;
		getter();
		
	}
	
	
	public static void main(String[] args) {
		setter();
		
	}

}
