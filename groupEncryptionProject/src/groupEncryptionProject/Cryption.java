package groupEncryptionProject;

import java.util.HashMap;

public abstract class Cryption {
	protected static HashMap<Character, Character> hash = new HashMap<Character, Character>();
	protected static boolean created = false;

	protected static void createCryption() {
		fillUpperCaseLetters();
		fillLowerCaseLetters();
		fillRemainingLowerCaseLetters();
		created = true;
	}

	private static void fillUpperCaseLetters() {
		for (int i = 32; i <= 99; i++) {
			int reverse = reverseInt(i);
			hash.put((char) i, (char) (reverse));
		}
	}

	private static void fillLowerCaseLetters() {
		for (int i = 100; i <= 122; i++) {
			hash.put((char) i, (char) (i + 4));
		}
	}

	private static void fillRemainingLowerCaseLetters() {
		for (int i = 123; i <= 126; i++) {
			hash.put((char) i, (char) (i - 23));
		}
	}

	public static int reverseInt(int input) {
		long reversedNum = 0;

		int input_long = input;

		while (input_long != 0) {
			reversedNum = reversedNum * 10 + input_long % 10;
			input_long = input_long / 10;
		}

		if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
			throw new IllegalArgumentException();
		}
		return (int) reversedNum;
	}
}
