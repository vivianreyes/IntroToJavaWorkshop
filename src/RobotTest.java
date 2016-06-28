import org.jointheleague.graphical.robot.Robot;

public class RobotTest {
public static void main(String[] args) {
	Robot Kovi=new Robot();
	for (int i = 0; i < 16; i++) {
		Kovi.penDown();
		Kovi.setSpeed(100);
		Kovi.move(300);
		Kovi.turn(90);


	}
}
}