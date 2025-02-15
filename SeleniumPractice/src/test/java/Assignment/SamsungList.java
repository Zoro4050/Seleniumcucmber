package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamsungList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.gsmarena.com/");

		// find samsung and click
		driver.findElement(By.cssSelector("body>#wrapper>div>#body .sidebar>div>ul>li>a")).click();

		// find samsung products links
		List<WebElement> samsunglist = driver.findElements(By.cssSelector(" .makers strong>span"));

		System.out.println("Total number of devices: " + samsunglist.size());

		for (WebElement element : samsunglist) {
			System.out.println("Device name: " + element.getText());
		}
	}

}
