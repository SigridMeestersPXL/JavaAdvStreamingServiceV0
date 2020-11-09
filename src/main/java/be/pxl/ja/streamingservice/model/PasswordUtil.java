package be.pxl.ja.streamingservice.model;

public class PasswordUtil {

	private static final String SPECIAL_CHARACTERS = "~!@#$%^&*()_-";

	public static int calculateStrength(String password) {
		int score = 0;
		if (password.length() < 6) {
			return score;
		} else if (password.length() <= 10) {
			score = 1;
			if (password.contains("[0-9]")) {
				score += 2;
			}
			if (password.contains("[a-z]")) {
				score += 2;
			}
			if (password.contains("[A-Z]")) {
				score += 2;
			}
			if (password.contains(SPECIAL_CHARACTERS)) {
				score += 2;
			}
			return score;
		} else if (password.length() > 10) {
			score = 2;
			if (password.contains("[0-9]")) {
				score += 2;
			}
			if (password.contains("[a-z]")) {
				score += 2;
			}
			if (password.contains("[A-Z]")) {
				score += 2;
			}
			if (password.contains(SPECIAL_CHARACTERS)) {
				score += 2;
			}
			return score;
		}
		return score;
	}
}
