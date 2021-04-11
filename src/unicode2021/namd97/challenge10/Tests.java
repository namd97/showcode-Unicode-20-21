/**
 * 
 */
package unicode2021.namd97.challenge10;

import org.junit.*;
import static org.junit.Assert.*;

public class Tests
{
    
    @Test
    public void test1()
    {
        Solution solution = new Solution();

        assertEquals(true, solution.isPrime(3));
    }

    @Test
    public void test2()
    {
        Solution solution = new Solution();

        assertEquals(false, solution.isPrime(4));
    }    
}