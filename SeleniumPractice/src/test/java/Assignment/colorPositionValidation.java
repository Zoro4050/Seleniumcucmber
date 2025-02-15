package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class colorPositionValidation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://online.actitime.com/uts/login.do");

		// click on login button without entering password and username
		WebElement enterButton = driver.findElement(By.cssSelector("#loginButton"));
		enterButton.click();
		System.out.println("is login button displayed? " + enterButton.isDisplayed());// is visible
		System.out.println("is login button functional? " + enterButton.isEnabled()); // is functional
		System.out.println("login button text = " + enterButton.getText()); // text
		System.out.println("login button color code in rgba = " + enterButton.getCssValue("color")); // button color
		System.out.println("login button font family = " + enterButton.getCssValue("font-family")); // font family

		enterButton = driver.findElement(By.cssSelector("#loginButton"));
		System.out.println("login button font size = " + enterButton.getCssValue("font-size")); // font-size

		// locate error message and perform validations
		WebElement errormsg = driver.findElement(By.cssSelector("#ServerSideErrorMessage .errormsg"));
		System.out.println("is error msg displayed? " + errormsg.isDisplayed());// is visible
		System.out.println("is error msg functional? " + errormsg.isEnabled()); // is enable
		System.out.println("Error msg color in rgba code = " + errormsg.getCssValue("color")); // error msg color
		System.out.println("Error msg font family = " + errormsg.getCssValue("font-family")); // error msg font-family
		System.out.println("Error msg text size = " + errormsg.getCssValue("font-size")); // msg font size
		System.out.println("Error msg text msg = " + errormsg.getText()); // error msg text

		// locatio of username field
		WebElement username = driver.findElement(By.cssSelector(".textFieldsArea #username"));
		Point locUsername = username.getLocation();
		int username_y = locUsername.getY();

		// locatio of error msg
		Point locMsg = errormsg.getLocation();
		int msg_y = locMsg.getY();

		if (msg_y < username_y) {
			System.out.println("Error message is diplyed above username field.");
		} else {
			System.out.println("Error msg is not displayed above username field.");
		}

		// Validate whether check box is on the left side of keep me logged in text.

		// checkbox location
		WebElement checkbox = driver.findElement(By.cssSelector("#keepLoggedInCheckBox"));
		Point locBox = checkbox.getLocation();

		// keep me logged in text location
		WebElement loginText = driver.findElement(By.cssSelector("#keepLoggedInLabel"));
		Point locLoginText = loginText.getLocation();

		if (locBox.getX() < locLoginText.getX()) {
			System.out.println("Yes the checkbox is on the left  side of keep me logged in text.");
		} else {
			System.out.println("No the checkbox is on the left  side of keep me logged in text.");
		}

	}

}
