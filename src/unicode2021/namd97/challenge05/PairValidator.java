/**
 * PairValidator.java
 */
package unicode2021.namd97.challenge05;

/**
 * @author Duncan Nam
 *
 */
public class PairValidator {
	/**
	 * This string carries all capital letters A to Z
	 */
	private static final String CAPITAL_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	/**
	 * The function will check if the two input values are adjacent or not. Doing so
	 * by converting the inputs into arrays of how many of a given letter in the
	 * alphabet appear. Then iterating over these arrays and, essentially,
	 * allocating the letters in each input to each other. Then evaluating when
	 * there is no change to see if the two are adjacent.
	 * 
	 * @param input  a String consisting only of Capital Letters
	 * @param input2 a String consisting only of Capital Letters
	 * @return whether or not the two inputs are adjacent.
	 */
	public static Boolean validate(String input, String input2) {
		Boolean out = true;
		if (input.length() == input2.length()) {
			int[] inputIntArray = toIntArray(input);
			int[] input2IntArray = toIntArray(input2);
			/*
			 * A boolean array for each letter in the alphabet. This is not correct for this
			 * challenge, and will be updated in a future solution.
			 */
			boolean[] taken = new boolean[26];

			/*
			 * Iterate over the alphabet
			 */
			for (int i = 0; i < 26; i++) {
				/*
				 * Check if input had any of that letter.
				 */
				if (inputIntArray[i] > 0) {
					boolean noChange;
					do {
						noChange = true;
						/*
						 * If we're looking at the letter A, then we don't want to look at the letter
						 * behind it.
						 */
						if (i > 0) {
							/*
							 * If the letter behind appeared in input2, then decrement both and flip the
							 * boolean array taken for that position..
							 */
							if (!taken[i - 1] && input2IntArray[i - 1] > 0) {
								noChange = false;
								input2IntArray[i - 1]--;
								taken[i - 1] = true;
								inputIntArray[i]--;
							}
						}
						/*
						 * Otherwise, if the letter below appeared in input2, then decrement both and
						 * flip the boolean array taken for that position.
						 */
						if (!taken[i] && input2IntArray[i] > 0 && inputIntArray[i] > 0) {
							noChange = false;
							input2IntArray[i]--;
							taken[i] = true;
							inputIntArray[i]--;
						}
						/*
						 * If we're looking at the letter Z, then we don't want to look at the letter
						 * ahead of it.
						 */
						if (i < 25) {
							/*
							 * If the letter behind appeared in input2, then decrement both and flip the
							 * boolean array taken for that position..
							 */
							if (!taken[i + 1] && input2IntArray[i + 1] > 0 && inputIntArray[i] > 0) {
								noChange = false;
								input2IntArray[i + 1]--;
								taken[i + 1] = true;
								inputIntArray[i]--;
							}
						}
					} while (!noChange && inputIntArray[i] > 0);
				}
			}

			/*
			 * Finally, iterate over both int arrays. If any are non-zero, then the inputs
			 * are not adjacent.
			 */
			for (int i = 0; i < 26; i++) {
				if (inputIntArray[i] != 0 || input2IntArray[i] != 0) {
					out = false;
				}
			}
		} else {
			/*
			 * This is used when the inputs are different lengths.
			 */
			out = false;
		}
		return out;
	}

	/**
	 * Convert a String into an int array of length 26, the length of the English
	 * alphabet, where each element in the array is how many times the corresponding
	 * letter in the alphabet appears.
	 * 
	 * @param in A String of arbitrary length, consisting of other Capital Letters
	 * @return an int array of how many times each Capital Letter appears in the
	 *         input.
	 */
	private static int[] toIntArray(String in) {
		int[] output = new int[26];
		for (char i : in.toCharArray()) {
			int pos = CAPITAL_ALPHABET.indexOf(i);
			output[pos]++;
		}
		return output;
	}
}