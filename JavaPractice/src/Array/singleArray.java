package Array;

public class singleArray {

	public static void main(String[] args) {
		// Declaring array
		int[] a = new int[5];
		a[0] = 8;
		a[1] = 8;
		a[2] = 8;
		a[3] = 8;
		a[4] = 8;

		// other way to declare an array
		int b[] = { 1, 3, 4, 5 };

		// length of an array
		System.out.println(b.length);

		// read single value from array
		System.out.println(b[2]);

		// printing an array normal loop

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		// enhanced loop
		for (int y : a) {
			System.out.print(y);
		}

	}

}
