/**
 * 
 */
package unicode2021.namd97.challenge11;

import java.util.regex.Pattern;

// scored 100%

/**
 * @author Duncan Nam
 *
 */
public class Solution {
    private static final String REGEX = "[0-9]-[0-9]{2,2}-[0-9]{6,6}-x";
    
    public static int getCheckDigit(String input) {
        int out = 0;
        if (input.matches(REGEX)) {
            int[] inputs = new int[9];
            inputs[0] = Integer.parseUnsignedInt(String.valueOf(input.charAt(0)));
            inputs[1] = Integer.parseUnsignedInt(String.valueOf(input.charAt(2)));
            inputs[2] = Integer.parseUnsignedInt(String.valueOf(input.charAt(3)));
            inputs[3] = Integer.parseUnsignedInt(String.valueOf(input.charAt(5)));
            inputs[4] = Integer.parseUnsignedInt(String.valueOf(input.charAt(6)));
            inputs[5] = Integer.parseUnsignedInt(String.valueOf(input.charAt(7)));
            inputs[6] = Integer.parseUnsignedInt(String.valueOf(input.charAt(8)));
            inputs[7] = Integer.parseUnsignedInt(String.valueOf(input.charAt(9)));
            inputs[8] = Integer.parseUnsignedInt(String.valueOf(input.charAt(10)));
            
            for(int i = 0; i < 9; i++) {
            	//System.out.println((i + 1) + " * " + inputs[i] + " = " + (i + 1) * inputs[i]);
                out += (i + 1) * inputs[i];
            }
            out %= 11;
        } else {
            out = -1;
        }
        return out;
    }
}