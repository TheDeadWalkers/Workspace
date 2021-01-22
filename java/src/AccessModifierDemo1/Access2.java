package AccessModifierDemo1;
class Access2 {
	static int a = 10;
	public static void main(String[] args) {
	
		int a=20;
		System.out.println(a);
		System.out.println(Access2.a);
	
	}
}