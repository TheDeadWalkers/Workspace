
public class OverloadingParent {

	public static void main(String[] args) {
		add();
		System.out.println(add(5, 5));
		System.out.println(add("Akash ", "Muchewad"));
		
	}
	
	static public void add() {
		System.out.println("hello");
	}
	
	private static int add(int a, int b) {
		return a+b;
	}

	static String add(String a, String b) {
		return a+b;
		
	}
}
