/**
 * 
 */
package unicode2021.namd97.testing;

import org.junit.*;
import unicode2021.namd97.challenge.Challenge2;
import static org.junit.Assert.*;

public class Testing2 {

	@Test
	public void test1() {
		Challenge2 solution = new Challenge2();

		assertEquals(3, solution.devvie("RF"));
	}

	@Test
	public void test2() {
		Challenge2 solution = new Challenge2();

		assertEquals(0, solution.devvie("FxLxLxFx"));
	}
}