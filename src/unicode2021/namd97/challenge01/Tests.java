/**
 * 
 */
package unicode2021.namd97.challenge01;

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

	/**
	 * 2 Pts | Can encrypt messages in lower case
	 */
	@Test
	public void hiddentest1() {
		Cipher solution = new Cipher();

		assertEquals("beo bs bfhibk", solution.halliday("orb of osuvox"));
	}

	/**
	 * 2 Pts | Can encrypt messages in mixed case
	 */
	@Test
	public void hiddentest2() {
		Cipher solution = new Cipher();

		assertEquals("bEo bS bFhIbK", solution.halliday("oRb oF oSuVoX"));
	}

	/**
	 * 2 Pts | Can reverse itself.
	 */
	@Test
	public void hiddentest3() {
		Cipher solution = new Cipher();

		assertEquals("Crystal Key", solution.halliday("Pelfgny Xrl"));
	}

	/**
	 * 3 Pts | Handles Fragment 1
	 */
	@Test
	public void hiddentest4() {
		Cipher solution = new Cipher();

		assertEquals("eb** 237", solution.halliday("ro** 237"));
	}

	/**
	 * 3 Pts | Handles Fragment 2
	 */
	@Test
	public void hiddentest5() {
		Cipher solution = new Cipher();
		
		//// The original fragment
		//assertEquals("Nabenx? $ zvyyvbaf?!", solution.halliday("An**ak? $ mil**ons?!"));
		
		//// corrected where necessary
		assertEquals("Nabenx? $ zvyyvbaf?!", solution.halliday("Anorak? $ millions?!"));
	}

	/**
	 * 3 Pts | Handles Fragment 3
	 */
	@Test
	public void hiddentest6() {
		Cipher solution = new Cipher();
		
		//// The original fragment
		//assertEquals("+- gur_qvfgenpgrq_ty******", solution.halliday("+- the_distracted_globe -+"));
		
		//// corrected where necessary
		assertEquals("+- gur_qvfgenpgrq_tybor -+", solution.halliday("+- the_distracted_globe -+"));
	}
}