/**
 * 
 */
package unicode2021.namd97.finals2;

import org.junit.*;
import static org.junit.Assert.*;

public class Tests
{
    
    @Test
    public void test1()
    {
        Solution solution = new Solution();

        assertEquals(true, solution.isLaunchCodeFibonacci(3));
    }
    
    @Test
    public void zeroTest()
    {
        Solution solution = new Solution();

        assertEquals(true, solution.isLaunchCodeFibonacci(0));
    }

    @Test
    public void test2()
    {
        Solution solution = new Solution();

        assertEquals(false, solution.isLaunchCodeFibonacci(6));
    }
}