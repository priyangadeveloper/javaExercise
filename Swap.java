package Sample.com;

public class Swap {

	public static void main(String args[]) {
		// initalization
		String x="Water";
		String y="juice";
		String temp;
		
		System.out.println("Before Swap");
        System.out.println("X:"+x);
		
		System.out.println("Y:"+y);
		
		
		// assignment
		temp =x;
		x=y;
		y=temp;
		
		// print the statement
		
		System.out.println("After Swap");
		System.out.println("X:"+x);
		
		System.out.println("Y:"+y);
		
		
	}
}
