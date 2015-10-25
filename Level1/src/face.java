import org.jointheleague.graphical.robot.Robot;


public class face {
public static void main(String[] args) {
	face X = new face();
}
face(){
	Robot robot = new Robot();
	robot.setSpeed(1000);
	robot.penDown();
	//robot.hide();
	eyes(robot);
	face(robot);
	mouth(robot);
	}

void eyes(Robot r1){
	for (int i = 0; i < 360; i++) {
		

		r1.move(1);
		r1.turn(1);
		
	}
	r1.penUp();
	r1.moveTo(500, 500);
	r1.penDown();
for (int i = 0; i < 360; i++) {
	r1.move(1);
	r1.turn(1);
}

}
void face(Robot r2){
	r2.penUp();
	
	r2.moveTo(r2.getX(), r2.getY());
	r2.penDown();
	for (int i = 0; i < 360; i++) {
		r2.move(10);
		r2.turn(1);
	}
	for (int i = 0; i < 360; i++) {
		
	}
	r2.turn(3);
	r2.move(1);
}
void mouth(Robot r3){
	r3.penUp();
	r3.moveTo(600, 800);
	r3.penDown();
	r3.turn(90);
	r3.move(500);
}
}
