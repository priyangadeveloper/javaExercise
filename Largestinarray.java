package Sample.com;

import java.util.*;

public class Largestinarray {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to Store in array:");
	
	int a= sc.nextInt();
	int number[]=new int[a];
	
		System.out.println("Enter the elements:");
		for(int i=0;i<number.length;i++) {
		number[i]=sc.nextInt();
		}
		 int max=number[0];
		 
		 for(int i=0;i<number.length;i++) {
			 if(number[i]>max) {
				 max=number[i];
				 
			 }
		 }
		System.out.println("Biggest number is:"+ max);
		
	}

}
