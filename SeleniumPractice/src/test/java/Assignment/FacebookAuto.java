package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAuto {

	public static void main(String[] args) {
		// create webdriver instance

		WebDriver driver = new ChromeDriver();

		// get url
		driver.get("https://www.facebook.com/login/");

		// get page title

		String title = driver.getTitle();
		String extitle = "Log in to Facebook";

		System.out.println(extitle.equals(title));

		driver.close();
	}

}
