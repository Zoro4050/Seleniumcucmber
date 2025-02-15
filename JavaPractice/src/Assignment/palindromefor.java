package Assignment;
/**
 * @author Saurabh Warungse
 * 
 */
public class palindromefor {

	public static void main(String[] args) {
		int num=123,rnum=0,pnum=num;
		//reverse the given number
		for (;num!=0;num=num/10) {
			int reminder=num%10;
			rnum=rnum*10+reminder;
		}
		//compare the reverse and the given number
		if (pnum==rnum) {
			System.out.println(pnum+" number is  Palindrome");
		} else {
			System.out.println(pnum+" number is not Palindrome");
		}
	}

}
