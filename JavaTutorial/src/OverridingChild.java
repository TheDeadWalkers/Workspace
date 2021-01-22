
public class OverridingChild extends OverridingParent{
	public void show() {
		System.out.println("From child class");		
	}
	public void display() {
		System.out.println("Child display");
	}
	
	public static void main(String[] args) {
		OverridingParent oc = new OverridingChild();
		oc.show();
		
		
		
	}
}
