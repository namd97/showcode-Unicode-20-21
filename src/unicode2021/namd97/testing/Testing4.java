/**
 * 
 */
package unicode2021.namd97.testing;

import org.junit.*;
import unicode2021.namd97.challenge.Challenge4;
import static org.junit.Assert.*;

public class Testing4 {

	@Test
	public void test1() {
		Challenge4 solution = new Challenge4();

		assertEquals("atgcgcatgcgca", solution.restoreData("zgtxtxzgtxtxz"));
	}

	@Test
	public void test2() {
		Challenge4 solution = new Challenge4();

		assertEquals("tgctgcataaattttttttggggcatttaaa", solution.restoreData("gtxgtxzg3z8g4txz3g3z"));
	}

	/**
	 * This edgecase is when there are 10 or more of a given character in the
	 * plaintext.
	 * @author Duncan Nam
	 */
	@Test
	public void edgecase1() {
		Challenge4 solution = new Challenge4();
		assertEquals("tttttttttttttgggggcat", solution.restoreData("13g5txzg"));
	}

	/**
	 * This edgecase is when there is a 0 in the ciphertext
	 * @author Duncan Nam
	 */
	@Test
	public void edgecase2() {
		Challenge4 solution = new Challenge4();
		assertEquals("atgcgcat", solution.restoreData("zgt0gxtxzg"));
	}

	/**
	 * This edgecase is when there is an integer at the end of the ciphertext
	 * @author Duncan Nam
	 */
	@Test
	public void edgecase3() {
		Challenge4 solution = new Challenge4();
		assertEquals("atgcgcat", solution.restoreData("zgtxtxzg5"));
	}
}