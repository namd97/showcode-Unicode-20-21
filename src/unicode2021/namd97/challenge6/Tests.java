/**
 * 
 */
package unicode2021.namd97.challenge6;

import org.junit.*;
import static org.junit.Assert.*;

public class Tests {

	@Test
	public void test1() {
		Solution solution = new Solution();

		assertEquals(99, solution.getScore(new String[] { "9", "/", "7", "1", "X", "5", "1", "0", "7", "9", "0", "3",
				"6", "X", "3", "1", "9", "0" }));
	}

	@Test
	public void maximumScore() {

		Solution solution = new Solution();

		System.out.println(solution.getScore(new String[] { "X", "X", "X", "X", "X", "X", "X", "X", "X", "X" }));
		assertEquals(270, solution.getScore(new String[] { "X", "X", "X", "X", "X", "X", "X", "X", "X", "X"}));
		assertEquals(270, solution.getScore(new String[] { "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X"}));
	}
	
	public void tooManyFrames() {

		Solution solution = new Solution();
		
		assertEquals(270, solution.getScore(new String[] { "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X"}));
	}
	
	@Test
	public void checking() {
		Solution solution = new Solution();

		assertEquals(100, solution.getScore(new String[] {
				"9", "/",
				"7", "1",
				"X",
				"5", "1",
				"0", "7",
				"9", "0",
				"3", "6",
				"X",
				"3", "1",
				"4", "2", "/"}));
	}
}