package Sample.com;

import java.util.*;

public class MatrixAddition {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of rows for Matrix A");
		int row =sc.nextInt();
		
		System.out.println("Enter the no of columns for Matrix A");
		int col = sc.nextInt();
		
		int a[][]=new int[row][col];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the no of rows for matrix B");
		int row1 = sc.nextInt();
		
		System.out.println("Enter the no of columns for the matrix B");
		int col1 = sc.nextInt();
		
		int b[][]=new int[row1][col1];
		
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++) {
				
				b[i][j]=sc.nextInt();
				
			}
		}
		
		
		System.out.println("The A Matrix value is:");
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	System.out.println("The B matrix value is:");
	
	for(int i=0;i<b.length;i++) {
		for(int j=0;j<b[i].length;j++){
			
			System.out.print(b[i][j]+" ");
		
		}System.out.println();
	}
	
	int c[][]=new int [row][col];
	
	if(row==row1 && col==col1) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				c[i][j]=a[i][j]+b[i][j];
				
			}
		}
		
		System.out.println("The Addition of A & B Matrix is:");
		for(int i =0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]+" ");
			}System.out.println();
		}
	}else {
		System.out.println("This is not a proper matrix");
	}
		

	}

}
