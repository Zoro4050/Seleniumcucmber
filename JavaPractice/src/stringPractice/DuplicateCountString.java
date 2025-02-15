package stringPractice;

public class DuplicateCountString {

	public static void Ducount(String inp) {

		inp = inp.replaceAll("\\s", "");

		String counted = "";

		for (int i = 0; i < inp.length(); i++) {
			char c = inp.charAt(i);
			if (counted.indexOf(c) != -1) {
				continue;
			}
			int count = 0;

			for (int j = 0; j < inp.length(); j++) {
				if (inp.charAt(j) == c) {
					count++;
					counted += c;
				}
			}

			if (count > 1) {
				System.out.println(c + ":" + count);
			}
		}
	}

	public static void main(String[] args) {
		Ducount("bet but");

	}

}
