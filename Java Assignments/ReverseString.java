
public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Hello world";
		String a="";
		for(int i=s.length()-1;i>=0;i--) {
		//	System.out.print(s.charAt(i));
			a=a+s.charAt(i);
		}
		System.out.println(a);
		
		
		
		int x = 124356;
		String y = Integer.toString(x);
		System.out.println(y);
	}

}
