package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		if (input == null || input.trim().isEmpty())
			return "Hello, my friend";
		if (input.equals(input.toUpperCase()))
			return "HELLO, " + input;
		String[] names = input.split(",");
		if (names.length == 2)
			return formatDeuxNoms(names[0], names[1]);
		return formatNomSimple(input);
	}
	
	private static String formatDeuxNoms(String name1, String name2) {
		return "Hello, " + formatNom(name1) + ", " + formatNom(name2);
	}
	
	private static String formatNomSimple(String name) {
		return "Hello, " + formatNom(name);
	}
	
	private static String formatNom(String name) {
		return name.trim().substring(0, 1).toUpperCase() + name.trim().substring(1).toLowerCase();
	}
}

