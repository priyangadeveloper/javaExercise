package Sample.com;

public class Stringmethods {

	public static void main(String args[]) {
		String name="   Sri";
		
		//boolean result=name.equals("Sri");
		//boolean result = name.equals("sri");
		//boolean result =name.equalsIgnoreCase("sri");
		//int result =name.length();
		//char result =name.charAt(0);
		//boolean result = name.isBlank();
		//boolean result = name.isEmpty();
		//String result = name.concat(" Sudhiksha");
		//String result = name.toUpperCase();
		//String result=name.toLowerCase();
		//String result =name.trim();
		//int result=name.hashCode();
		String result=name.replace("S", "P");
		System.out.println(result);
		
	}
}
