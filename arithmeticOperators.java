package Sample.com;

/*
 * Name:priyanga D
 * Date:26.06.2024
 * Used to perform basic arithmetic operations.
 * + (Addition), - (Subtraction), * (Multiplication), / (Division), % (Modulus)
 */
public class arithmeticOperators {
	public static void main(String args[]) {
		//initialize the variable
		int num1=10,num2=20,num3;
		// adding num1 and num2
       int sum = num1 + num2;
        System.out.println("The sum = " + sum);
     // subtracting num1 and num2
       int sub = num1 - num2;
        System.out.println("Subtraction = " + sub);
     // Multiplying num1 and num2
      int  mult = num1 * num2;
        System.out.println("Multiplication = " + mult);
     // Dividing num1 and num2
      int  div = num1 / num2;
        System.out.println("Division = " + div);
     // Remaindering num1 and num2
     int   mod = num1 % num2;
        System.out.println("Remainder = " + mod);
	}

}
