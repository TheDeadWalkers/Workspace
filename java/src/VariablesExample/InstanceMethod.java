package VariablesExample;

public class InstanceMethod {

	void showAge() {				//instance method
		int age = 10;				//local variable for showAge() method
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		InstanceMethod v=new InstanceMethod();		//object created
		v.showAge();								//showAge method called through object reference

	}

}
