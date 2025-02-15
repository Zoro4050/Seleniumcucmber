package Assignment;

public class digitsInInteger {

	public static void main(String[] args) {
		int count=0,num=12345;
		for (;num!=0;++count) {
			num=num/10;
	}
		System.out.println("Number of digits: " +count);
}
}