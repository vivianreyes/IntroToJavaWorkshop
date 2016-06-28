package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot Joga =new Robot();
	

	void go() {
		// 4. Make the robot move as fast as possible
		Joga.setSpeed(100);

		// 5. Set the pen width to 5
		Joga.setPenWidth(5);

		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 4; i++) {
			drawSquare();
		}
			
		

			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	drawSquare();
	
			// 8. Turn the robot 90 degrees to the right

	
}
	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		for (int i = 0; i < 4; i++) {
			Joga.penDown();
			Joga.setRandomPenColor();
			Joga.move(100);
			Joga.turn(90);
			
		}

		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
