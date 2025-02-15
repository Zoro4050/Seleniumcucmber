package Assignment.Array;

public class ArrRotateRight {
	public static void righttrotate(int a[], int rotation) {

		for (int j = 0; j < rotation; j++) {
			int last = a[a.length - 1];
			for (int i = a.length - 1; i > 0; i--) {
				a[i] = a[i - 1];
			}
			a[0] = last;
		}
	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5 };
		// calling rotate right method
		righttrotate(num, 1);
		for (int arr : num) {
			System.out.print(arr);
		}
	}
}
