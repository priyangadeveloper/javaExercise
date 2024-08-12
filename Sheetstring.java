package Sample.com;

public class Sheetstring {
	
	int rollno;
	String name,city;
	
	Sheetstring(int a,String b,String c){
		
		this.rollno=a;
		this.name =b;
		this.city=c;
		
	}
	
	public String toString() {
		return rollno+" "+name+" "+city;
	}
	
	
	public static void main(String args[]) {
		
		Sheetstring str1= new Sheetstring(1,"sri","mdu");
		Sheetstring str2 =new Sheetstring(2,"priya","mdu");
		
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
