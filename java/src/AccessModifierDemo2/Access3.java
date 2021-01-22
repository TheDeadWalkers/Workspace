package AccessModifierDemo2;

import AccessModifierDemo1.Access1;

public class Access3 {
	public static void main(String[] args) {
		Access1 a1=new Access1();
		a1.a=110;
		a1.display();
		System.out.println(a1.a  );
	}
}
