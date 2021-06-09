/**
 * 
 */
package unicode2021.namd97.challenge04;

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
	 * plaintext. this was written for testing during implementation.
	 * 
	 * @author Duncan Nam
	 */
	public void edgecase1() {
		AttackCleanup solution = new AttackCleanup();
		assertEquals("tttttttttttttgggggcat", solution.restoreData("13g5txzg"));
	}

	/**
	 * This edgecase is when there is a 0 in the ciphertext. this was written for
	 * testing during implementation.
	 * 
	 * @author Duncan Nam
	 */
	public void edgecase2() {
		AttackCleanup solution = new AttackCleanup();
		assertEquals("atgcgcat", solution.restoreData("zgt0gxtxzg"));
	}

	/**
	 * This edgecase is when there is an integer at the end of the ciphertext. this
	 * was written for testing during implementation.
	 * 
	 * @author Duncan Nam
	 */
	public void edgecase3() {
		AttackCleanup solution = new AttackCleanup();
		assertEquals("atgcgcat", solution.restoreData("zgtxtxzg5"));
	}

	/**
	 * 6 Pts | Successfully decodes genetic data 3
	 */
	@Test
	public void hiddentest1() {
		AttackCleanup solution = new AttackCleanup();

		assertEquals("cgtctcctgaccccagagcaggtcgtggcaatcgcgagcaataacggcggaaaacaggctttggaaacggtgcagaggctccttccagtgctgtgccaagcgcacggactcaccccagagcaggtcgtggcgatcgcaagccacgacggaggaaagcaagccttggaaacagtacagaggctgttgcctgtgctgtgccaagcgcacggcctcaccccagagcaggtcgtggcaatcgcctccaacattggcgggaaacaggcactcgagactgtccagcgcctgcttcccgtgctgtgccaagcgcacggattaaccccagagcaggtcgtggccattgcctcgaatggagggggcaaacaggcgttggaaaccgtacaacgattgctgccggtgctgtgccaagcgcacggcttaagagacg",
				solution.restoreData(""));
	}

	/**
	 * 5 Pts | Successfully decodes genetic data with no repeats
	 */
	@Test
	public void hiddentest2() {
		AttackCleanup solution = new AttackCleanup();

		assertEquals("atgcagtctacg",
				solution.restoreData("zgtxztgxgzxt"));
	}

	/**
	 * 1 Pts | An empty input results in an empty output
	 */
	@Test
	public void hiddentest3() {
		AttackCleanup solution = new AttackCleanup();

		assertEquals("", solution.restoreData(""));
	}

	/**
	 * 3 Pts | Check that non alpha-numeric characters are stripped
	 */
	@Test
	public void hiddentest4() {
		AttackCleanup solution = new AttackCleanup();

		assertEquals("tgctgcataaattttttttggggcatttaaa", solution.restoreData("gtx(gt)xzg__3z8g4t@@xz3-g3z"));
	}
}