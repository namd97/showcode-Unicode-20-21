package unicode2021.namd97.challenge7;
import org.junit.*;
import static org.junit.Assert.*;

public class Tests
{
    
    @Test
    public void test1()
    {
        Solution solution = new Solution();

        assertEquals("Hello world!", solution.cipher("Zwddg ogjdv!", 8));
    }
}
