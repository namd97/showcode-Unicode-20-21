/**
 * 
 */
package unicode2021.namd97.challenge8;

import org.junit.*;
import static org.junit.Assert.*;

public class Tests
{
    
    @Test
    public void test1()
    {
        Solution solution = new Solution();

        assertEquals(1961, solution.parseRomanNumerals("MCMLXI"));
    }
    
    @Test
    public void testpoop()
    {
        Solution solution = new Solution();

        assertEquals(73, solution.parseRomanNumerals("LXXIII"));
        assertEquals(9, solution.parseRomanNumerals("ix"));;
        assertEquals(2015, solution.parseRomanNumerals("mmXV"));;
        assertEquals(1961, solution.parseRomanNumerals("MCmlXI"));;
        assertEquals(4, solution.parseRomanNumerals("iv"));
    }
}

