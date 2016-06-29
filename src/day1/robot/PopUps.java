package day1.robot;

import javax.swing.JOptionPane;

public class PopUps {
public static void main(String[] args) {
	System.out.print("Hello");
	int age=17;
	String name= "Vivian";
	String input=JOptionPane.showInputDialog("Enter Your Name");
	JOptionPane.showMessageDialog(null,"Hello"  +  input + ".");
	System.out.print(input);
}
	
	
}
