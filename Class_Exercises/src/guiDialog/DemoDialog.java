package guiDialog;

import javax.swing.JOptionPane;

/**
 * Demo how to use JOptionPane
 * 
 * @author SpencerR
 *
 */
public class DemoDialog {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello World"); // use dialogs sparingly, dialogs are modal.
		String name = JOptionPane.showInputDialog("What's your name?");
		System.out.println("The user's name is: " + name);
	}

}
