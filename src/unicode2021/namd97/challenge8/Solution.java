/**
 * 
 */
package unicode2021.namd97.challenge8;

// scored 100%

/**
 * @author Duncan Nam
 *
 */
public class Solution {
    public static int parseRomanNumerals(String input) {
        int out = 0;
        input = input.toUpperCase();
        input = input.replaceAll("[^MDCLXVI]", "");
        for (int i = 0; i < input.length(); i++) {
		    if (input.length() == 1) {
		        out = getValue(input.charAt(i));
		    } else if (i < input.length() - 1) {
		        int current = getValue(input.charAt(i));
		        int next = getValue(input.charAt(i + 1));
    			if (current < next) {
    			    out -= current;
    			} else {
    			    out += current;
    			}
		    } else {
		        int current = getValue(input.charAt(i));
		        out += current;
		    }
        }
        return out;
    }
    
    private static int getValue(char in) {
        int out = 0;
        switch (in) {
            case 'M':
                out = 1000;
                break;
            case 'D':
                out = 500;
                break;
            case 'C':
                out = 100;
                break;
            case 'L':
                out = 50;
                break;
            case 'X':
                out = 10;
                break;
            case 'V':
                out = 5;
                break;
            case 'I':
                out = 1;
                break;
        }
        return out;
    }
}
