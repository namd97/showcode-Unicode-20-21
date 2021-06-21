/**
 * 
 */
package unicode2021.namd97.day5;

import org.junit.*;
import static org.junit.Assert.*;

public class Tests {

	@Test
	public void test1() {
		Solution solution = new Solution();

		assertArrayEquals(new String[] { "a", "1", "b", "2", "c", "3", "4" },
				solution.mergeSequence(new String[] { "a", "b", "c" }, new String[] { "1", "2", "3", "4" }));
	}
}