
import static org.junit.Assert.*;
import groupEncryptionProject.Encryption;


import org.junit.Test;

public class EncryptionTest {

	@Test
	public void testIfUserInputIs1ReturnKarat() {
		assertEquals("^", Encryption.encrypt("1"));
	}
	
	@Test
	public void testIfReverseIntInputIs20Return2() {
		assertEquals(2, Encryption.reverseInt(20));
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
public void testIfUserInputTildaAndClosedBracenoReturnfg() {
	assertEquals("gf", Encryption.encrypt("~}"));	
	}
	
	
}