package basics;

public class TypeCasting {

	public static void main(String[] args) {
		int a=10;
		float b=12.3f; 	
		float c=a;				//Narrowing		double -> float -> long -> int -> char -> short -> byte
		int d=(int)b;			//Widening		byte -> short -> char -> int -> long -> float -> double
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
