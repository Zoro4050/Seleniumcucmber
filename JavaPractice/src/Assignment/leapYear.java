package Assignment;

public class leapYear {

	public static void main(String[] args) {
		int year=2024;
		boolean leap=false;
		//Checking if year is divisible by 4
		if (year%4==0) {
			//check if divisible by 100
			if (year%100==0) {
			//check if divisible by 400	
				if (year%400==0) {
					leap=true;
				} else {
					leap=false;
				}
			} else {
					leap=true;
			}
		} else {
			leap=false;
		}
		if (leap==true) {
			System.out.println(year+" is a leap year");
		} else {
			System.out.println(year+" is not a leap year");
		}
	}

}
