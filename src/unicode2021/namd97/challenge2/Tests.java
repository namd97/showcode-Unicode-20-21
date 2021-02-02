/**
 * 
 */
package unicode2021.namd97.challenge2;

import org.junit.*;

import static org.junit.Assert.*;

public class Tests {

	@Test
	public void test1() {
		Solution solution = new Solution();

		assertEquals(3, solution.devvie("RF"));
	}

	@Test
	public void test2() {
		Solution solution = new Solution();

		assertEquals(0, solution.devvie("FxLxLxFx"));
	}
}