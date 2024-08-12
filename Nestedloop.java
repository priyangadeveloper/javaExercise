package Sample.com;

import java.util.Scanner;

public class Nestedloop {
	public static void main(String args[]) {
		
		int rows,column;
		String symbol="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the row:");
		rows=sc.nextInt();
		
		System.out.println("Enter the column:");
		column=sc.nextInt();
		
		System.out.println("Enter the Symbol:");
		symbol=sc.next();
		
		for(int i=0; i<=rows ;i++) {
			System.out.println();
			for(int j=0;j<=column;j++) {
				System.out.print(symbol);
			}
			
			
		}
		
		
	}

}
