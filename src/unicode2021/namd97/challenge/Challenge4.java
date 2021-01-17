/**
 * Challenge4.java
 */
package unicode2021.namd97.challenge;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

// 100% Score

/**
 * PROMPT: We've had a database breach, and some of our data has been altered -
 * perhaps for mischievous reasons, perhaps for more practical reasons... We
 * have some data from back-ups matched with their altered values - can you use
 * this to write a function that will restore any data that was added since the
 * last back-up to it's correct state? We've populated some unit tests with the
 * data for you. Just something to be aware of - the original data is GCAT
 * sequences - only containing letters: no numbers or other characters.
 * 
 * @author Duncan Nam
 */
public class Challenge4 {
	/**
	 * These are the original 4 characters
	 */
	private static final String ORIGINAL = "gcat";
	/**
	 * These are the corresponding corrupted characters for each of the Original
	 * characters. This is functionally a Substitution Cipher.
	 */
	private static final String ALTER = "txzg";
	/**
	 * This regex consists of zero to many integers, followed by one of the altered
	 * characters
	 */
	private static final String REGEX = "[0-9]*[txzg]";

	/**
	 * This function deciphers the altered message.
	 * 
	 * @param message the corrupted message, consisting of any number of integers
	 *                and any number of the altered characters
	 * @return the original plaintext message of gcat characters
	 */
	public static String restoreData(String message) {
		// Create output StringBuffer
		StringBuffer out = new StringBuffer();

		// Cut up the input message into strings that match the regex
		List<String> allMatches = new ArrayList<String>();
		Matcher matcher = Pattern.compile(REGEX).matcher(message);
		while (matcher.find()) {
			allMatches.add(matcher.group());
		}

		/*
		 * Iterate over each of the strings that match the regex
		 */
		for (String m : allMatches) {
			/*
			 * If the string is one character, that of an altered character, then use the
			 * substitution to get the original character back.
			 */
			if (m.matches("[" + ALTER + "]")) {
				out.append(convert(m.charAt(0)));
				/*
				 * Otherwise, the character has some number and an altered character
				 */
			} else if (m.matches(REGEX)) {
				/*
				 * So first get that number, which can be an arbitrary integer, and then add
				 * that many of the character deciphered with the substitution.
				 */
				for (int i = 0; i < Integer.parseInt(m.substring(0, m.length() - 1)); i++) {
					out.append(convert(m.charAt(m.length() - 1)));
				}
			}
			/*
			 * If for some reason the input message had some characters not in the altered
			 * character list then nothing is added to correspond.
			 */
		}
		return out.toString();
	}

	/**
	 * This function will take a character in, and decipher it to the plaintext
	 * version. If the character in is not a valid altered character, then throw an
	 * IllegalArgumentException
	 * 
	 * @param in an altered character
	 * @return the corresponding plaintext
	 */
	private static Character convert(Character in) {
		Character out = ' ';
		if (ALTER.indexOf(in) != -1) {
			out = ORIGINAL.charAt(ALTER.indexOf(in));
		} else {
			throw new IllegalArgumentException("Expected character in " + ALTER + " and got: " + in);
		}
		return out;
	}
}