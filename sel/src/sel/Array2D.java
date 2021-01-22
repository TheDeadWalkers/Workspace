package sel;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Input total row : ");
		int row = sc.nextInt();
		System.out.println("Input total column");
		int col=sc.nextInt();
		
		int[][] matrix=new int[row][col];
		System.out.println("lenth of matrix is "+matrix.length);
		System.out.println("enter "+(row*col)+" elements in array");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Elements in matrix ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("["+i+"] "+"["+j+"] is " + matrix[i][j]);
			}
		}
		}

}
