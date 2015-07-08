package groupEncryptionProject;

//import java.util.HashMap;
import java.util.Map.Entry;

public class Encryption extends Cryption {
	public static String encrypt(String s) {
		String encryption = "";
		if (!Cryption.created)
			Cryption.createCryption();
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if ((char) a[i] < 32 || (char) a[i] >= 127)
				throw new IllegalArgumentException("Error.  An invalid character was entered");
			for (Entry<Character, Character> entry : Cryption.hash.entrySet()) {
				if (entry.getKey() == a[i]) {
					encryption += Character.toString(entry.getValue());
					break;
				}
			}
		}
		return encryption;
	}
}
