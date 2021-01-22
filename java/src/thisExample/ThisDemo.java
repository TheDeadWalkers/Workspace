package thisExample;

public class ThisDemo {
	int rollno;
	String name;
	float salary;
	ThisDemo(int rollno,String name,float salary){
		this.rollno=rollno;
		this.name=name;
		this.salary=salary;
	}
		void display() {
			System.out.println(rollno+" "+name+" "+salary);
		}
		public static void main(String[] args) {
			ThisDemo d=new ThisDemo(1, "Akash", 124.05f);
			d.display();
		}
		
		
}