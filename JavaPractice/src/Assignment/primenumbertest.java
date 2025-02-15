package Assignment;

public class primenumbertest {

	public static void main(String[] args) {
		int num=13;
		boolean nonprime=false;
		//if modulus for the given number when divided by  numbers between 2 to n-1 is zero then its non prime.
		for(int i=2;i<num;i++) {
		//checking modulus if it hits zero for any number between 2 to n-1 then flag is set to true.
			if (num%i==0) {
				nonprime=true;
//				break;
			}
		}
		if (nonprime==false) {
			System.out.println(num+ " is prime number");
		} else {
			System.out.println(num+ " is non prime number");

		}

	}

}
