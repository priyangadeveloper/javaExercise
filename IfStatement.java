package Sample.com;

import java.util.Scanner;

public class IfStatement {

	public static void main(String args[]) {
		
		int a;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the age: ");
		a=sc.nextInt();
		if(a==75) {
			System.out.println("Ok Boomer!");
			}
		else if(a>=18) {
			System.out.println("You are an adult!");
					}
		else if(a<=13) {
			System.out.println("You are teenager");
			}
		else {
			System.out.println("You are not adult");
		}
	}
}
