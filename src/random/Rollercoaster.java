package random;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String Height = JOptionPane.showInputDialog(null, "What is your height");
	int height = Integer.parseInt(Height);
	if ( height > 48) {
		JOptionPane.showMessageDialog(null, "you may pass bot");
		
	}
	else {
		JOptionPane.showMessageDialog(null, "you have to grow a little more first bot");
	}
}
}
