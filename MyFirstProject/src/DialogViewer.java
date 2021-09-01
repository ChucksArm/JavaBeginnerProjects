import javax.swing.JOptionPane;

public class DialogViewer {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Hello, Chuck");
		System.exit(0);
		// This program crates a pop-up dialog box that outputs the texts from the
		// second argument in the class call (null, "Hello, Chuck") prints Hello, Chuck
		// to a popup rather than the console which is cool
	}

}
