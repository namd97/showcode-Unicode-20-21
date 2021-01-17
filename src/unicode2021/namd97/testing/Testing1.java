/**
 * 
 */
package unicode2021.namd97.testing;

import org.junit.*;
import unicode2021.namd97.challenge.Challenge1;
import static org.junit.Assert.*;

public class Testing1 {

	@Test
	public void test1() {
		Challenge1 solution = new Challenge1();

		assertEquals("Pelfgny Xrl", solution.halliday("Crystal Key"));
	}

	@Test
	public void test2() {
		Challenge1 solution = new Challenge1();

		assertEquals("Beo bs Bfhibk", solution.halliday("Orb of Osuvox"));
	}
}