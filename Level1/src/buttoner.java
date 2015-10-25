package level1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class buttoner {
	JFrame frame;
	JButton b1;

	public static void main(String[] args) {
		buttoner b22 = new buttoner();
	}

	buttoner() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		JButton b1 = new JButton();
	}
}
