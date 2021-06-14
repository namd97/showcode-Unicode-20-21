/**
 * 
 */
package unicode2021.namd97.day1;

import org.junit.*;
import static org.junit.Assert.*;

public class Tests
{
    
    @Test
    public void test1()
    {
        Solution solution = new Solution();

        assertArrayEquals(new String[] { "Aperture:1100", "OmniConsumer:500", "MegaCorp:100" }, solution.updateAdministratumRecord(200, "Aperture", new String[] { "MegaCorp:100", "Aperture:900", "OmniConsumer:500" }));
    }

    @Test
    public void test2()
    {
        Solution solution = new Solution();

        assertArrayEquals(new String[] { "Aperture:1000", "OmniConsumer:320", "SysmanTech:200", "MegaCorp:100" }, solution.updateAdministratumRecord(1000, "Aperture", new String[] { "MegaCorp:100", "OmniConsumer:320", "SysmanTech:200" }));
    }
}