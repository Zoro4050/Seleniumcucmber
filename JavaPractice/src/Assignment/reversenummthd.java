package Assignment;

public class reversenummthd {

	public static void main(String[] args) {
		System.out.println("Reverse Number is " + reversenumber(1234));
	}

	static int reversenumber(int number) {
		int reverse = 0;

		for (; number != 0; number = number / 10) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
		}
		return reverse;
	}
}
