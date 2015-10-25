package level1;

import javax.swing.JOptionPane;

public class MethodMaker {
	public static void main(String[] args) {
		MethodMaker X = new MethodMaker();
	}

	MethodMaker() {

	}

	int plus(int r) {
		return r + 10;

	}

	String s(String ss) {
		return ss + "!";
	}

	String asker() {
		String X = JOptionPane.showInputDialog("Whats your favorites color");
		return X;
	}

	float sub(int tt, float zz) {
		return tt - zz;
	}

	int inty(int ttt, int zzzzz, int ffff) {
		return ttt + zzzzz + ffff;
	}

	void repeat() {
		for (int i = 0; i < 25; i++) {
			System.out.println("Alec");
		}

	}

	void returner(int potato, String hi) {
		if (potato > hi.length()) {
			JOptionPane.showMessageDialog(null, hi);
		} else {
			System.out.println("TO LOW");
		}

	}

	float flo(float flow, float hiii) {
		if (flow / hiii == 10) {
			return 0;
		}
		return flow / hiii;

	}
}
