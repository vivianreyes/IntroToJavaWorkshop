import javax.swing.JOptionPane;
import java.applet.AudioClip;

import javax.swing.JApplet;




public class DontForgetTheLyrics {
	public static void main(String[] args) {
		int points = 0;
		JOptionPane.showMessageDialog(null,"We are going to play a game. You will hear a song. Then you will try to guess the next line.");
		playSound("Taylor Swift - Shake It Off.wav");
		String answer = JOptionPane.showInputDialog("Now guess the next line!");
		if (answer.equals("but I keep cruising cant stop wont stop moving")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			points += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Nice Try!");	}
		playSound("sorry2.wav");
		String answer1 = JOptionPane.showInputDialog("Now guess the next line!");
		if (answer1.equals("Is it too late now to say sorry?")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			points += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Nice Try!");	}
		
		playSound("problem.wav");
		String answer2 = JOptionPane.showInputDialog("Now guess the next line!");
		if (answer2.equals("one less problem without you")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			points += 1; 
		

		JOptionPane.showMessageDialog(null, "Total Points: " + points); }
		

		
	}

	private static void playSound(String ShakeItOff) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(ShakeItOff));
		audioClip.play();

		
		// TODO Auto-generated method stub
		
	}


}