package Sample.com;

import javax.swing.*;

public class Gui {

	public static void main(String args[]) {
		
		String name=JOptionPane.showInputDialog("Enter your Name");
		JOptionPane.showMessageDialog(null,"Hello"+ name);
		
		int age =Integer.parseInt(JOptionPane.showInputDialog("Enter the age"));
		JOptionPane.showMessageDialog(null, "your are "+age+" Years Old");
		
		double height =Double.parseDouble(JOptionPane.showInputDialog("Enter you height"));
		JOptionPane.showMessageDialog(null, "your are "+height+" CM tall");
	}
}
