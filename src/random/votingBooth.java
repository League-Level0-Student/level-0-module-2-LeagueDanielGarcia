package random;

import javax.swing.JOptionPane;

public class votingBooth {
public static void main(String[] args) {
	String Age = JOptionPane.showInputDialog(null, "What is your age( in Years)");
	int years = Integer.parseInt(Age);
	if(years >=18) {
		JOptionPane.showInputDialog(null, "who should the next president be");
	}
	else {
		JOptionPane.showMessageDialog(null, "NOBODY CARES WHAT YOU THINK. HAHA LOSER! get out of here your not old enough!");
	}
}
}
