
public class OverloadingChild extends OverloadingParent {

	
	static float add(float a, float b) {
		return a+b;
		
	}
	
	public static void main(String[] args) {
		System.out.println(add("Hello", " World"));
		
	}

}
