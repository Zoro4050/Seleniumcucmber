package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemowebshopObjInspection {

	public static void main(String[] args) {
		// create instance of Chrome and open demowebshop
		WebDriver shopDriver = new ChromeDriver();
		shopDriver.get("https://demowebshop.tricentis.com/login");
		// implicit wait
		shopDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// locate email input field and perform operation
		shopDriver.findElement(By.id("Email")).sendKeys("tester01@vomoto.com");

		// locate Password input field and perform operation
		shopDriver.findElement(By.id("Password")).sendKeys("Abc@12345");

		// locate Login button and perform operation
		shopDriver.findElement(By.className("button-1 login-button")).click();

		// locate logout button and perform operation
		shopDriver.findElement(By.className("ico-logout")).click();
	}

}
