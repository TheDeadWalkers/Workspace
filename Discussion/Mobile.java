
public interface Mobile {

	public static final int i=10;
	
	void display();
	void sim();
	
	static void keypad() {
		System.out.println("qwerty");
	}
	
	default void xyz() {
		System.out.println("abcd");
	}
	
}
