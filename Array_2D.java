package Sample.com;

public class Array_2D {
	
	// 2D array is an array of array

	public static void main(String args[]) {
		System.out.println("Cars List");
		String  cars [][]=new String[3][3];
		cars [0][0]= "camaro";
		cars[0][1]="corvetto";
		cars[0][2]="silverdo";
		cars[1][0]="Mutang";
		cars[1][1]="Ranger";
		cars[1][2]="F-150";
		cars[2][0]="Ferrari";
		cars[2][1]="lambo";
		cars[2][2]="Tesla";
		
		for(int i=0;i<cars.length;i++) {
			System.out.println();
			for(int j=0;j<cars[i].length;j++) {
				System.out.print(cars[i][j]+" ");
			}
			
		}
		System.out.println();
		System.out.println("NonVeg Menus");
		String NonVeg[][]= {{"Spicy chettinad chicken","Nethili Fish fry","prawn thokku"},
				{"Egg Bhurji","Lamp chops","Spicy Egg curry"},
				{"Butter Chicken","Panner Butter masala","Mutton Chukka"}
				
		};
		for(int k=0;k<NonVeg.length;k++) {
			System.out.println();
			for(int l=0;l<NonVeg[k].length;l++) {
				System.out.print(NonVeg[k][l]+",");
				
			}
		}
	}
}
