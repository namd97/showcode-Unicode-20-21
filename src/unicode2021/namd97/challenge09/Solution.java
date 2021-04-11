/**
 * 
 */
package unicode2021.namd97.challenge09;

// scored 100%

/**
 * @author Duncan Nam
 *
 */
public class Solution {
	public static int calculateCapacity(int[] input) {
		int capacity = 0;

		int leftPeak = -1;
		int width = 0;

		for (int index = 0; index < input.length; index++) {
			/*
			 * If we're looking at the first element in the input, that value is the first
			 * peak.
			 */
			if (leftPeak == -1) {
				leftPeak = input[index];
			} else {
				/*
				 * If the current value in the input is less than the leftPeak then it is part
				 * of that trough, so the difference between the two is added to the capacity
				 * and the width incremented.
				 */
				if (input[index] < leftPeak) {
					capacity += leftPeak - input[index];
					width++;
				}
				/*
				 * If the current value is greater than or equal to the leftPeak, then the end
				 * of that trough has been reached. So the width is reset, and the new leftPeak
				 * is the current value.
				 */
				else if (input[index] >= leftPeak) {
					width = 0;
					leftPeak = input[index];
				}
				/*
				 * At the end of the input, it's possible that the current trough ends on a
				 * lower peak than it started (this cannot happen otherwise). In this case, the
				 * width of the trough multiplied by the difference is removed from the
				 * capacity.
				 */
				if (index == input.length - 1) {
					capacity -= width * Math.max(0, leftPeak - input[index]);
				}
			}

		}
		return capacity;
	}
}