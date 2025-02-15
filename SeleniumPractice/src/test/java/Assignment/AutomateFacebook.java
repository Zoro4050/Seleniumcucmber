package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomateFacebook {

	public static void main(String[] args) {
		// create instance of Edge browser
		WebDriver facedriver = new EdgeDriver();

		// open Facebook
		facedriver.get("https://www.facebook.com");

		// Get home page title, verify title, print title
		String title = facedriver.getTitle();
		String expectedtitle = "Facebook – log in or sign up";
		System.out.println("Current Page is Facebook ?" + title.equals(expectedtitle));
		System.out.println("Homepage title is : " + title);

		// close browser
		facedriver.close();
	}

}
