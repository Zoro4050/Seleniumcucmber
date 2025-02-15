package stringPractice;

public class reverse {

	public static void main(String[] agrs) {

		System.out.println(reversestring("Saurabh"));
	}

	public static String reversestring(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}

		return reversed;
	}
}
