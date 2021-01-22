
public class StringDemo {

	public static void main(String[] args) {
		strmanipulations();
		palindrome();
		strarray();
		
	}
	
	
		static void strmanipulations() {
			String s = "Java is easy language to learn programming and you can make career in java";
			System.out.println(s.substring(5, 42));
			
		}

		static void palindrome() {
			String a = "malayalam";
			String b="";
			
			for(int i=a.length()-1;i>=0;i--) {
				b=b+a.charAt(i);
			}
				System.out.println("Reverse string is "+b);
				
				if(b.equals(a))
					System.out.println("Palindrom");
				else
					System.out.println("not palindrom");
		}
	
		static void strarray() {
			String[] sa = {"Mr. Akash","Mr. Bhalchandra","Mr. sada","Miss. Lisa","Miss. Rosy"};
			System.out.println(sa.length);
			int k=0;
			int l=0;
			for(int i=0;i<sa.length;i++) {
				System.out.println(sa[i]);
				if(sa[i].startsWith("Mr.")) {
					k++;
			}else if(sa[i].startsWith("Miss")) {
					l++;
			}
			}
			System.out.println("Men count is "+k);
			System.out.println("Women count is "+l);	
		}
}
