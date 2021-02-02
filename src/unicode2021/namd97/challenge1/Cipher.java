/**
 * Cipher.java
 */
package unicode2021.namd97.challenge1;

/**
 * @author Duncan Nam
 */
public class Cipher {
	/**
	 * This string carries all capital letters A to Z
	 */
	private static final String CAPITALS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	/**
	 * This string carries all lowercase letters a to z
	 */
	private static final String LOWERS = "abcdefghijklmnopqrstuvwxyz";
	/**
	 * By inspection, the cipher is obvious. It was determined as 13.
	 */
	private static final int CAESAR_SHIFT = 13;

	/**
	 * The function will run a reverse Caesar cipher on the input. Only the letters
	 * have the shift applied, anything else in the input is left as is in the
	 * output.
	 * 
	 * @param message the shifted message
	 * @return the deciphered plaintext
	 */
	public static String halliday(String message) {
		StringBuffer out = new StringBuffer();
		/*
		 * Iterate over the message, and check the character
		 */
		for (Character c : message.toCharArray()) {
			/*
			 * If the character is a capital letter, then run the reverse Caesar cipher on
			 * that letter in the capital letters.
			 */
			if (CAPITALS.indexOf(c) != -1) {
				out.append(CAPITALS.charAt(modulo(CAPITALS.indexOf(c) - CAESAR_SHIFT, 26)));

			}
			/*
			 * Similarly for if the character is a lowercase letter.
			 */
			else if (LOWERS.indexOf(c) != -1) {
				out.append(LOWERS.charAt(modulo(LOWERS.indexOf(c) - CAESAR_SHIFT, 26)));

			}
			/*
			 * Otherwise, put the input character into the output.
			 */
			else {
				out.append(c);
			}
		}
		return out.toString();
	}

	/**
	 * The Java built-in function % only calculates a remainder from the inputs, and
	 * can be negative. I need the modulo between the inputs, so this function will
	 * just calculate it for me.
	 * 
	 * @param quo the quotient of the operation
	 * @param mod the modulus of the operation
	 * @return the positive remainder of the operation
	 */
	private static final int modulo(int quo, int mod) {
		int out = quo % mod;
		if (out < 0) {
			out += mod;
		}
		return out;
	}
}
