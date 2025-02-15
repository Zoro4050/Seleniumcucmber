package Array;

public class twoDimensionalArray {

	public static void main(String[] args) {
		// Declaring two dimensional array

		// approach 1
//		int[][] a = new int[2][3];
//		int a[][] = new int[2][3];
		int[] a[] = new int[2][3];

		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;

		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;

		// approach 2
		int b[][] = { { 1, 1, 3 }, { 1, 1, 1 } };

		// Finding length of array rows and columns
		System.out.println("Rows" + b.length);
		System.out.println("Column" + b[0].length);

		// read single value form array
		System.out.println(b[1][2]);

		// reading all elements of array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}

		// for each loop

		for (int[] r : b) {
			for (int c : r) {
				System.out.println(c);
			}
		}
	}
}