/**
 * 
 */
package unicode2021.namd97.challenge02;

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
	
	/**
	 * 1 Pts | Check that FFF returns 5.
	 */
	@Test
	public void hiddentest1() {
		Solution solution = new Solution();

		assertEquals(5, solution.devvie("FFF"));
	}
	
	/**
	 * 1 Pts | Check that RRR returns 0.
	 */
	@Test
	public void hiddentest2() {
		Solution solution = new Solution();

		assertEquals(0, solution.devvie("RRR"));
	}
	
	/**
	 * 3 Pts | Check that FFLFRF returns 6.
	 */
	@Test
	public void hiddentest3() {
		Solution solution = new Solution();

		assertEquals(6, solution.devvie("FFLFRF"));
	}
	
	/**
	 * 3 Pts | Check that FFFLF returns 6.
	 */
	@Test
	public void hiddentest4() {
		Solution solution = new Solution();

		assertEquals(6, solution.devvie("FFFLF"));
	}
	
	/**
	 * 3 Pts | Check that LFFRFRFFFF returns 5.
	 */
	@Test
	public void hiddentest5() {
		Solution solution = new Solution();

		assertEquals(5, solution.devvie("LFFRFRFFFF"));
	}
	
	/**
	 * 2 Pts | Check that lower case letters are ignored.
	 */
	@Test
	public void hiddentest6() {
		Solution solution = new Solution();

		assertEquals(0, solution.devvie("RRRrrrrrrrr"));
	}
	
	/**
	 * 2 Pts | Check that spaces and junk are ignored.
	 */
	@Test
	public void hiddentest7() {
		Solution solution = new Solution();

		assertEquals(0, solution.devvie("FxLx   %&£(  )LxFx"));
	}
}