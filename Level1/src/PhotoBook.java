package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PhotoBook implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton b1;
	JButton b2;
	JButton b3;
	ImagePanel X = new ImagePanel("Russet_Potato.jpg", 250, 250);

	public static void main(String[] args) {
		PhotoBook X = new PhotoBook();
	}

	public PhotoBook() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(250, 250);
		frame.setLayout(null);
		X.setBounds(0, 0, 200, 200);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setBounds(500, 500, 500, 500);
		JButton b1 = new JButton("Next");
		JButton b2 = new JButton("Prev");
		JButton b3 = new JButton("Random");
		frame.add(panel);
		frame.add(X);

		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == b1) {
			ImagePanel X = new ImagePanel("Unknown.jpeg", 250, 250);
			frame.add(X);
			X.setBounds(0, 0, 200, 200);
		}
	}
}
