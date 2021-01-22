package sel;

public class TypeCasting {

	public static void main(String[] args) {
		
		/*
		 * Widening Casting (automatically) - converting a smaller type to a larger type
		 * size byte -> short -> char -> int -> long -> float -> double
		 */
		
		int a = 25;
		float b = a;			//widening
		System.out.println(b);
		
		
		/*
		 * Narrowing Casting (manually) - converting a larger type to a smaller size
		 * type double -> float -> long -> int -> char -> short -> byte
		 */
		
		float c = 42.34f;
		int d = (int)c;			//narrowing
		System.out.println(d);

	}

}
