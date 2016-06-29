package day1.robot;

import javax.swing.JOptionPane;

public class MadLibs {
	public static void main(String[] args) {
		String verb=JOptionPane.showInputDialog("Enter a past tense verb");
		String noun=JOptionPane.showInputDialog("Enter a noun");
		String adj=JOptionPane.showInputDialog("Enter an adjective");
		String verb1=JOptionPane.showInputDialog("Enter a past tense verb");
		JOptionPane.showMessageDialog(null," He "  + verb + " to the store to buy some " + noun + " because he was " + adj + " then after he went home to " + verb1 + "." );
		System.out.print(verb);
		System.out.print(noun);
		System.out.print(adj);
		System.out.print(verb1);
		
	}

}
