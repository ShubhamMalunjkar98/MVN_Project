package pages;

public class AlphaDigitSpecial {
	String str = "abcjdj2334djn!##$";

	public void alphabet() {

		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (Character.isAlphabetic(ch)) {
				System.out.println("Alphabetic=>" + ch);
			}
		}
	}

	public void digit() {
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				System.out.println("Digit=>" + ch);
			}
		}
	}

	public void special() {
		for (int i = 0; i < str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (!Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
				System.out.println("Special symbol=>" + ch);
			}
		}
	}

	public static void main(String[] args) {
		AlphaDigitSpecial obj = new AlphaDigitSpecial();
		obj.alphabet();
		obj.digit();
		obj.special();
	}

}
