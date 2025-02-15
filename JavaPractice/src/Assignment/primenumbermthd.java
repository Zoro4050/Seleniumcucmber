package Assignment;

public class primenumbermthd {

	public static void main(String[] args) {
		primenumber(2, 66);
	}

	static void primenumber(int x, int y) {
		for (int i = x; i <= y; i++) {
			boolean prime = true;
			/*
			 * if number in non prime i.e. it is divisible by any number between 2 and i-1
			 * then boolean = false
			 */
			if (i != 1) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						prime = false;
					}
				}

				if (prime == true) {
					System.out.println(i);
				}
			}
		}
	}
}
