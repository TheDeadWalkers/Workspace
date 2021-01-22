package thisExample;

public class ConstructorChaining {
	
	int rolln;
	String nam,cours;
	float fees;
	
	ConstructorChaining(int rollno,String name,String course) {
		rolln=rollno;
		nam=name;
		cours=course;
	}
	
	ConstructorChaining(int rollno,String name,String course,float fees) {
		this(rollno,name,course);
		this.fees=fees;
	}
	
	void display() {
		System.out.println(rolln+" "+nam+" "+cours+" "+fees);
	}
	public static void main(String[] args) {
		ConstructorChaining c1=new ConstructorChaining(1, "Akash", "Automation");
		//System.out.println(c1.rolln+" "+c1.nam+" "+c1.cours);
		ConstructorChaining c2=new ConstructorChaining(2, "sada", "Manual", 12500.50f);
		c1.display();
		c2.display();
	}
}  
