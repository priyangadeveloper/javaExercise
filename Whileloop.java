package Sample.com;

import java.util.Scanner;

public class Whileloop {

	public static void main(String args[]) {
		
		String name = "";
		Scanner sc =new Scanner(System.in);
		
//		while(name.isBlank()) {
//		System.out.println("Enter your Name:");
//		name=sc.nextLine();
//		}
//		System.out.println("Hello "+name);
	
		do {
			System.out.println("Enter your Name:");
			name=sc.nextLine();
			}while(name.isBlank());
			System.out.println("Hello "+name);
	}
	
}
