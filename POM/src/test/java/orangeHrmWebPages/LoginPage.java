package orangeHrmWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class LoginPage extends SeleniumUtil {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement usernameInputField;

	@FindBy(name = "password")
	private WebElement passwordInputField;

	@FindBy(css = ".orangehrm-login-button")
	private WebElement loginButton;

	/**
	 * @return the usernameInputField
	 */
	public WebElement getUsernameInputField() {
		return usernameInputField;
	}

	/**
	 * @return the passwordInputField
	 */
	public WebElement getPasswordInputField() {
		return passwordInputField;
	}

	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return loginButton;
	}

	public void loginIntoOrangeHrm(String username, String password) {
		typeRequiredInput(usernameInputField, username);
		typeRequiredInput(passwordInputField, password);
		clickOnElement(loginButton);
	}
}
