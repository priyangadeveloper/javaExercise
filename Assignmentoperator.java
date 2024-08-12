package Sample.com;

/*
 * Name:priyanga D
 * Date:26.06.2024
 * Used to assign values to variables.
 * = (Simple assignment), += (Add and assign), -= (Subtract and assign), *= (Multiply and assign), /= (Divide and assign), %= (Modulus and assign), &= (Bitwise AND and assign), |= (Bitwise OR and assign), ^= (Bitwise XOR and assign), <<= (Left shift and assign), >>= (Right shift and assign), >>>= (Unsigned right shift and assign)
 */

import java.util.Scanner;

public class Assignmentoperator {
	public static void main(String args[])
	{
		int a;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number A:");
		a =sc.nextInt();
		System.out.println("a+=5 is "+(a+=5));
		System.out.println("a-=5 is "+(a-=5));
		System.out.println("a*=5 is "+(a*=5));
		System.out.println("a/=5 is "+(a/=5));
		System.out.println("a%=5 is "+(a%=5));
		System.out.println("a&=5 is "+(a&=5));
		System.out.println("a|=5 is "+(a|=5));
		System.out.println("a^=5 is "+(a^=5));
		System.out.println("a>>=5 is "+(a>>=5));
		System.out.println("a<<=5 is "+(a<<=5));

		System.out.println(a);
	}

}
