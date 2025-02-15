package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTitleVerify {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		String HomePageTitle = driver.getTitle();
		System.out.println(HomePageTitle);

		driver.findElement(By.xpath("//a[text()='Amazon Pay']")).click();

		String ActualamazonpayTitle = driver.getTitle();
		System.out.println("Amazon Pay".equals(ActualamazonpayTitle));

		driver.navigate().back();
		System.out.println(HomePageTitle.equals(driver.getTitle()));

		driver.close();

	}

}
