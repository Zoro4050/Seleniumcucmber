package Assignment.Array;

public class ArrRotateleft1 {
	public static void lefttrotate(int a[], int rotation) {

		for (int j = 0; j < rotation; j++) {
			int first = a[0];
			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			a[a.length - 1] = first;
		}
	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5 };
		// calling rotate right method
		lefttrotate(num, 1);
		for (int arr : num) {
			System.out.print(arr);
		}
	}

}
