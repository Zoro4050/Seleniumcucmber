package Assignment;

public class posnegfactor {

	public static void main(String[] args) {
		int num = 10;

		if (num <= 0) {// if number is negative
			System.out.println("Factors of number  " + num + " are :");
			for (int i = num; i <= -(num); ++i) {
				if (i != 0) {
					if (num % i == 0) {
						System.out.print(i + ",");
					}
				}
			}
		} else {// when number is positive
			System.out.println("Factors of number " + num + " are :");
			for (int i = 1; i <= num; ++i) {
				if (num % i == 0) {
					System.out.print(i + ",");
				}
			}
		}

	}

}
