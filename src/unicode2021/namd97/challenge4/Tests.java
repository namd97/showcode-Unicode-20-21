/**
 * 
 */
package unicode2021.namd97.challenge4;

import org.junit.*;

import static org.junit.Assert.*;

public class Tests {

	@Test
	public void test1() {
		AttackCleanup solution = new AttackCleanup();

		assertEquals("atgcgcatgcgca", solution.restoreData("zgtxtxzgtxtxz"));
	}

	@Test
	public void test2() {
		AttackCleanup solution = new AttackCleanup();

		assertEquals("tgctgcataaattttttttggggcatttaaa", solution.restoreData("gtxgtxzg3z8g4txz3g3z"));
	}

	/**
	 * This edgecase is when there are 10 or more of a given character in the
	 * plaintext.
	 * @author Duncan Nam
	 */
	@Test
	public void edgecase1() {
		AttackCleanup solution = new AttackCleanup();
		assertEquals("tttttttttttttgggggcat", solution.restoreData("13g5txzg"));
	}

	/**
	 * This edgecase is when there is a 0 in the ciphertext
	 * @author Duncan Nam
	 */
	@Test
	public void edgecase2() {
		AttackCleanup solution = new AttackCleanup();
		assertEquals("atgcgcat", solution.restoreData("zgt0gxtxzg"));
	}

	/**
	 * This edgecase is when there is an integer at the end of the ciphertext
	 * @author Duncan Nam
	 */
	@Test
	public void edgecase3() {
		AttackCleanup solution = new AttackCleanup();
		assertEquals("atgcgcat", solution.restoreData("zgtxtxzg5"));
	}
}