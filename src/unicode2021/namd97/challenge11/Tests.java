/**
 * 
 */
package unicode2021.namd97.challenge11;

import org.junit.*;
import static org.junit.Assert.*;

public class Tests
{
    
    @Test
    public void test1()
    {
        Solution solution = new Solution();

        assertEquals(6, solution.getCheckDigit("0-19-852663-x"));
    }
}