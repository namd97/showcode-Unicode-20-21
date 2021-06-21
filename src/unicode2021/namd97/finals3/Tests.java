/**
 * 
 */
package unicode2021.namd97.finals3;

import org.junit.*;
import static org.junit.Assert.*;

public class Tests
{
    
    @Test
    public void test0() {
        Solution solution = new Solution();

        assertEquals(true, solution.killSwitch(new int[] { -1, 0, 1 }));
        assertEquals(false, solution.killSwitch(new int[] { -1, 1 }));
        assertEquals(true, solution.killSwitch(new int[] { -1, 2, -2, 1 })); // fails
    }
    
    @Test
    public void test1()
    {
        Solution solution = new Solution();

        assertEquals(true, solution.killSwitch(new int[] { 1, 3, 3, 4, 5 }));
        // 16, sum 8
        // 1, 3, 4 and 3, 5
    }

    @Test
    public void test2()
    {
        Solution solution = new Solution();

        assertEquals(false, solution.killSwitch(new int[] { 2, 4, 5, 6 }));
    }
}