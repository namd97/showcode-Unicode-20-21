/**
 * 
 */
package unicode2021.namd97.day5;

// scored 82%

/**
 * @author Duncan Nam
 *
 */
public class Solution {
	public static String[] mergeSequence(String[] list1, String[] list2) {
		String[] out = new String[list1.length + list2.length];

		boolean pointer1 = true;
		int counter1 = 0;
		int counter2 = 0;
		for (int i = 0; i < list1.length + list2.length; i++) {
			if (pointer1) {
				out[i] = list1[counter1];
				pointer1 = !pointer1;
				if (counter2 == list2.length) {
					for (int j = 0; j < list1.length - counter1; j++) {
						out[i + j] = list1[counter1 + j];
					}
					break;
				}
				counter1++;
			} else {
				out[i] = list2[counter2];
				pointer1 = !pointer1;
				if (counter1 == list1.length) {
					for (int j = 0; j < list2.length - counter2; j++) {
						out[i + j] = list2[counter2 + j];
					}
					break;
				}
				counter2++;
			}
		}
		System.out.print("[");
		for (int i = 0; i < out.length; i++) {
			System.out.print(out[i] + ", ");
		}
		System.out.println("]");

		return out;
	}
}