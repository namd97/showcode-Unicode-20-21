/**
 * 
 */
package unicode2021.namd97.challenge13;

import org.junit.*;
import static org.junit.Assert.*;

public class Tests
{
    
    @Test
    public void test1()
    {
        Solution solution = new Solution();

        assertEquals("Eht act ast no eht Aeik amt.", solution.generateChainCode("The cat sat on the Ikea mat."));
    }
}