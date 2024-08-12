package Sample.com;

import java.util.ArrayList;

public class Array_list {
	
	public static void main(String args[]) {
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Biryani");
		food.add("Egg");
		food.add("Noodles");
		food.add("Porata");
		food.add("chicken 65");
		
		food.set(0,"mutton chukka");
		food.remove(1);
		//food.clear();
		
		for(int i=0;i<food.size();i++) {
			System.out.println(food.get(i));
			
		}
		
		
		for(String i:food) {
			System.out.println(i);
		}
		
	}

}
