package Sample.com;

import java.util.Scanner;

public class MatrixMultiplication {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

System.out.println("Enter the no of rows on the Matrix A:");
int row= sc.nextInt();

System.out.println("Enter the no of columns on the Matrix A:");
int col =sc.nextInt();

System.out.println("Enter the no of rows on the Matrix B:");
int row1=sc.nextInt();

System.out.println("Enter the no of Columns on the Matrix B:");
int col1=sc.nextInt();
//if(row==col1 ) {
	
	int a[][]=new int[row][col];
	int b[][]=new int[row1][col1];
	
	System.out.println("Enter the Matrix A Values:");
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			a[i][j]=sc.nextInt();
			
		}
	}
	
	System.out.println("Enter the Matrix B values:");
	for(int i=0;i<b.length;i++) {
		for(int j=0;j<b[i].length;j++) {
			b[i][j]=sc.nextInt();
			
			
		}
		
	}
	
	int c[][]=new int[a.length][b[0].length];
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<b[0].length;j++) {
			for(int k=0;k<a[0].length;k++) {
			
			c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
			}
		}
	}
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<b[0].length;j++) {
			System.out.print(c[i][j]+" ");
		}System.out.println();
	}
	
	
	
	
//}else {
//System.out.println("No of columns in Matrix 1 and No of rows in Matrix 2 should be same");	
//}


}
}
