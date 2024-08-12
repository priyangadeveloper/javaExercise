package Sample.com;

import java.util.ArrayList;

public class Array_2d_list {
	
	public static void main(String args[]) {
		
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> BakeryList = new ArrayList();
		
		BakeryList.add("pasta");
		BakeryList.add("Bread");
		BakeryList.add("Cake");
		
		
		
		ArrayList<String> produceList= new ArrayList<String>();
		
		produceList.add("tomato");
		produceList.add("Garlic");
		produceList.add("Ginger");
		
		
		ArrayList<String> Drinks =new ArrayList();
		Drinks.add("Lemon soda");
		Drinks.add("Coffee");
		Drinks.add("panner soda");
		
		
		groceryList.add(produceList);
		groceryList.add(BakeryList);
		groceryList.add(Drinks);
		
		System.out.println(groceryList);
		
		
//		Drinks.set(0,"Ice");
//		produceList.remove(1);
//		
//		System.out.println(BakeryList);
//		System.out.println(produceList);
//		System.out.println(Drinks.get(0));
	}

}
