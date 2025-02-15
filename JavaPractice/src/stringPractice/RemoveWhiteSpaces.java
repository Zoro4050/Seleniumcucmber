package stringPractice;

public class RemoveWhiteSpaces {

	public static String remove(String input) {
		return input.replaceAll("\\s", "");
	}

	public static void main(String[] args) {

		System.out.println(remove(" Saurabh Warungse is legend ."));
	}

}
