/**
 * Solution.java
 */
package unicode2021.namd97.challenge03;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

/**
 * @author Duncan Nam
 */
public class Solution {
	private static final String REGEX = "@[A-Za-z_-]+";

	public static String getRecipient(String message, int position) {
		message = " " + message;
		StringBuffer out = new StringBuffer();

		List<String> allMatches = new ArrayList<String>();
		Matcher matcher = Pattern.compile(REGEX).matcher(message);
		while (matcher.find()) {
			allMatches.add(matcher.group());
		}

		if (position - 1 < 0 || position - 1 >= allMatches.size()) {
			out.append("");
		} else {
			out.append(allMatches.get(position - 1).substring(1));
		}

		return out.toString();
	}
}
