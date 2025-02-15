package Array;

public class CopyElementsOfArrayToOtherArray {

	public static void main(String[] args) {
		int Or[] = { 1, 2, 3, 4, 5 };

		int[] Co = new int[Or.length];

		for (int i = 0; i < Or.length; i++) {
			Co[i] = Or[i];
		}

		for (int a : Or) {
			System.out.println("Original Array :" + a);
		}

		for (int b : Co) {
			System.out.println("Copied Array :" + b);
		}
	}
}
