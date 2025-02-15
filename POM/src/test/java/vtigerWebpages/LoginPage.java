package vtigerWebpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class LoginPage extends SeleniumUtil {

	// username field
	@FindBy(id = "username")
	WebElement usernamefield;
	// password field
	@FindBy(id = "password")
	WebElement passwordfield;
	// login button
	@FindBy(xpath = "//button[text()='Sign in']")
	WebElement loginButton;

	// Function login into Vtiger
	public void loginIntoVtiger() {
		clickOnElement(loginButton);
	}

	// initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
