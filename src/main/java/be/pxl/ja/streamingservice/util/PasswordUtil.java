package be.pxl.ja.streamingservice.util;

public class PasswordUtil {

	private static final String SPECIAL_CHARACTERS = "~!@#$%^&*()_-";
	/*private static final String NUMBERS = "1234567890";
	private static final String KLEINE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
	private static final String GROTE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";*/

	public static int calculateStrength(String password) {
		int score = 0;

		if (password.length() < 6) {
			score = 0;
		}
		else if (password.length() <= 10) {
			score += 1;
			if (password.contains("[0-9]")) {
				score += 2;
			}
			else if (password.contains("[a-z]")) {
				score += 2;
			}
			else if (password.contains("[A-Z]")) {
				score += 2;
			}
			else if (password.contains(SPECIAL_CHARACTERS)) {
				score += 2;
			}
		}
		else {
			score += 2;
			if (password.contains("[0-9]")) {
				score += 2;
			}
			else if (password.contains("[a-z]")) {
				score += 2;
			}
			else if (password.contains("[A-Z]")) {
				score += 2;
			}
			else if (password.contains(SPECIAL_CHARACTERS)) {
				score += 2;
			}
		}
		return score;
	}
}
