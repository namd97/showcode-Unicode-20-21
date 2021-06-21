/**
 * 
 */
package unicode2021.namd97.finals2;

// scored 60%

/**
 * @author Duncan Nam
 *
 */
public class Solution {
	public static Boolean isLaunchCodeFibonacci(int input) {
		boolean out = false;

		int a = 0;
		int b = 1;
		if (input >= 0) {
			// this needed to be while (a <= input), to cover the 0 case.
			while (b <= input) {
				if (input == a || input == b) {
					out = true;
					break;
				} else {
					b = a + b;
					a = b - a;
				}
			}
		}

		return out;
	}
}