package passwordsecurity;

import java.util.Random;

public class CreatPassword implements Creator {
	private String char_Caps;
	private String chars;
	private String nums;
	private String symbols;
	private String passCreator;

 public char[] passwordCreator(int choiceNumber) {
	char_Caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	chars = "abcdefghijklmnopqrstuvwxyz";
	nums = "0123456789";
	symbols = "!@#$%&*_=+-/€.?<>";
	passCreator = char_Caps + chars + nums + symbols;
	Random random = new Random();

	char[] password = new char[choiceNumber];

	for (int i = 0; i < choiceNumber; i++) {

		password[i] = passCreator.charAt(random.nextInt(passCreator.length()));
	}
	return password;
}
}
