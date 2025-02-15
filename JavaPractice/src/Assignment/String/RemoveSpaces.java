package Assignment.String;

import java.util.Scanner;

public class RemoveSpaces {

	public static String Space(String str) {
		// remove white spaces
		return str.replaceAll("\\s", "");
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter String:");
		String s1 = scr.nextLine();
		// next() scans only a word, nextLine() scans whole sentence

		String s2 = Space(s1);
		System.out.println("Removed Space :" + s2);
		scr.close();
	}

}
