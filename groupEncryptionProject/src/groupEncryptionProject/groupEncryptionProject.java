package groupEncryptionProject;

import java.util.Scanner;

public class groupEncryptionProject {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String message;
		String choice = "y";
		String result;

		System.out.println("Hello, Welcome to the Encryption App.");

		while (choice.equalsIgnoreCase("y")) {
			choice = Validator.getStringChoice(s, "Enter \"e\" for encryption or \"d\" for decryption", "e", "d");
			switch (choice) {
			case "e":
				message = Validator.getString(s, "Please enter a message to be encrypted.");
				result = Encryption.encrypt(message);
				System.out.println(result);
				break;
			case "d":
				message = Validator.getString(s, "Please paste an encrypted message.");
				result = Decryption.decrypt(message);
				System.out.println("Your message was " + result);
				break;
			default:
				System.out.println("An unexpected error has occured");
			}
			choice = Validator.getStringChoice(s, "Would you like to continue? Enter \"y\" or \"n\"", "y", "n");
		}

	}
}