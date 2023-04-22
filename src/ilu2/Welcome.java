package ilu2;

public class Welcome {

	public static String welcome(String input) {
		StringBuilder message = new StringBuilder();
		message.append("Hello, " + input.substring(0,1).toUpperCase() + input.substring(1));
		return message.toString();
	}
}
