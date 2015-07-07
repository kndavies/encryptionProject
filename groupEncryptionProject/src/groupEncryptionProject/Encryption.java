package groupEncryptionProject;

import java.util.HashMap;
import java.util.Map.Entry;

public class Encryption {
	private static HashMap<Character, Character> hash = new HashMap<Character, Character>();

	public static String encrypt(String s) {
		String encryption = "";
		fillUpperCaseLetters();
		fillLowerCaseLetters();
		fillRemainingLowerCaseLetters();
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) 
		{
			for (Entry<Character, Character> entry : hash.entrySet()) {
			if(entry.getKey() == a[i])
				{
				encryption += Character.toString(entry.getValue());
				break;
				}
			}
		}
		return encryption;
		
	}

	public static void  fillUpperCaseLetters() 
		{
		for (int i = 32; i <= 99; i++) {
			int reverse = reverseInt(i);
			hash.put((char) i, (char) (reverse));
			}
		}
	public static void fillLowerCaseLetters(){
		for(int i= 100; i <= 122; i++)
			{
			hash.put((char)i, (char)(i+4));
			}
		}
	public static void fillRemainingLowerCaseLetters(){
		for(int i= 123; i <= 126; i++)
			{
			hash.put((char)i, (char)(i-23));
			}
		}
	
public static int reverseInt(int input)
	{
		long reversedNum = 0;
		
		long input_long = input;
		
		while (input_long != 0)
		{
			reversedNum = reversedNum * 10 + input_long % 10;
			input_long = input_long / 10;
		}
		
		if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE)
		{
			throw new IllegalArgumentException();
		}
		return (int)reversedNum;
	}
}
