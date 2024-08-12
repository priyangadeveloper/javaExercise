package Sample.com;

import java.util.*;

public class TwoDimentional {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int row = sc.nextInt();
		System.out.println("Enter the no of columns:");
		int col = sc.nextInt();
		
		int a[][]=new int[row][col];
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter for" + i+"," +j);
				a[i][j]=sc.nextInt();
			}
		}
		
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
	}

}
