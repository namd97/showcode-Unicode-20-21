/**
 * 
 */
package unicode2021.namd97.finals3;

// scored 63%

/**
 * @author Duncan Nam
 *
 */
import java.util.Arrays;

public class Solution {
	public static Boolean killSwitch(int[] input) {
		// Sort the array from lowest to highest
		Arrays.sort(input);

		// calculate the sum of all elements
		int sum = sumArray(input);

		// if the sum is odd, then there is no solution
		// if there is one or fewer elements in the list, then there is no solution
		if (sum % 2 != 0 || input.length <= 1) {
			return false;
		}

		// calculate the target of each side
		int target = sum / 2;

		// create evaluation variable
		boolean out = false;

		// partition code
		if (input.length == 2) {
			if (input[0] == input[1]) {
				out = true;
			}
		} else if (input.length == 3) {
			if (input[0] == input[1] + input[2] || input[1] == input[0] + input[2] || input[2] == input[0] + input[1]) {
				out = true;
			}
		} else {
			int[] split = new int[input.length / 2];
			out = recursiveLoop(input, split, 0, input.length - 1, 0);
		}

		// return evaluation
		return out;
	}

	public static int sumArray(int[] input) {
		int sum = 0;
		for (int i : input) {
			sum += i;
		}
		return sum;
	}

	public static Boolean recursiveLoop(int[] input, int[] split, int start, int end, int index) {
		if (index == split.length - 1) {
			int splitSum = sumArray(split);
			return splitSum + splitSum == sumArray(input) / 2;
		}

		for (int i = start; i <= end; i++) {
			split[index] = input[i];
			if (recursiveLoop(input, split, i + 1, end, index + 1)) {
				return true;
			}
		}
		return false;
	}
}