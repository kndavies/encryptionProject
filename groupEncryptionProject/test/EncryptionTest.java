import static org.junit.Assert.*;
import groupEncryptionProject.Cryption;
import groupEncryptionProject.Encryption;

import org.junit.Test;

public class EncryptionTest {

	@Test
	public void testIfUserInputIs1ReturnKarat() {
		assertEquals("^", Encryption.encrypt("1"));
	}

	@Test
	public void testIfReverseIntInputIs20Return2() {
		assertEquals(2, Cryption.reverseInt(20));
	}

	@Test
	public void testIfUserInputIs9ReturnK() {
		assertEquals("K", Encryption.encrypt("9"));
	}

	@Test
	public void testIfUserInputIsBReturnB() {
		assertEquals("B", Encryption.encrypt("B"));
	}

	@Test
	public void testIfUserInputIsIJReturnPercentAndForwardSlash() {
		assertEquals("%/", Encryption.encrypt("IJ"));
	}

	@Test
	public void testIfUserInputIsnoReturnrs() {
		assertEquals("rs", Encryption.encrypt("no"));
	}

	@Test
	public void testIfUserInputTildaAndClosedBracenoReturngf() {
		assertEquals("gf", Encryption.encrypt("~}"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIfUserEntersASCIILessThanOneReturnException() {
		char c = (char) 0;
		String s = Character.toString(c);
		Encryption.encrypt(s);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIfUserContainsAnASCIILessThanOneReturnException() {
		String s = "Grand ";
		char c = (char) 0;
		s += Character.toString(c);
		s += "Circus";
		Encryption.encrypt(s);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIfUserEntersASCII127AndAboveReturnException() {
		char c = (char) 127;
		String s = Character.toString(c);
		Encryption.encrypt(s);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIfUserContainsAnASCII127AndAboveReturnException() {
		String s = "Grand \n";
		char c = (char) 127;
		s += Character.toString(c);
		s += "Circus";
		Encryption.encrypt(s);
	}
}