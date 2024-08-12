package Sample.com;

import java.util.Scanner;

public class MatrixSubtraction {
public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter the row for the Matrix A:");
	int row = sc.nextInt();
	
	System.out.println("Enter the column for the Matrix A:");
	int col =sc.nextInt();
	
	
	System.out.println("Enter the row for the Matrix B:");
	int row1 = sc.nextInt();
	
	System.out.println("Enter the column for the Matrix B:");
	int col1 = sc.nextInt();
	
	
	
	if(row==row1 && col ==col1) {
		
		int a[][] = new int[row][col];
		int b[][] = new int [row1][col1];
		
		System.out.println("Enter the Matrix A values");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Enter the Matrix B values");
		
		for (int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				b[i][j]=sc.nextInt();
				
			}
		}
		
		int c[][]=new int [row][col];
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j]=a[i][j]-b[i][j];
				
			}
		}
		System.out.println("The subtraction of the Matrix A & Matrix B is:");
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				
				System.out.print(c[i][j]+" ");
				
			}System.out.println();
		}
		
		
	}else {
		System.out.println("Order of matrix should be Same");
	}
	
}
}
