/**
 * 
 */
package unicode2021.namd97.challenge1;

import org.junit.*;

import static org.junit.Assert.*;

public class Tests {

	@Test
	public void test1() {
		Cipher solution = new Cipher();

		assertEquals("Pelfgny Xrl", solution.halliday("Crystal Key"));
	}

	@Test
	public void test2() {
		Cipher solution = new Cipher();

		assertEquals("Beo bs Bfhibk", solution.halliday("Orb of Osuvox"));
	}
}