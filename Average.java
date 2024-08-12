package Sample.com;

public class Average {
public static void main(String args[]) {
	int [] number = {2,5,9,-6,12,-25,32,-6,0,35};
	int sum=0;
	double average;
	
	for(int i:number) {
		 sum += i;
		
	}
	int arraylength =number.length;
	
	average =(double)sum/(double) arraylength;
	System.out.println("The sum of Number:"+sum);
	System.out.println("The avarage of Number:"+average);
}
}
