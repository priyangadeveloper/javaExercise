package Sample.com;

import java.util.Scanner;

public class Hypotenuse {
	public static void main(String args[]) {
		
		double x,y,z;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the side of x: ");
		x=sc.nextDouble();
		
		System.out.println("Enter the side of y: ");
		y=sc.nextDouble();
		
		z=Math.sqrt((x*x)+(y*y));
		
		System.out.println("The Hypotenuse is: "+z);
		
		sc.close();
		
		
	}

}
