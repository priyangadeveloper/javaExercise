package Sample.com;

import java.util.Scanner;

public class Switches {
	
	public static void main(String args[]) {
	String day;
	
	Scanner sc =new Scanner(System.in);

	System.out.println("Enter the day ");
	day=sc.nextLine();
	
	switch(day) {
	case "sunday":System.out.println("It is a Sunday");
	break;
	case "monday":System.out.println("It is a Monday");
	break;
	case "tuesday":System.out.println("It is a Tuesday");
	break;
	case "wednesday":System.out.println("It is a Wednesday");
	break;
	case "thursday":System.out.println("It is a Thursday");
	break;
	case "friday":System.out.println("It is a Friday");
	break;
	case "saturday":System.out.println("It is a saturday");
	break;
	default:System.out.println("It is not a day");
	}
}
}
