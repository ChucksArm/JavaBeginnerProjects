import javax.swing.JOptionPane;

public class ShowDialogBoxInterger {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String number = JOptionPane.showInputDialog("What is your age in 10 years?", 2);
		int futureNumber = 10;
		System.out.println("You will be," + futureNumber + " in 10 years!");
		System.exit(0);
	}

}
