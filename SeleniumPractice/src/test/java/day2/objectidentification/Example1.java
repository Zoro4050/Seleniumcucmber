package day2.objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		// create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();

		// open https://online.actitime.com/uts/login.do login page
		driver.get("https://online.actitime.com/uts/login.do");

		// identify user name field and perform operation
		WebElement usernameInputField = driver.findElement(By.id("username"));
		usernameInputField.sendKeys("admin01");

		// identify password field and perform operation
		WebElement passwordInputField = driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys("admin01");

		// identify login button and perform operation
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();

		// identify logout button and perform logout operation
		WebElement logoutbutton = driver.findElement(By.id("logoutLink"));
		logoutbutton.click();
		// DOUBT logout not working
	}

}
