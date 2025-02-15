package Assignment;

public class largestNum {

	public static void main(String[] args) {
		//finding largest number among 3 number
		
		int a=23,b=56,c=99;
		//comparing 3 numbers
		if (a>=b&&a>=c) {
			System.out.println(a+" is the largest num");}
			else if (b>=a&&b>=c) {
				System.out.println(b+" is the largest num");}
				else {
					System.out.println(c+" is the largest num");
				}

}
}