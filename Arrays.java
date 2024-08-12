package Sample.com;

import java.util.List;

public class Arrays {

	public static void main(String args[]) {
		String[] cars = {"Tesla","BMW","Swift","Tata punch","Hundai creta","Mahendra scorpio"};
		cars[0]= "corvette";
		for(int i=0;i<cars.length;i++) {
		System.out.println(cars[i]);
		}
		int[] a= {1,2,3,4};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		char[] Letters= {'a','b','c','d'};
		for(int j=0;j<Letters.length;j++) {
		System.out.println(Letters[j]);
		}
		
		for(int b:a) {
			System.out.println(b);
		}
			}

	public static List<String> asList(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		return null;
	}
}
