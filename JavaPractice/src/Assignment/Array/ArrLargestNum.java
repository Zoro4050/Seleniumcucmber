package Assignment.Array;

public class ArrLargestNum {

	public static void LargestNum(int a[]) {

		int largest = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] > largest) {
				largest = a[i];
			}
		}
		System.out.println(largest);
	}

	public static void main(String[] args) {
		int num[] = { 12, 33, 4, 66, 75, 74, 24, 22 };
		LargestNum(num);
	}

}
