package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.demoblaze.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement nextButton = driver.findElement(By.cssSelector("button#next2"));

		// List to store device names as strings
		List<String> allDeviceNames = new ArrayList<>();

		// Fetch the device names on the first page
		List<WebElement> PhoneList = driver.findElements(By.cssSelector(".col-lg-9>div .card-title>a"));
		for (WebElement phone : PhoneList) {
			allDeviceNames.add(phone.getText());
		}

		// Loop through subsequent pages
		while (nextButton.isDisplayed()) {
			nextButton.click();
			wait.until(ExpectedConditions.invisibilityOf(nextButton));

			// Fetch the device names on the next page
			List<WebElement> PhnList = driver.findElements(By.cssSelector(".col-lg-9>div .card-title>a"));
			for (WebElement phone : PhnList) {
				allDeviceNames.add(phone.getText());
			}
		}

		// Print the total number of devices and their names
		System.out.println("No. of devices = " + allDeviceNames.size());
		for (String deviceName : allDeviceNames) {
			System.out.println("Device name: " + deviceName);
		}

		driver.close();
	}
}
