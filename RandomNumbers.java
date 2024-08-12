package Sample.com;

import java.util.Random;

public class RandomNumbers {
	public static void main(String args[]) {
		
		double x;
		int y;
		float z;
		
		Random rand=new Random();
		
		x=rand.nextDouble(1.5);
		System.out.println(x);
		y=rand.nextInt(2);
		System.out.println(y);
		z=rand.nextFloat(5.0f);
		System.out.println(z);
		
		
	}

}
