package StringManipulation;


public class Palindrom {

	public static void main(String[] args) {
		
		String s="redder";
		String a="";
		for(int i=s.length()-1;i>=0;i--) {
			a=a+s.charAt(i);
			
		}
		System.out.println(a);
		
		if(s.equals(a)) {
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}
	}
}
