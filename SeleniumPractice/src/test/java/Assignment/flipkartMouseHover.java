package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartMouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.flipkart.com/account/orders");

		Actions mouse = new Actions(driver);

		// locate menue bar
		List<WebElement> menubarlist = driver.findElements(By.cssSelector(".bpjkJb>*"));
		System.out.println("Number of options: " + menubarlist.size());

		for (int i = 0; i < menubarlist.size(); i++) {

			mouse.moveToElement(menubarlist.get(i)).perform();
		}
	}

}
