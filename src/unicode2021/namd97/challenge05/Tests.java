/**
 * 
 */
package unicode2021.namd97.challenge05;

import org.junit.*;

import static org.junit.Assert.*;

public class Tests {

	@Test
	public void test1() {
		PairValidator solution = new PairValidator();

		assertEquals(true, solution.validate("CAT", "SAD"));
	}

	@Test
	public void test2() {
		PairValidator solution = new PairValidator();

		assertEquals(false, solution.validate("FAT", "SAD"));
	}
}