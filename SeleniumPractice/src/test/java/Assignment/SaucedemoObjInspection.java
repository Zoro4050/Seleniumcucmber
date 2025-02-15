package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaucedemoObjInspection {

	public static void main(String[] args) {
		// create chrome driver instanace and open Saucedemo
		WebDriver cdriver = new ChromeDriver();
		// implicit wait
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		cdriver.get("https://www.saucedemo.com/");

		// identify and perform operation on username field
		cdriver.findElement(By.id("user-name")).sendKeys("standard_user");

		// identify and perform operation on password field
		cdriver.findElement(By.id("password")).sendKeys("secret_sauce");

		// identify and perform operation on login button
		cdriver.findElement(By.id("login-button")).click();

		// identify and perform operation on logout button
		cdriver.findElement(By.id("react-burger-menu-btn")).click();
		cdriver.findElement(By.linkText("Logout")).click();
		// DOUBT logout not working

	}

}
