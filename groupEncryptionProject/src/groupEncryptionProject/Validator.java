package groupEncryptionProject;

import java.util.Scanner;

public class Validator {
	public static String getString(Scanner sc, String prompt) {
		String s = "";
		String test = "";

		while (true) {
			System.out.println(prompt);
			s = sc.nextLine();
			test = s.trim();
			if (test.length() == 0)
				System.out.println("Error, this entry is required");
			else
				return s;
		}
	}
	
	public static String getStringChoice(Scanner sc, String prompt, String s1, String s2) {
		String answer;
		while (true) {
			answer = getString(sc, prompt);
			if (answer.equalsIgnoreCase(s1) || answer.equalsIgnoreCase(s2))
				return answer.toLowerCase();
			else
				System.out.println("Error:  Please enter " + s1 + " or " + s2);
		}

	}

}
