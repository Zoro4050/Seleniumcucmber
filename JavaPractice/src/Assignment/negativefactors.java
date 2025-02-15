package Assignment;

public class negativefactors {

	public static void main(String[] args) {
		int num = -20;
		int i = num;
//	//if modulus of given number is zero with number between (-num to num) then it is a factor.
		while (i <= -(num)) {
			if (i == 0) {
//				i++;
//				continue;
			}

			else {

				if (-(num) % i == 0) {
					System.out.print(i + " ");

				}
			}
			++i;
		}
		// question- why while loop is not printing +ve values

//	for(int i=num;i<= -(num);++i) {
//		if(i==0) {
//			continue;}
//			
//			else {
//				
//			if(num%i==0) {
//			System.out.print(i+ " ");
//			}	
//			}
//	}
	}

}
