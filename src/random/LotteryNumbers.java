package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	Random gen = new Random();
	int r1 = gen.nextInt(9);
	int r2 = gen.nextInt(9);
	int r3 = gen.nextInt(9);
	int r4 = gen.nextInt(9);
	int r5 = gen.nextInt(9);
	String Answer = JOptionPane.showInputDialog(null, "What is your lottery number?");
	JOptionPane.showInputDialog(null, "lottery ticket winner"+r1+r2+r3+r4+r5);
	if(Answer.equals(r1+r2+r3+r4+r5+"")) {
		JOptionPane.showInputDialog(null, "you win");
	}
	else {
		JOptionPane.showInputDialog(null, "you lose");
	}
}
}
