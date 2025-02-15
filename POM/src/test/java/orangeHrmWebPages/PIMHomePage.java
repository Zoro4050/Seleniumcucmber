package orangeHrmWebPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class PIMHomePage extends SeleniumUtil {

	public PIMHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".orangehrm-header-container>button")
	private WebElement addButton;

	@FindBy(xpath = "//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement employeeIdInputField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchButtonOnPimPage;

	@FindBy(css = ".orangehrm-vertical-padding>span")
	private WebElement searchResultCountMsg;

	@FindBy(css = ".oxd-table-body>div:nth-child(1) label")
	private WebElement firstEmpCheckBox;

	@FindBy(css = ".oxd-table-body>div:nth-child(1) .bi-pencil-fill")
	private WebElement firstEmpEditSymbol;

	@FindBy(css = ".oxd-table-body>div:nth-child(1) .bi-trash")
	private WebElement firstEmpDeleteSymbol;

	@FindBy(css = ".orangehrm-modal-footer>button:nth-of-type(2)")
	private WebElement yesButtonOnConfirmationPopup;

	@FindBy(css = ".oxd-table-card>div>div>div")
	private List<WebElement> firstEmpDetailList;

	// Function: clickOn Add button
	public void clickOnAddButton() {
		clickOnElement(addButton);
	}

	// Function: search employee
	public void searchCreatedEmployee(int employeeId) {
		typeRequiredInput(employeeIdInputField, String.valueOf(employeeId));
		setSleepTime(2000);
		clickOnElement(searchButtonOnPimPage);
		setSleepTime(2000);
	}

	// Function: getSearchResultMsg
	public String getSearchResultMsg() {
		isElementPresent(searchResultCountMsg);
		setSleepTime(2000);
		return getTextFromElement(searchResultCountMsg);
	}

	// Function: deleteCreatedEmployee
	public void deleteCreatedEmployee() {
		clickOnElement(firstEmpCheckBox);
		clickOnElement(firstEmpDeleteSymbol);
		clickOnElement(yesButtonOnConfirmationPopup);
	}

	// Function: clickOnEditSymbolOfCreatedEmployee
	public void clickOnEditOfCreatedEmployee() {
		clickOnElement(firstEmpCheckBox);
		clickOnElement(firstEmpEditSymbol);
	}

	// Function: getJobTitleOfSearchedEpmloyee
	public String getJobTitleOfSearchedEmployee() {
		String Title = firstEmpDetailList.get(4).getText();
		return Title;
	}
}
