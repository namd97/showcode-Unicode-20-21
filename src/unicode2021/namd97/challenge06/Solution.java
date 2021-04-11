/**
 * 
 */
package unicode2021.namd97.challenge06;

// scored 90%

/**
 * @author Duncan Nam
 *
 */
public class Solution {
	public static int getScore(String[] input) {
		int out = 0;

		int frame = 0;
		int tally = 0;
		for (int pos = 0; pos < input.length; pos++) {

			int conv = convertInput(input[pos]);
			if (frame > 9) {
				break;
			} else if (frame == 9) {
				if (conv >= 0 && conv <= 9) {
					out += conv;
					if (tally < 2) {
						tally++;
					} else {
						tally = 0;
						frame++;
					}
				} else if (conv == -10) {
					out += 10;
					for (int i = tally; i > 0; i--) {
						out -= convertInput(input[pos - i]);
					}
					frame++;
				} else if (conv == 10) {
					out += 10;
					tally = 0;
					frame++;
				}
			} else if (frame >= 0 && frame < 9) {
				if (conv >= 0 && conv <= 9) {
					out += conv;
					if (tally < 1) {
						tally++;
					} else {
						tally = 0;
						frame++;
					}
				} else if (conv == -10) {
					out += 10;
					for (int i = tally; i > 0; i--) {
						out -= convertInput(input[pos - i]);
					}
					tally = 0;
					frame++;
					if (pos + 1 < input.length) {
						out += convertInput(input[pos + 1]);
					}
				} else if (conv == 10) {
					out += 10;
					tally = 0;
					frame++;

					boolean done = false;
					if (pos + 2 < input.length) {
						if (convertInput(input[pos + 2]) == -10) {
							out += 10;
							done = true;
						}
					}
					if (!done) {
						if (pos + 2 < input.length && frame + 1 <= 9) {
							out += convertInput(input[pos + 2]);
						}
						if (pos + 1 < input.length && frame <= 9) {
							out += convertInput(input[pos + 1]);
						}
					}
				}
			}

			/*
			 * int conv = convertInput(input[pos]);
			 * 
			 * if (conv >= 0 && conv <= 9) { out += conv; if (frame == 9) { if (tally < 2) {
			 * tally++; } else { tally = 0; frame++; } } else {
			 * 
			 * } } else if (conv == -10) { out += 10 - convertInput(input[pos - 1]); if (pos
			 * + 1 < input.length) { out += convertInput(input[pos + 1]); } tally = 0;
			 * frame++; } else if (conv == 10) { out += 10; boolean done = false; if (pos +
			 * 2 < input.length) { if (convertInput(input[pos + 2]) == -10 && frame + 2 <=
			 * 9) { out += 10; done = true; } } if (!done) { if (pos + 1 < input.length &&
			 * frame + 1 <= 9) { out += convertInput(input[pos + 1]); } if (pos + 2 <
			 * input.length && frame + 2 <= 9) { out += convertInput(input[pos + 2]); } }
			 * tally = 0; frame++; }
			 */
		}

		return out;
	}

	private static int convertInput(String in) {
		int out = -1;
		switch (in) {
		case "0":
			out = 0;
			break;
		case "1":
			out = 1;
			break;
		case "2":
			out = 2;
			break;
		case "3":
			out = 3;
			break;
		case "4":
			out = 4;
			break;
		case "5":
			out = 5;
			break;
		case "6":
			out = 6;
			break;
		case "7":
			out = 7;
			break;
		case "8":
			out = 8;
			break;
		case "9":
			out = 9;
			break;
		case "/":
			out = -10;
			break;
		case "X":
			out = 10;
			break;
		}
		return out;
	}
}