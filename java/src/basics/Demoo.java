package basics;

public class Demoo {
	int rollno;
	String name;
	 static String clgname="MIT";
	
	Demoo(int rollno,String name,String clgname){
		this.rollno=rollno;
		this.name=name;
		
	}
	
	void show() {
		System.out.println(rollno+" "+name+" "+" "+clgname);
	}
	
	public static void main(String[] args) {
		String s="";
		System.out.println(s);
		Demoo d=new Demoo(1, "Akash", clgname);
		d.show();
		Demoo d1=new Demoo(2, "Bhalya", "COEP");
		d1.show();
		
	}
}
