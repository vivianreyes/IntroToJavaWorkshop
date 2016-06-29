package day1.robot;

import javax.swing.JOptionPane;

public class Names {
	public static void main(String[] args) {
		String name =JOptionPane.showInputDialog("Enter Your Name");
		String name1= "Vivian";
		if(name.equals(name1)){
			JOptionPane.showMessageDialog(null,"You have a cool name!");
			System.out.print(name);
		}
	if (!name.equals(name1)){
		JOptionPane.showMessageDialog(null,"Your name isn't as cool as Vivian!");
		System.out.print(name);
	}
	}

}
