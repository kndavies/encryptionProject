package groupEncryptionProject;

import java.util.Map.Entry;

public class Decryption extends Cryption {
	public static String decrypt(String s) {
		String encryption = "";
		if (!Cryption.created)
			Cryption.createCryption();
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (Entry<Character, Character> entry : hash.entrySet()) {
				if (entry.getValue() == a[i]) {
					encryption += Character.toString(entry.getKey());
					break;
				}
			}
		}
		return encryption;
	}

}
