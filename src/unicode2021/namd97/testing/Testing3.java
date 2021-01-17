/**
 * 
 */
package unicode2021.namd97.testing;

import org.junit.*;
import unicode2021.namd97.challenge.Challenge3;
import static org.junit.Assert.*;

public class Testing3 {

	@Test
	public void test1() {
		Challenge3 solution = new Challenge3();

		assertEquals("JoeBloggs", solution.getRecipient("@JoeBloggs yo", 1));
	}

	@Test
	public void test2() {
		Challenge3 solution = new Challenge3();

		assertEquals("FredBloggs", solution.getRecipient("Hey @Joe_Bloggs what time are we meeting @FredBloggs?", 2));
	}

	/**
	 * This edgecase is when an email is input
	 * @author Duncan Nam
	 */
	@Test
	public void edgecase1() {
		Challenge3 solution = new Challenge3();

		assertEquals("FredBloggs",
				solution.getRecipient("@Joe_Bloggs, send me an email at fred@bloggs.co.uk. I'm @FredBloggs", 2));
	}
}