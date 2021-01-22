package interfaceDemo;

public interface Car2 {
	
	void type();
	
	default void engine() {
		System.out.println("5hp");
		
	}

}
