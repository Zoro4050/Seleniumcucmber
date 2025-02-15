package Assignment;

public class positivefactors {

	public static void main(String[] args) {
		int num = 20;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i + " ");
			}
		}

//		while (i<=num) {
//			if(num%i==0) {
//			System.out.print(i +" ");
//			}
//			i++;
//		}

	}

}
