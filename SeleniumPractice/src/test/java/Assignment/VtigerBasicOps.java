package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerBasicOps {

	public static void main(String[] args) {
		// create an instance of Chrome Browser
		WebDriver Vdriver = new ChromeDriver();

		// enter Vtiger URL
		Vdriver.get("https://demo.vtiger.com/");

		// Get Page title and Page title length
		String Pagetitle = Vdriver.getTitle();
		System.out.println("Page title is :" + Pagetitle);
		System.out.println("Page title lenght is :" + Pagetitle.length());

		// Get Page URL
		String pageURL = Vdriver.getCurrentUrl();
		System.out.println("Current page URL is :" + pageURL);
		String validation = "https://www.vtiger.com/crm-demo/";
		System.out.println("Vtiger demo site status ? :" + pageURL.equals(validation));

		// Get Source code length
		String pageSource = Vdriver.getPageSource();
		System.out.println("Length of Page SourceCode : " + pageSource.length());

		// Close Browser
		Vdriver.close();
	}

}
