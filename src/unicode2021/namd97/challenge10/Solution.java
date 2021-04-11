/**
 * 
 */
package unicode2021.namd97.challenge10;

// scored 100%

/**
 * @author Duncan Nam
 *
 */
public class Solution {
    public static Boolean isPrime(int input) {
        if (input > 0) {
            boolean out = true;
            for (int i = 2; i < (input / 2.0) + 0.5; i++) {
                if (input % i == 0) {
                    out = false;
                    break;
                }
            }
            return out;
        }
        return false;
    }
}