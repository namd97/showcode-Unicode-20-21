/**
 * 
 */
package unicode2021.namd97.finals1;

// scored 79%

/**
 * @author Duncan Nam
 *
 */
public class Solution {
    public static int finalFunction(int input) {
        // check if invalid
        if (input <= 1) {
            return 0;
        }
        if (input == 2) {
            return 1;
        }
        if (input == 3) {
            return 2;
        }
        
        // 
        int out = 0;
        for (int i = 3; i <= input; i++) {
            int tmp = input % i;
            int tmp2 = (input - tmp) / i;
            int newMax = 0;
            if (tmp == 1) {
                newMax = (int) Math.pow(i, tmp2 - 1) * (i + 1);
            } else {
                newMax = (int) Math.pow(i, tmp2) * tmp;
            }
            if(newMax > out) {
                out = newMax;
            }
        }
        
        return out;
    }
}