
public class TypeCasting {
	
	
	/*
	 * Widening Casting (automatically) - converting a smaller type to a larger type
	 * size byte -> short -> char -> int -> long -> float -> double
	 * 
	 * Narrowing Casting (manually) - converting a larger type to a smaller size
	 * type double -> float -> long -> int -> char -> short -> byte
	 */

	public static void main(String[] args) {
		int a = 10;
		float b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		char c = 'a';
		int d = c;
		System.out.println(c);
		System.out.println(d);
		
		float e = 14.124f;
		int f = (int) e;
		
		System.out.println(e);
		System.out.println(f);
		
		int g = 255;
		char h = (char) g;
		System.out.println(g);
		System.out.println(h);

	}

}
