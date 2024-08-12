package Sample.com;

public class Mathcalculation {
public static void main(String args[]) {
	
	//Varible declaration
	double x,y,z;
	
	//variable intialization
	x=10.5;
	y=-85.5;
	
	z=Math.max(x, y);
	System.out.println("max value is: "+z);
	
	z=Math.min(x, y);
	System.out.println("min value is: "+z);
	
	z=Math.abs(y);
	System.out.println("abs value is: "+z);
	
	z=Math.sqrt(x);
	System.out.println("Square root of: "+z);
	
	z=Math.round(x);
	System.out.println("Round value of: "+z);
	
	z=Math.ceil(x);
	System.out.println("ceil value of: "+z);
	
	z=Math.floor(x);
	System.out.println("The floor value is: "+z);
}
}
