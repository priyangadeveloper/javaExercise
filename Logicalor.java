package Sample.com;

import java.util.Scanner;

public class Logicalor {
public static void main(String args[]) {
	String response ;
	
	Scanner sc= new Scanner(System.in);
	System.out.println("You are playing a Game! press q or Q to quit the game");
	response=sc.next();
	if(response.equals("q")||response.equals("Q")) {
		System.out.println("you quit the game");
	}
	else
	{
		System.out.println("you are still play the game ********");
	}
	sc.close();
}
}
