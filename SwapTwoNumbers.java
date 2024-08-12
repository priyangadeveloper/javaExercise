package Sample.com;

public class SwapTwoNumbers {

	public static void main(String args[]) {
		// variable initalization
		int a=2;
		int b=9;
		
		// print the statement
		System.out.println("Before Swap");
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		
		//assignment
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swap");
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		
		
	}
}
