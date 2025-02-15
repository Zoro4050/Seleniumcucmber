package day1.browserinstance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWay {

	public static void main(String[] args) {
		// Generic way of opening web browsers using WebDriver class

		WebDriver driver1 = new ChromeDriver();
//		WebDriver driver2 = new FirefoxDriver(); no FireFox in my system
		WebDriver driver3 = new EdgeDriver();
	}

}
