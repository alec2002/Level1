package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class slotmachine implements ActionListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	JTextField field;
	JButton b1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	int money = 100;

	public static void main(String[] args) {
		slotmachine slot = new slotmachine();
	}

	slotmachine() {

		JFrame frame = new JFrame("lottery");

		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setSize(500, 500);
		JLabel label = new JLabel("Bet");
		JLabel label2 = new JLabel("Total:");
		field = new JTextField(5);
		field.setText("" + 0);
		JButton b1 = new JButton("Spin");
		b1.setSize(100, 100);
		JLabel label3 = new JLabel();
		JLabel label4 = new JLabel();
		JLabel label5 = new JLabel();
		panel.add(b1);
		panel.add(field);
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		frame.add(panel);
		frame.setSize(200, 250);
		b1.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Random random2 = new Random();
		Random random3 = new Random();

		int X = random.nextInt(11);
		int x2 = random2.nextInt(11);
		int x3 = random2.nextInt(11);
		int total = Integer.parseInt(field.getText());

		if (X == 7 && x2 == 7 && x3 == 7) {
			money += 100;
			JOptionPane.showMessageDialog(null, money);
		} else {
			money -= 100;
			JOptionPane.showMessageDialog(null, money);
		}
		label3.setText("" + X);
		label4.setText("" + x2);
		label5.setText("" + x3);

	}
}
