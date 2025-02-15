package day2.variables;
/**
 * Author: Saurabh Warungse
 * Date  : 5/07/24
 * Purpose: Calculate Area of circle,triangle and simple interest **/
public class todoArea {
        //global variable	
		int b,h,rad;
		double p,r,t;
	    final float pi=3.142f;
	    static char name;
	
	public static void main(String[] args) {
		
		 System.out.println("program start");
		 double triangle,circle,simple;
		 todoArea area1 = new todoArea();       //object declaration and initialization
		 area1.b=20;							//base initialization
		 area1.h=50;							//height initialization
		 
		 //area of triangle
		 triangle=(0.5)*area1.b*area1.h;
		 System.out.println("\nArea of triangle = " +triangle);
		 
		 //area of circle
		 area1.rad=5;
		 
		 circle=area1.pi*area1.rad*area1.rad;
		 System.out.println("Area of circle = " +circle);
		//simple interest
		 area1.r=0.25;
		 area1.p=5000;
		 area1.t=2;
		 
		 simple=area1.r*area1.p*area1.t;
		 System.out.println("Simple Interest = " +simple);
		 
		 //global variable initialization
		 name='s';

		 System.out.println("global variable = " +name);
		 System.out.println("\nprogram ends");
	}

}
