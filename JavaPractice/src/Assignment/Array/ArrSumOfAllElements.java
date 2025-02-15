package Assignment.Array;

public class ArrSumOfAllElements {

	public static void Arraysum(int a[]) {

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("Sum of all the items of Array : " + sum);
	}

	public static void main(String[] args) {
		int num[] = { 12, 33, 4, 66, 75, 74, 24, 22 };
		Arraysum(num);
	}

}
