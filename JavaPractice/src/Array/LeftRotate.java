package Array;

public class LeftRotate {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int n = 2;

		for (int i = 0; i < n; i++) {

			int first = array[0], j;

			for (j = 0; j < array.length - 1; j++) {
				array[j] = array[j + 1];
			}
			array[j] = first;
		}

		for (int a : array) {
			System.out.println(a);
		}
	}
}
