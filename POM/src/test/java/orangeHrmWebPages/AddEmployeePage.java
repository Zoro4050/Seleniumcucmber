package orangeHrmWebPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class AddEmployeePage extends SeleniumUtil {

	public AddEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// FirstName
	@FindBy(name = "firstName")
	private WebElement firstNameInputField;
	// LastName
	@FindBy(name = "lastName")
	private WebElement lastNameInputField;
	// Employee ID
	@FindBy(xpath = "//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement epmloyeeIdInputField;
	// Save button
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButtonOnAddEmployeePage;

	// Function: addEmployee
	public void createEmployee(String firstName, String lastName, int empId) {
		typeRequiredInput(firstNameInputField, firstName);
		typeRequiredInput(lastNameInputField, lastName);
		setSleepTime(2000);
		getActitveElement().sendKeys(Keys.TAB, Keys.BACK_SPACE);
		waitForElementToBeVisible(epmloyeeIdInputField);
		typeRequiredInput(epmloyeeIdInputField, String.valueOf(empId));
		setSleepTime(2000);
		clickOnElement(saveButtonOnAddEmployeePage);
		setSleepTime(2000);
	}
}
