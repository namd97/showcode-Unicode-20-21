/**
 * 
 */
package unicode2021.namd97.challenge12;

// scored 78%

/**
 * @author Duncan Nam
 *
 */
import java.util.Arrays;

public class Solution {
    public static int calculateDifference(int[] input) {
        // sort from low to high
        Arrays.sort(input);
        
        // iterate over list to assemble smallest number
        // 0 must never be the first number, but then fills in the earliest slots
        int smallest = 0;
        int zeroCount = 0;
        for (int i : input) {
            if(i == 0) {
                zeroCount++;
            }
        }
        smallest += input[zeroCount] * Math.pow(10, zeroCount);
        for(int i = zeroCount + 1; i < input.length; i++) {
            smallest *= 10;
            smallest += input[i];
        }
        
        // iterate over list to assemble largest number
        int largest = 0;
        for(int i = input.length - 1; i >= 0; i--){
            largest += input[i] * Math.pow(10, i);
        }
        
        // output is the largest minus the smallest
        return largest - smallest;
    }
}