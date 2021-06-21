/**
 * 
 */
package unicode2021.namd97.finals1;

import org.junit.*;
import static org.junit.Assert.*;

public class Tests
{
    
    @Test
    public void test1()
    {
        Solution solution = new Solution();

        assertEquals(18, solution.finalFunction(8));
    }
    
    @Test
    public void test2()
    {
        Solution solution = new Solution();

        assertEquals(12, solution.finalFunction(7));
        assertEquals(36, solution.finalFunction(10));
        assertEquals(54, solution.finalFunction(11));
        
        assertEquals(27, solution.finalFunction(9));
    }
}