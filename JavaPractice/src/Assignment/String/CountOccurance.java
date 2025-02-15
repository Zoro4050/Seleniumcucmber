package Assignment.String;

import java.util.Scanner;

public class CountOccurance {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter String:");

		String s1 = scr.nextLine();
		countoccurance(s1);
		scr.close();
	}

	public static void countoccurance(String str) {
		str = str.replaceAll("\\s", "");

		String counted = "";
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if (counted.indexOf(c) != -1) {// -1 doubt
				continue;
			}
			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == c) {
					count++;
					counted += c;
				}

			}
			if (count > 0) {
				System.out.println(c + " : " + count);
			}

		}
	}
}
