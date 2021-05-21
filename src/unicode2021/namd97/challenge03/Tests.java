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
	 * 1 Pts | Can successfully identify the third user in a three recipient message.
	 */
	@Test
	public void hiddentest01() {
		Solution solution = new Solution();

		assertEquals("Andy_bloggs", solution.getRecipient("hi @Joe_Bloggs and @FredBloggs the @Andy_bloggs", 3));
	}

	/**
	 * 1 Pts | When an invalid character exists within a username, just the valid part of the username should be detected.
	 */
	@Test
	public void hiddentest02() {
		Solution solution = new Solution();

		assertEquals("andy", solution.getRecipient("hello @Joe_bloggs this is @andy!bloggs hi", 2));
	}

	/**
	 * 1 Pts | Can successfully handle an out of bounds recipientNumber parameter.
	 */
	@Test
	public void hiddentest03() {
		Solution solution = new Solution();

		assertEquals("", solution.getRecipient("@Santa I've been good this year, can I get a PS5 like @Userxyz?", 3));
	}

	/**
	 * 1 Pts | Can successfully identify users in a message containing hashtags.
	 */
	@Test
	public void hiddentest04() {
		Solution solution = new Solution();

		assertEquals("tony", solution.getRecipient("#@joe this me @tony #christmas", 2));
	}

	/**
	 * 1 Pts | Can successfully identify an unconventional username.
	 */
	@Test
	public void hiddentest05() {
		Solution solution = new Solution();

		assertEquals("UnCoNVEntinal", solution.getRecipient("hi @joe it's me @UnCoNVEntinal", 2));
	}

	/**
	 * 1 Pts | Can successfully identify a username containing numbers.
	 */
	@Test
	public void hiddentest06() {
		Solution solution = new Solution();

		assertEquals("john01234567890", solution.getRecipient("@joe this is me @john01234567890 hi", 2));
	}

	/**
	 * 1 Pts | Can successfully identify a username containing numbers and special characters.
	 */
	@Test
	public void hiddentest07() {
		Solution solution = new Solution();

		assertEquals("john_doe-00004_doe", solution.getRecipient("@joe it'sa me @john_doe-00004_doe hi", 2));
	}

	/**
	 * 1 Pts | Can successfully identify a username after a URL.
	 */
	@Test
	public void hiddentest08() {
		Solution solution = new Solution();

		assertEquals("andy", solution.getRecipient("@joe go here https://app.showcode.io/ @andy", 2));
	}

	/**
	 * 1 Pts | Can handle an input with no valid recipients.
	 */
	@Test
	public void hiddentest09() {
		Solution solution = new Solution();

		assertEquals("", solution.getRecipient("hi santa it's me", 1));
	}

	/**
	 * 1 Pts | Can handle usernames with a superfluous @ identifier.
	 */
	@Test
	public void hiddentest10() {
		Solution solution = new Solution();

		assertEquals("joe_bloggs", solution.getRecipient("Hi @@joe_bloggs it's me", 1));
	}

	/**
	 * 1 Pts | Can handle an input containing a '@' character and not treat it as a username.
	 */
	@Test
	public void hiddentest11() {
		Solution solution = new Solution();

		assertEquals("", solution.getRecipient("Me @ you were there", 1));
	}

	/**
	 * 2 Pts | Can handle an input containing a valid email address and not treat it is a username.
	 */
	@Test
	public void hiddentest12() {
		Solution solution = new Solution();

		assertEquals("", solution.getRecipient("my email is test@example.com", 1));
	}

	/**
	 * 2 Pts | Can handle an input containing an invalid email address and apply the standard username identification rules to the value.
	 */
	@Test
	public void hiddentest13() {
		Solution solution = new Solution();

		assertEquals("example", solution.getRecipient("my email is test@@example.com", 1));
	}
}