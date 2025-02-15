package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phonelist {

	public static void main(String[] args) {
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		chrome.get("https://www.gsmarena.com/");

		// identify phone list
		List<WebElement> phnlist = chrome.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));

		System.out.println("Total number of phones :" + phnlist.size());

		for (int i = 0; i < phnlist.size(); i++) {
			System.out.println("Device name:" + phnlist.get(i).getText());
		}
	}

}
