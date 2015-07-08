package groupEncryptionProject;

import java.util.HashMap;

public abstract class Cryption {
	protected static HashMap<Character, Character> hash = new HashMap<Character, Character>();
	protected static boolean created = false;

	protected static void createCryption() {
		fillSingleDigitASCII();
		fillDoubleDigitASCII();
		fillASCIIBetween100And122();
		fillASCIIBetween122And126();
		created = true;
	}

	private static void fillSingleDigitASCII() {
		for (int i = 1; i <= 9; i++) {
			int result = i * 10;
			hash.put((char) i, (char) (result));
		}
	}

	private static void fillDoubleDigitASCII() {
		for (int i = 10; i <= 99; i++) {
			int reverse = reverseInt(i);
			hash.put((char) i, (char) (reverse));
		}
	}

	private static void fillASCIIBetween100And122() {
		for (int i = 100; i <= 122; i++) {
			hash.put((char) i, (char) (i + 4));
		}
	}

	private static void fillASCIIBetween122And126() {
		for (int i = 123; i <= 126; i++) {
			hash.put((char) i, (char) (i - 23));
		}
	}

	public static int reverseInt(int input) {
		int reversedNum = 0;

		int inputInt = input;

		while (inputInt != 0) {
			reversedNum = reversedNum * 10 + inputInt % 10;
			inputInt = inputInt / 10;
		}
		return (int) reversedNum;
	}
}
