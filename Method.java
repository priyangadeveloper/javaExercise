package Sample.com;

public class Method {

	public static void main(String args[]) {
		
		// method = a block of code that is executed whenever  it is called upon
		
		
		String name ="Sri";
		Integer age = 7;
		hello(name);
		hello();
		hello(name,age);
		System.out.println(add (7,7));
	}
	
	static void hello() {
		System.out.println("Hello");
	}
	
	static void hello(String a) {
		System.out.println("Hello "+a);
		
	}
	
	static void hello(String a,int b) {
		System.out.println("Hello "+a);
		System.out.println("Your age is : "+b);
		
	}
	
	static  int add (int x,int y) {
		 return x+y;
	}
	
}
