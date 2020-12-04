package be.pxl.ja.streamingservice.model;

public class PasswordUtil {

	private static final String SPECIAL_CHARACTERS = "~!@#$%^&*()_-";
	//private static final String NUMBERS = "0123456789";
	//private static final String SMALL_LETTERS = "abcdefghijklmnopqrstuvwxyz";
	// private static final String CAPITAL_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static int calculateStrength(String password) {
		int score = 0;
		if (password.length() < 6) {
			return 0;
		}
		if (password.length() >= 10) {
			score += 2;

		} else {
			score += 1;
		}

		boolean hasDigit = false;
		boolean hasLowerCase = false;
		boolean hasUpperCase = false;
		boolean hasSpecialCharacter = false;

		for (int i = 0; i < password.length(); i++) {
			char character = password.charAt(i);
			hasDigit = hasDigit || Character.isDigit(character);
			hasLowerCase = hasLowerCase || Character.isLowerCase(character);
			hasUpperCase = hasUpperCase || Character.isUpperCase(character);
			hasSpecialCharacter = hasSpecialCharacter || SPECIAL_CHARACTERS.contains(String.valueOf(character));
		}

		if (hasDigit) {
			score += 2;
		}
		if (hasLowerCase) {
			score += 2;
		}
		if (hasUpperCase) {
			score += 2;
		}
		if (hasSpecialCharacter) {
			score += 2;
		}
		return score;
	}

}


