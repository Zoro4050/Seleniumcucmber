package Assignment.Array;

public class ArrPrintEven {

	public static void Printreven(int a[]) {

		// for even position
		System.out.print("Even Position :");
		for (int i = 1; i < a.length; i++) {

			if (i % 2 == 0) {
				System.out.print(a[i] + ",");
			}
		}

		// for odd position
		System.out.print("\nOdd position : ");
		for (int i = 1; i < a.length; i++) {

			if (i % 2 != 0) {
				System.out.print(a[i] + ",");
			}
		}

	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5, 5, 3 };
		Printreven(num);
	}

}
