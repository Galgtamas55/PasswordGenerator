package passwordsecurity;

import javax.swing.JOptionPane;

public class PanelAndGenerator {
	private String entry;

	protected int enter() {

		int choiceNumber = panel();

		return choiceNumber;

	}

	private int panel() {
		JOptionPane.showMessageDialog(null, "Welcome to the strong password creator!");
		entry = JOptionPane.showInputDialog("Enter how long the password:");
		int choiceNumber = Integer.parseInt(entry);

		smallerThanEight(choiceNumber);
		biggerThenEight(choiceNumber);

		return choiceNumber;
	}

	private void biggerThenEight(int choiceNumber) {
		if (choiceNumber > 8) {

			JOptionPane.showMessageDialog(null, "This is your strong password:" + generatorPswd());

			JOptionPane.showMessageDialog(null, "I hope it really helps to protect your data");
		}
	}

	private void smallerThanEight(int choiceNumber) {
		if (choiceNumber < 8) {
			JOptionPane.showMessageDialog(null, "This is weak password: " + generatorPswd());
			JOptionPane.showMessageDialog(null, "I hope it really helps to protect your data.");
			JOptionPane.showMessageDialog(null,
					"If you want stronger password then runs ahead again\r\n" + "this app.");
		}
	}

	private String generatorPswd() {
		CreatPassword creator = new CreatPassword();
		int choiceNumber = Integer.parseInt(entry);
		char[] password = creator.passwordCreator(choiceNumber);
		String str = new String(password);
		return str;

	}

}
