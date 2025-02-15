package Assignment.String;

public class ReversePreservingSpace {

	public static void main(String[] args) {

	}

	public static String ReverseKeepSpace(String str) {

		char[] c = str.toCharArray();

		StringBuilder noSpace = new StringBuilder();
		int index = 0;
		for (char chr : c) {
			if (chr != ' ')
				noSpace.append(chr);
		}
		noSpace.reverse();

		StringBuilder result = new StringBuilder();
		for (char chr : c) {
			if (chr == ' ') {
				result.append(chr);
			} else {
				result.append(noSpace.charAt(index++));
			}
		}

		return result.toString();
	}
}
