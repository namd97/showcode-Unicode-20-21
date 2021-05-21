/**
 * 
 */
package unicode2021.namd97.challenge12;

import org.junit.*;
import static org.junit.Assert.*;

public class Tests
{
    
    @Test
    public void test1()
    {
        Solution solution = new Solution();

        assertEquals(43965, solution.calculateDifference(new int[] { 1, 0, 3, 4, 5 }));
    }
}