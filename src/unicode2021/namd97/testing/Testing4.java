/**
 * 
 */
package unicode2021.namd97.testing;

import org.junit.*;
import unicode2021.namd97.challenge.Challenge4;
import static org.junit.Assert.*;

public class Testing4
{
    
    @Test
    public void test1()
    {
        Challenge4 solution = new Challenge4();

        assertEquals("atgcgcatgcgca", solution.restoreData("zgtxtxzgtxtxz"));
    }

    @Test
    public void test2()
    {
    	Challenge4 solution = new Challenge4();

        assertEquals("tgctgcataaattttttttggggcatttaaa", solution.restoreData("gtxgtxzg3z8g4txz3g3z"));
    }
}