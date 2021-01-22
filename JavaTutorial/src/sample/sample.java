package sample;

public interface sample {


	
	static void display() {
		System.out.println("in sample display ");
	}
	
	default void show() {
		System.out.println("In sample show");
	}
	
	
}



