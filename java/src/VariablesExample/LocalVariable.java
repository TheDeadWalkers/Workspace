package VariablesExample;

public class LocalVariable {
	
	public static void main(String[] args) {
		int a=10;				//Local variable
		final int b=20;			//when using final, can't change value for b
		a=a+5;
		//b=b+6;				//Not allowed
		System.out.println(a);
		System.out.println(b);
	
	}

}
