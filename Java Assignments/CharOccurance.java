public class CharOccurance {

	public static void main(String[] args) {

		String s = "Welcome to Selenium Testing";
		char c = 'e';
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i)) {
				count++;
			}
		}
		System.out.println("Occurance of char " + c + " is:" + count);
	}

}
