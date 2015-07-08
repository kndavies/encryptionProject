package groupEncryptionProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecryptionTest {

	@Test
	public void shouldReturn1FromInputCarrot() {
		assertEquals("1", Decryption.decrypt("^"));
	}

	@Test
	public void shouldReturn32Frominput23() {
		assertEquals(32, Decryption.reverseInt(23));
	}

	@Test
	public void shouldReturn9FromInputK() {
		assertEquals("9", Decryption.decrypt("K"));
	}

	@Test
	public void shouldReturnBfrominputB() {
		assertEquals("B", Decryption.decrypt("B"));
	}

	@Test
	public void shouldReturnIJFromInputPercentForwardSlash() {
		assertEquals("IJ", Decryption.decrypt("%/"));
	}

	@Test
	public void shouldReturnrsFromInputno() {
		assertEquals("no", Decryption.decrypt("rs"));
	}

	@Test
	public void shouldReturnTildaOpenBraceFromInputgf() {
		assertEquals("~}", Decryption.decrypt("gf"));
	}

	@Test
	public void shouldReturnCapitalPFromInputBackSpace() {
		String s = "";
		char backspace = (char) 8;
		s = Character.toString(backspace);
		assertEquals("P", Decryption.decrypt(s));
	}

}
