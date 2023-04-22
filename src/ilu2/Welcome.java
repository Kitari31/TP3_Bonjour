package ilu2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Welcome {
	
	public static String welcome(String input) {
		if (input == null || input.trim().isEmpty())
			return "Hello, my friend";
		if (input.equals(input.toUpperCase()))
			return "HELLO, " + input;
		String[] noms = input.split(",");
		if (noms.length == 2)
			return formatDeuxNoms(noms[0], noms[1]);
		else if (noms.length > 2)
			return formatPlusieursNoms(noms);
		return formatSimpleNom(input);
	}
	
	
	private static String formatDeuxNoms(String nom, String nom2) {
		return "Hello, " + formatNom(nom) + ", " + formatNom(nom2);
	}
	
	private static String formatSimpleNom(String nom) {
		return "Hello, " + formatNom(nom);
	}
	
	private static String formatPlusieursNoms(String[] noms) {
		String NomFormat = Arrays.stream(noms)
				.map(Welcome::formatNom)
				.collect(Collectors.joining(", "));
		
		int lastCommaIndex = NomFormat.lastIndexOf(",");
		if (lastCommaIndex != -1) {
			NomFormat = NomFormat.substring(0, lastCommaIndex) + "," + NomFormat.substring(lastCommaIndex + 1);
		}
		
		return "Hello, " + NomFormat;
	}
	
	private static String formatNom(String nom) {
		return nom.trim().substring(0, 1).toUpperCase() + nom.trim().substring(1).toLowerCase();
	}
}

