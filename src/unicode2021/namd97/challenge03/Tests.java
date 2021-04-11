/**
 * 
 */
package unicode2021.namd97.challenge03;

import org.junit.*;

import static org.junit.Assert.*;

public class Tests {

	@Test
	public void test1() {
		Solution solution = new Solution();

		assertEquals("JoeBloggs", solution.getRecipient("@JoeBloggs yo", 1));
	}

	@Test
	public void test2() {
		Solution solution = new Solution();

		assertEquals("FredBloggs", solution.getRecipient("Hey @Joe_Bloggs what time are we meeting @FredBloggs?", 2));
	}

	/**
	 * This edgecase is when an email is input
	 * @author Duncan Nam
	 */
	@Test
	public void edgecase1() {
		Solution solution = new Solution();

		assertEquals("FredBloggs",
				solution.getRecipient("@Joe_Bloggs, send me an email at fred@bloggs.co.uk. I'm @FredBloggs", 2));
	}
}