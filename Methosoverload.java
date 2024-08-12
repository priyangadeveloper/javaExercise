package Sample.com;

public class Methosoverload {

	public static void main(String args[]) {
		
		int a=add(1,2);
		System.out.println(a);
		double b =add(5.5);
		System.out.println(b);
		 int c = add(10,2,2);
		 System.out.println(c);
		 
		 // printf
		int d = -1000;
		System.out.printf("%,d",d);
		System.out.println();
		System.out.printf("%+d",d);
		System.out.println();

	}
	
	static int add(int a,int b) {
		System.out.println("This is method overload #1");
		return a+b;
	}
	
	static double add(double a) {
		System.out.println("This is method overload #2");
		return a;
		
	}
	
	static int add(int a,int b,int c) {
		
		System.out.println("THis is method overload #3");
		return a+b-c;
	}
	
}
