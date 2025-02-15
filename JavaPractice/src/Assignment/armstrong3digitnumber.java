package Assignment;

public class armstrong3digitnumber {

	public static void main(String[] args) {
		int num=154,anum=0,onum=num;
		
		//modulus of any number when divided by 10 is the last digit of the number	
		for(;num!=0;num/=10) {
		int rmd=num%10;
		
		//calculating armstrong value
		anum= anum + (rmd*rmd*rmd);
		}
		
		if (anum==onum) {
			System.out.println(onum+" is Armstrong number");
		} else {
			System.out.println(onum+" is not an Armstring number");
		}
	}

}
