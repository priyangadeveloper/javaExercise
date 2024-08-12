package Sample.com;

import java.util.Scanner;

public class Logicaloperators {
	public static void main(String args[]) {
		
		int temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temparature:");
		
		temp=sc.nextInt();
		
		if(temp<20) {
			System.out.println("It a cool day");
		}
		else if(temp >=20 && temp>=30) {
			
			System.out.println("It a warm day");
		}
		
		else {
			System.out.println("It is hot day");
		}
		sc.close();
	}
	

}
