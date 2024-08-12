package Sample.com;

public class Cheat01 {

	public static void main(String args[]) {

		// Basic String

		String name = "Susdhiksha";
		System.out.println("Name :" + name);
		String Fname = new String("Deva");
		System.out.println("Fname :" + Fname);
		String Mname = String.valueOf("priya");
		System.out.println("Mname :" + Mname);

		// String concatenation

		String a = 3 + "str" + 3; // 3str3
		System.out.println(a);
		String b = 3 + 3 + "str"; // 6str
		System.out.println(b);
		String c = "3" + 3 + "str"; // 33str
		System.out.println(c);
		String d = "3" + "3" + "23"; // 3323
		System.out.println(d);
		String e = "" + 3 + 3 + "23"; // 3323
		System.out.println(e);
		// String f = 3 + 3 + 23; // Type mismatch: cannot convert from int to String
//         System.out.println(f);

		// String Comparison

		String namecom = "Susdhiksha";
		String Fnamecom = new String("Susdhiksha");
		String Mnamecom = String.valueOf("Susdhiksha");
		System.out.println(namecom == Fnamecom);
		System.out.println(namecom.equals(Fnamecom));
		System.out.println(Fnamecom.equals(Mnamecom));
		System.out.println("AB".equalsIgnoreCase("ab"));

// String Manipulation
		
		String str = "Abcd";

	System.out.println(	str.toUpperCase());     // ABCD
	System.out.println(	str.toLowerCase());     // abcd
	System.out.println(	str.concat("#"));       // Abcd#
	System.out.println(	str.replace("c", "-")); // A-cd

	System.out.println(	"  abc ".trim());       // abc
	System.out.println(	"ab".toCharArray());    // {'a', 'b'}
	
	//String information
	
	String letter = "abcdz";

System.out.println(	letter.charAt(2));       // c
 System.out.println(	letter.indexOf("a") );    // 0
System.out.println(	letter.indexOf("z")) ;    // -1
System.out.println(	letter.length());        // 4
System.out.println(	letter.toString());      // abcd
	System.out.println(letter.substring(2));    // cd
System.out.println(	letter.substring(2,3));  // c
System.out.println(	letter.contains("c"));   // true
System.out.println(	letter.endsWith("d"));   // true
System.out.println(	letter.startsWith("a") ); // true
System.out.println(	letter.isEmpty());       // false



	}
}
