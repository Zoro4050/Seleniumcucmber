package Assignment.Array;

public class ArrLowestnum {
	public static void LowestNum(int a[]) {

		int lowest = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] < lowest) {
				lowest = a[i];
			}
		}
		System.out.println(lowest);
	}

	public static void main(String[] args) {
		int num[] = { 12, 33, 4, 66, 75, 74, 24, 22 };
		LowestNum(num);
		// number of elements in array
		System.out.println("Number of elements in array : " + num.length);
	}

}
