package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		// tricentis
//		WebDriver Tdriver = new ChromeDriver();
//		Tdriver.get("https://demowebshop.tricentis.com/login");
//		Tdriver.manage().window().maximize();
//
//		Tdriver.findElement(By.id("Email")).sendKeys("tester01@vomoto.com");
//		Tdriver.findElement(By.id("Password")).sendKeys("Abc@12345");
//
//		Tdriver.findElement(By.cssSelector(".login-button")).click();
//
//		WebDriverWait wait = new WebDriverWait(Tdriver, Duration.ofSeconds(20));
//		WebElement logout = Tdriver.findElement(By.className("ico-logout"));
//
//		wait.until(ExpectedConditions.elementToBeClickable(logout));
//		logout.click();
//		Tdriver.close();

		// sauce demo
		WebDriver Sdriver = new ChromeDriver();
		Sdriver.get("https://www.saucedemo.com/");
		Sdriver.manage().window().maximize();

		Sdriver.findElement(By.id("user-name")).sendKeys("standard_user");
		Sdriver.findElement(By.id("password")).sendKeys("secret_sauce");
		Sdriver.findElement(By.id("login-button")).click();
		Sdriver.findElement(By.id("react-burger-menu-btn")).click();

		WebDriverWait wait = new WebDriverWait(Sdriver, Duration.ofSeconds(20));

		WebElement button = Sdriver.findElement(By.id("logout_sidebar_link"));

		wait.until(ExpectedConditions.elementToBeClickable(button));

		button.click();
		Sdriver.close();
	}

}
