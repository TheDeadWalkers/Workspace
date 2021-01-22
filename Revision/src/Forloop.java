
public class Forloop {

	public static void main(String[] args) {
		//for(int k=0;k<=3;k++) {
		int m=1;
		for(int i=5;i>=1;i--) {
			
			
			for(int j=1;j<=i-1;j++) {
				
				System.out.print(" ");
			//System.out.print("\t");
			//	System.out.print("*");
				
			}
			for(int k=1;k<=m;k++)
			{
				System.out.print(" *");	
			}
			System.out.println("");
			m++;
			
			
		}
		
	}

}
