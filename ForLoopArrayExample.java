package Sample.com;

import java.util.List;

public class ForLoopArrayExample {
	
	public static void main(String args[]) {
		
//		int a[]= {1,2,3,4,5};
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//			
//		}
		
		List<String> fruit = Arrays.asList("apple", "banana", "cherry"); 
		
		
		for(int i=0;i<fruit.size();i++) {
			System.out.println(fruit.get(i));
			
		}
		
	}

}
